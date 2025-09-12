package com.TravelBookingApplication;

import java.util.Optional;

public interface ITravelService {
	void addTravel(Travel travel);
	Iterable<Travel>getAllTravel();
	Optional<Travel>findTravelById(Long id);
	void deleteTravelById(Long id);
	boolean existsById(Long id);
	 long count();
	 void delete(Travel travel);
	 void deleteAll();
}
