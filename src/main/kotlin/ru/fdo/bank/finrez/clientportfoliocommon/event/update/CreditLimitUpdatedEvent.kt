package ru.fdo.bank.finrez.clientportfoliocommon.event.update

import java.math.BigDecimal

data class CreditLimitUpdatedEvent(
    val contractId: String,
    val creditLimit: BigDecimal
)
