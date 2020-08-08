package com.jp.dev.command.executor;

import com.jp.dev.command.commands.Command;

public class EventExecutor {

    public void executeCommand(Command command) {

        command.execute();
    }

}
