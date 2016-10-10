package com.ticketbis.patterns.strategy.engines

interface PaymentEngine {

    def buy()
    def callback()
    def notification()
}