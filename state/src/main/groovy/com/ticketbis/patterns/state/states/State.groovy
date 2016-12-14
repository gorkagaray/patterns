package com.ticketbis.patterns.state.states

interface State {

    void paying()
    void paid()
    void completed()
    void rejected()

    void next()

}
