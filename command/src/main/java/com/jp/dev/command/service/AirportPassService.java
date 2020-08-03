package com.jp.dev.command.service;

import com.jp.dev.command.boardingpass.AirportPass;

public interface AirportPassService {

    AirportPass buildItinerary(AirportPass boardingPass);

    AirportPass buildPassenger(AirportPass airportPass);

    AirportPass buildBoarding(AirportPass airportPass);
}
