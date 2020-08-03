package com.jp.dev.command.boardingpass;

import com.jp.dev.command.boardingpass.boarding.BoardingData;
import com.jp.dev.command.boardingpass.itinerary.Itinerary;
import com.jp.dev.command.boardingpass.passenger.Passenger;

public class AirportPass {

    private Itinerary itinerary;
    private Passenger passenger;
    private BoardingData boardingData;

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public BoardingData getBoardingData() {
        return boardingData;
    }

    public void setBoardingData(BoardingData boardingData) {
        this.boardingData = boardingData;
    }
}
