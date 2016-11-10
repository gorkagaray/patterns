package com.ticketbis.patterns.command.commands

import com.ticketbis.patterns.command.athletes.Cycler

class CycleTraining implements Training {

    private Cycler cycler

    CycleTraining(Cycler cycler) {
        this.cycler = cycler
    }

    void execute() {
        cycler.cycle()
    }
}
