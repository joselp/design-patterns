package com.jp.dev.command.service.impl;

import com.jp.dev.command.boardingpass.AirportPass;
import com.jp.dev.command.boardingpass.boarding.BoardingData;
import com.jp.dev.command.boardingpass.itinerary.Itinerary;
import com.jp.dev.command.boardingpass.itinerary.segment.Segment;
import com.jp.dev.command.boardingpass.passenger.Passenger;
import com.jp.dev.command.service.AirportPassService;

import java.util.List;

public class AirportPassServiceImpl implements AirportPassService {

    @Override
    public AirportPass buildItinerary(AirportPass airportPass) {
        Itinerary itinerary = new Itinerary();
        itinerary.setSegments(List.of(new Segment("UIO", "SCL"), new Segment("SCL", "CPO")));
        airportPass.setItinerary(itinerary);
        return airportPass;

    }

    @Override
    public AirportPass buildPassenger(AirportPass airportPass) {
        airportPass.setPassenger(new Passenger("Jon Doe", "Adult"));
        return airportPass;
    }

    @Override
    public AirportPass buildBoarding(AirportPass airportPass) {
        airportPass.setBoardingData(new BoardingData("5C", "2A", "4"));
        return airportPass;
    }
}
