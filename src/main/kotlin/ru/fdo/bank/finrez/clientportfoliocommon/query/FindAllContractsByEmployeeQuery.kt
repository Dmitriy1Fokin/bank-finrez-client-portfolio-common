package ru.fdo.bank.finrez.clientportfoliocommon.query

import org.springframework.data.domain.Pageable

data class FindAllContractsByEmployeeQuery(val employeeId: String, val pageable: Pageable)
