package com.TravelBookingApplication;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TravelService  implements ITravelService{
	@Autowired
	private TravelRepository travelRepository;
	
	
	

	@Override
	public void addTravel(Travel travel) {
		travelRepository.save(travel);
	}

	@Override
	public Iterable<Travel> getAllTravel() {
		
		return travelRepository.findAll();
	}

	@Override
	public Optional<Travel> findTravelById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void deleteTravelById(Long id) {
		travelRepository.deleteById(id);
		
	}

	@Override
	public boolean existsById(Long id) {
		
		return travelRepository.existsById(id);
	}

	@Override
	public long count() {
		
		return travelRepository.count();
	}

	@Override
	public void delete(Travel travel) {
		travelRepository.delete(travel);
		
	}

	@Override
	public void deleteAll() {
		travelRepository.deleteAll();
	}

}
