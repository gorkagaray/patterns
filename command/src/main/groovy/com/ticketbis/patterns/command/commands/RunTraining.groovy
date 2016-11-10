package com.ticketbis.patterns.command.commands

import com.ticketbis.patterns.command.athletes.Runner

class RunTraining implements Training {

    private Runner runner

    RunTraining(Runner runner) {
        this.runner = runner
    }

    void execute() {
        runner.run()
    }
}
