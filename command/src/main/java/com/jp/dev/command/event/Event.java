package com.jp.dev.command.event;

import lombok.Data;

@Data
public class Event {

    String response;

    public void boughtEvent() {

        response = "Order was completed";
    }

    public void errorEvent() {

        response = "Order had an error event";
    }

    public void successEvent() {

        response = "Order had a success event";
    }
}
