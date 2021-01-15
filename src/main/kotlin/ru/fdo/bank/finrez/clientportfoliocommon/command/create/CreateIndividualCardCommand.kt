package ru.fdo.bank.finrez.clientportfoliocommon.command.create

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.time.LocalDate

data class CreateIndividualCardCommand(
    @TargetAggregateIdentifier val id: String,
    val clientId: String,
    val employeeId: String,
    val programId: String,
    val contractNum: String,
    val dateStartContract: LocalDate,
    val dateEndContract: LocalDate,
    val dateSigningContract: LocalDate
)
