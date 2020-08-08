package com.jp.dev.command.commands;

import com.jp.dev.command.event.Event;

public class SuccessCommand implements Command {

    Event event;

    public SuccessCommand(Event event) {
        this.event = event;
    }

    @Override
    public void execute() {
        event.successEvent();
    }
}