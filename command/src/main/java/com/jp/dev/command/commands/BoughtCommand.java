package com.jp.dev.command.commands;

import com.jp.dev.command.event.Event;

public class BoughtCommand implements Command {

    Event event;

    public BoughtCommand(Event event) {
        this.event = event;
    }

    @Override
    public void execute() {
        event.boughtEvent();
    }
}