package ru.fdo.bank.finrez.clientportfoliocommon.command.update

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.time.LocalDate

data class UpdateDateEndContractCommand(
    @TargetAggregateIdentifier val contractId: String,
    val dateEndContract: LocalDate,
)
