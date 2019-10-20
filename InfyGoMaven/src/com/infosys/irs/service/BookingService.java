package com.infosys.irs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infosys.irs.entity.FlightEntity;
import com.infosys.irs.exception.FlightNotAvailableException;
import com.infosys.irs.exception.PassengerDetailNotFoundException;
import com.infosys.irs.exception.SeatsNotAvaialbleException;
import com.infosys.irs.model.Booking;
import com.infosys.irs.model.Passenger;
import com.infosys.irs.model.PassengerListContainer;
import com.infosys.irs.model.SearchFlights;
import com.infosys.irs.repository.FlightRepository;
import com.infosys.irs.utility.CalendarUtility;

@Service
public class BookingService {

	@Autowired
	private FlightRepository flightRepository;
	
	public SearchFlights getFlightDetails(String flightId) throws Exception{
		
		SearchFlights result = new SearchFlights();
		Optional<FlightEntity> optionalFlight = flightRepository.findById(flightId);
		if(optionalFlight.isPresent()) {
			FlightEntity flight = optionalFlight.get();
			result.setAirlines(flight.getAirlines());
			result.setDepartureTime(flight.getDepartureTime());
			result.setDestination(flight.getDestination());
			result.setFare(flight.getFare().toString());
			result.setSeatCount(flight.getSeatCount().toString());
			result.setSource(flight.getSource());
			result.setFlightAvailableDate(CalendarUtility.getStringFromCalendar(flight.getFlightAvailableDate()));
		}
		else
			throw new FlightNotAvailableException(flightId);
		return result;
	}
	
	public Booking bookTicket(Booking booking, PassengerListContainer passengerListContainer) throws PassengerDetailNotFoundException, SeatsNotAvaialbleException,Exception{
		
		if(passengerListContainer== null){
			throw new PassengerDetailNotFoundException("BookingService.PASSENGER_NOT_ADDED");
		}
		List<Passenger> passengerList = passengerListContainer.getPassengerList();
		if(passengerList==null || passengerList.size()==0){
			throw new PassengerDetailNotFoundException("BookingService.PASSENGER_NOT_ADDED");
		}
		Optional<FlightEntity> optionalFlightEntity = flightRepository.findById(booking.getFlightId());
		if(optionalFlightEntity.isPresent()) {
			FlightEntity flightEntity = optionalFlightEntity.get();
			if(flightEntity.getSeatCount()-passengerList.size()<=0)
			throw new SeatsNotAvaialbleException("BookingService.SEATS_NOT_AVAILABLE");
			booking.setSeats(passengerList.size());
			Double totalFare = Double.parseDouble(booking.getFare())* booking.getSeats();
			booking.setFare(totalFare.toString());
			Integer pnr = (int) (Math.random() * 1858955);
			booking.setPnr(pnr);
		}
		else
			throw new FlightNotAvailableException(booking.getFlightId());
		
		return booking;
	}
}
