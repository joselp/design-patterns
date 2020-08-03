package com.jp.dev.command;

import com.jp.dev.command.boardingpass.AirportPass;

@FunctionalInterface
public interface Command {

    AirportPass execute();
}
