package ru.fdo.bank.finrez.clientportfoliocommon.command.update

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.math.BigDecimal

data class UpdateCreditLimitCommand(
    @TargetAggregateIdentifier val contractId: String,
    val creditLimit: BigDecimal
)
