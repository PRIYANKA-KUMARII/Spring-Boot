package com.TravelBookingApplication;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TravelController {
	@Autowired
	private ITravelService travelSerice;
	Scanner sc = new Scanner(System.in);

	public void addTravel() {
		System.out.print("Enter Destination: ");
		String destination = sc.nextLine();

		System.out.print("Enter Transportation Mode: ");
		String mode = sc.nextLine();

		System.out.print("Enter Price: ");
		double price = sc.nextDouble();
		sc.nextLine();

		Travel travel = new Travel(destination, mode, price);
		travelSerice.addTravel(travel);
		System.out.println("Travel booking added successfully.");
	}

	public void retrieveAllTravel() {
		Iterable<Travel> travel = travelSerice.getAllTravel();
		travel.forEach(System.out::println);
	}

	public void findTravelById() {
		System.out.println("Enter ID:");
		Long id = sc.nextLong();
		sc.nextLine();
		Optional<Travel> travel = travelSerice.findTravelById(id);
		travel.ifPresentOrElse(System.out::println, () -> System.out.println("Travel not found."));

	}

	public void deleteTravelById() {
		System.out.println("Enter ID:");
		Long id = sc.nextLong();
		sc.nextLine();

		if (travelSerice.existsById(id)) {
			travelSerice.deleteTravelById(id);
			System.out.println("Travel with ID:" + id + "does not exist.");

		}

	}

	public void checkIfTravelExists() {
		System.out.println("Enter Id:");
		Long id = sc.nextLong();
		sc.nextLine();
		boolean exists = travelSerice.existsById(id);
		System.out.println("EXISTS:" + exists);

	}

	public void countTravel() {
		System.out.println("Total booking:" + travelSerice.count());

	}

	public void deleteTravelObject() {
		System.out.println("Enter ID of travel to delete:");
		Long id = sc.nextLong();
		sc.nextLine();

		Optional<Travel> travel = travelSerice.findTravelById(id);
		if (travel.isPresent()) {
			travelSerice.delete(travel.get());
			System.out.println("Travel object deleted.");
		} else {
			System.out.println("Travel  not found");
		}
	}

	public void deleteAllTravel() {
		travelSerice.deleteAll();
		System.out.println("All travels deleted.");
	}
}