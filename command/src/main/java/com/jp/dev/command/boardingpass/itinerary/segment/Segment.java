package com.jp.dev.command.boardingpass.itinerary.segment;

public class Segment {

    public Segment(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    private String origin;
    private String destination;

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }
}
