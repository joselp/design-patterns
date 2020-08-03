package com.jp.dev.command.boardingpass.itinerary;

import com.jp.dev.command.boardingpass.itinerary.segment.Segment;

import java.util.List;

public class Itinerary {

    private List<Segment> segments;

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }
}
