package com.ticketbis.patterns.command.loader

import com.ticketbis.patterns.command.commands.Training

class Loader {

    List<Training> load() {
        List commands = new ArrayList<Training>()
        (1..10).each {
            commands.add(TrainingFactory.getTrain())
        }
        commands
    }
}
