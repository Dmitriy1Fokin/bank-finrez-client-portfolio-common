package ru.fdo.bank.finrez.clientportfoliocommon.command.update

import org.axonframework.modelling.command.TargetAggregateIdentifier
import java.math.BigDecimal

data class UpdateTransferRateCommand(
    @TargetAggregateIdentifier val contractId: String,
    val transferRate: BigDecimal
)
