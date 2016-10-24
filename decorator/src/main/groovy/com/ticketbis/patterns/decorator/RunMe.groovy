package com.ticketbis.patterns.decorator

import com.ticketbis.patterns.decorator.letters.*
import com.ticketbis.patterns.decorator.player.Player

class RunMe {

    public static void main(String[] args) {

        Player gorka = new W(new I(new N(new N(new E(new R(new O(new N(new E(new Player())))))))))
        Player belmez = new L(new O(new O(new S(new E(new R(new O(new N(new E((new Player()))))))))))

        println gorka.getValue() > belmez.getValue() ? "I won ;) " : "This cannot happen :P"
    }
}
