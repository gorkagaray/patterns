package com.ticketbis.patterns.command.commands

import com.ticketbis.patterns.command.athletes.Cycler
import com.ticketbis.patterns.command.athletes.Runner
import com.ticketbis.patterns.command.athletes.Swimmer

class IronManTraining implements Training {

    private Cycler cycler
    private Runner runner
    private Swimmer swimmer

    IronManTraining(Cycler cycler, Runner runner, Swimmer swimmer) {
        this.cycler = cycler
        this.runner = runner
        this.swimmer = swimmer
    }

    void execute() {
        println "Here comes the Iron Man!"
        cycler.cycle()
        runner.run()
        swimmer.swimm()
    }
}
