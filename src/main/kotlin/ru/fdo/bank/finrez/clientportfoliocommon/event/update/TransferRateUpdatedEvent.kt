package ru.fdo.bank.finrez.clientportfoliocommon.event.update

import java.math.BigDecimal

data class TransferRateUpdatedEvent(
    val contractId: String,
    val transferRate: BigDecimal
)
