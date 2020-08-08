package com.jp.dev.command.commands;

import com.jp.dev.command.event.Event;

public class ErrorCommand implements Command {

    Event event;

    public ErrorCommand(Event event) {
        this.event = event;
    }

    @Override
    public void execute() {
        event.errorEvent();
    }
}