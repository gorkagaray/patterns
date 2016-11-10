package com.ticketbis.patterns.command.loader

import com.ticketbis.patterns.command.athletes.Cycler
import com.ticketbis.patterns.command.athletes.Runner
import com.ticketbis.patterns.command.athletes.Swimmer
import com.ticketbis.patterns.command.commands.CycleTraining
import com.ticketbis.patterns.command.commands.RunTraining
import com.ticketbis.patterns.command.commands.SwimTraining
import com.ticketbis.patterns.command.commands.Training

class TrainingFactory {

    private static final int NUMBER_OF_TRAININGS = 3

    static Training getTrain() {
        Training train
        int type = NUMBER_OF_TRAININGS * Math.random()

        switch (type) {
            case 0: train = new RunTraining(new Runner())
                break;
            case 1: train = new SwimTraining(new Swimmer())
                break;
            default: train = new CycleTraining(new Cycler())
        }

        train
    }
}
