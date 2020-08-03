package com.jp.dev.command;

import com.jp.dev.command.boardingpass.AirportPass;

public class CommandExecutor {

    public AirportPass executeBuild(Command command) {

        return command.execute();
    }

}
