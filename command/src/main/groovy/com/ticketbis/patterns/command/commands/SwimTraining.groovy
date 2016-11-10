package com.ticketbis.patterns.command.commands

import com.ticketbis.patterns.command.athletes.Swimmer

class SwimTraining implements Training {

    private Swimmer swimmer

    SwimTraining(Swimmer swimmer) {
        this.swimmer = swimmer
    }

    void execute() {
        swimmer.swimm()
    }
}
