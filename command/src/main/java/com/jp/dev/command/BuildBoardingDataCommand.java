package com.jp.dev.command;

import com.jp.dev.command.boardingpass.AirportPass;
import com.jp.dev.command.service.AirportPassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class BuildBoardingDataCommand implements Command{

    private AirportPassService airportPassService;
    AirportPass airportPass;

    public BuildBoardingDataCommand(AirportPassService airportPassService, AirportPass airportPass) {
        this.airportPassService = airportPassService;
        this.airportPass = airportPass;
    }

    @Override
    public AirportPass execute() {
        return airportPassService.buildBoarding(airportPass);
    }
}