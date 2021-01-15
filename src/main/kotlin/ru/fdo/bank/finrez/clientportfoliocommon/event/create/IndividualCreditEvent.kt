package ru.fdo.bank.finrez.clientportfoliocommon.event.create

import java.time.LocalDate

data class IndividualCreditEvent(
    val contractId: String,
    val clientId: String,
    val employeeId: String,
    val programId: String,
    val contractNum: String,
    val dateStartContract: LocalDate,
    val dateEndContract: LocalDate,
    val dateSigningContract: LocalDate
)
