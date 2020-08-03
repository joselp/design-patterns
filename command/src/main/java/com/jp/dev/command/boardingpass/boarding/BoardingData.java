package com.jp.dev.command.boardingpass.boarding;

public class BoardingData {

    public BoardingData(String seat, String gate, String terminal) {
        this.seat = seat;
        this.gate = gate;
        this.terminal = terminal;
    }

    private String seat;
    private String gate;
    private String terminal;

    public String getSeat() {
        return seat;
    }

    public String getGate() {
        return gate;
    }

    public String getTerminal() {
        return terminal;
    }
}