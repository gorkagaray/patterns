package com.ticketbis.patterns.command

import com.ticketbis.patterns.command.athletes.Cycler
import com.ticketbis.patterns.command.athletes.Runner
import com.ticketbis.patterns.command.athletes.Swimmer
import com.ticketbis.patterns.command.commands.IronManTraining
import com.ticketbis.patterns.command.commands.Training
import com.ticketbis.patterns.command.loader.Loader


class RunMe {

    static void main(String[] args) {
        Loader loader = new Loader()

        // Random training
        List<Training> commands = loader.load()
        commands.each { Training command ->
            command.execute()
        }

        // IronMan training
        IronManTraining asierRamos = new IronManTraining(
                new Cycler(), new Runner(), new Swimmer()
        )

        asierRamos.execute()
    }
}
