package com.jp.dev.command;

import com.jp.dev.command.boardingpass.AirportPass;
import com.jp.dev.command.service.AirportPassService;
import com.jp.dev.command.service.impl.AirportPassServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

public class CommandTest {


    @Autowired
    private AirportPassService airportPassService;

    @Test
    public void shouldBuildAAirportPass() {

        AirportPass airportPass = new AirportPass();

        CommandExecutor executor = new CommandExecutor();
        executor.executeBuild(new BuildItineraryCommand(new AirportPassServiceImpl(), airportPass));
        executor.executeBuild(new BuildPassengerCommand(new AirportPassServiceImpl(), airportPass));
        executor.executeBuild(new BuildBoardingDataCommand(new AirportPassServiceImpl(), airportPass));

        assertNotNull(airportPass.getItinerary());
        assertEquals("SCL", airportPass.getItinerary().getSegments().get(0).getDestination());
        assertEquals("UIO", airportPass.getItinerary().getSegments().get(0).getOrigin());
        assertEquals("Jon Doe", airportPass.getPassenger().getName());
        assertEquals("5C", airportPass.getBoardingData().getSeat());
    }

}
