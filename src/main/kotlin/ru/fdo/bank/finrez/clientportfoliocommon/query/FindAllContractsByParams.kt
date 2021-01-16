package ru.fdo.bank.finrez.clientportfoliocommon.query

import org.springframework.data.domain.Pageable

data class FindAllContractsByParams(
    val searchParameters: Map<String, String>,
    val pageable: Pageable
)
