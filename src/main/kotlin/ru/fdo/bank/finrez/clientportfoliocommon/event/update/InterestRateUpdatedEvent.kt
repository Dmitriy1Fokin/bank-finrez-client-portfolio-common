package ru.fdo.bank.finrez.clientportfoliocommon.event.update

import java.math.BigDecimal

data class InterestRateUpdatedEvent(
    val contractId: String,
    val interestRate: BigDecimal
)
