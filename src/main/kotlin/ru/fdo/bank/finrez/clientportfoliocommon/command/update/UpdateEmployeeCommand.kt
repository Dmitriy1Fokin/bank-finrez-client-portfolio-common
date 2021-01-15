package ru.fdo.bank.finrez.clientportfoliocommon.command.update

import org.axonframework.modelling.command.TargetAggregateIdentifier

data class UpdateEmployeeCommand(
    @TargetAggregateIdentifier val contractId: String,
    val employeeId: String,
)
