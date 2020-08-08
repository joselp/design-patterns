package com.jp.dev.command;

import com.jp.dev.command.commands.BoughtCommand;
import com.jp.dev.command.commands.ErrorCommand;
import com.jp.dev.command.commands.SuccessCommand;
import com.jp.dev.command.event.Event;
import com.jp.dev.command.executor.EventExecutor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CommandTest {

    @Test
    public void shouldVerifyEachCommand() {

        Event event = new Event();
        EventExecutor executor = new EventExecutor();

        executor.executeCommand(new ErrorCommand(event));
        assertEquals("Order had an error event", event.getResponse());
        executor.executeCommand(new SuccessCommand(event));
        assertEquals("Order had a success event", event.getResponse());
        executor.executeCommand(new BoughtCommand(event));
        assertEquals("Order was completed", event.getResponse());
    }
}
