package com.TravelBookingApplication;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TravelApplicationRunner  implements CommandLineRunner{
@Autowired
private TravelController travelController;
Scanner sc= new Scanner(System.in);
	@Override
	public void run(String... args) throws Exception {
		int choice;
		 while(true){
			  System.out.println("----------Travel Booking Management---------------------");
			  System.out.println("1. Add a new travel booking.");
			  System.out.println("2. Retrieve all travel bookings.");
			  System.out.println("3. Find a travel booking by ID.");
			  System.out.println("4. Delete a travel booking by ID.");
			  System.out.println("5. Check if a tavel booking exists.");
			  System.out.println("6.Count total travel bookings.");
			  System.out.println("7. Delete a specific travel booking.");
			  System.out.println("8. Delete all travel bookings.");
			  System.out.println("9. Exit");
			  System.out.println("Enter your choice:");
			  choice=sc.nextInt();
			  sc.nextLine();
			  switch(choice) {
			  case 1->travelController.addTravel();
			  case 2->travelController.retrieveAllTravel();
			  case 3->travelController.findTravelById();
			  case 4->travelController.deleteTravelById();
			  case 5->travelController.checkIfTravelExists();
			  case 6->travelController.countTravel();
			  case 7->travelController.deleteTravelObject();
			  case 8->travelController.deleteAllTravel();
			  case 9->System.out.println("Invalid choice. Try again.");
			  }
			  
		 }
		 }
	

}
