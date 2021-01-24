package ru.fdo.bank.finrez.clientportfoliocommon.query

import org.springframework.data.domain.Pageable

data class FindAllContractsByParamsQuery(
    val searchParameters: Map<String, String>,
    val pageable: Pageable
)
