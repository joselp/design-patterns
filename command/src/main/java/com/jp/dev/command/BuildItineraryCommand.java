package com.jp.dev.command;

import com.jp.dev.command.boardingpass.AirportPass;
import com.jp.dev.command.service.AirportPassService;

public class BuildItineraryCommand implements Command{

    private AirportPassService airportPassService;
    AirportPass airportPass;

    public BuildItineraryCommand(AirportPassService airportPassService, AirportPass airportPass) {
        this.airportPassService = airportPassService;
        this.airportPass = airportPass;
    }

    @Override
    public AirportPass execute() {
       return airportPassService.buildItinerary(airportPass);
    }
}