package ru.fdo.bank.finrez.clientportfoliocommon.event.update

import java.time.LocalDate

data class DateEndContractUpdatedEvent(
    val contractId: String,
    val dateEndContract: LocalDate,
)
