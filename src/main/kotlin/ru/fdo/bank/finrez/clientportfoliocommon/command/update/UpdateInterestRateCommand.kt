package ru.fdo.bank.finrez.clientportfoliocommon.command.update

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.math.BigDecimal

data class UpdateInterestRateCommand(
    @TargetAggregateIdentifier val contractId: String,
    val interestRate: BigDecimal
)
