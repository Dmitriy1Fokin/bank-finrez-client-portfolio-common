package ru.fdo.bank.finrez.clientportfoliocommon.query

import org.springframework.data.domain.Pageable

data class FindAllContractsByClientQuery(
    val clientId: String,
    val pageable: Pageable
)
