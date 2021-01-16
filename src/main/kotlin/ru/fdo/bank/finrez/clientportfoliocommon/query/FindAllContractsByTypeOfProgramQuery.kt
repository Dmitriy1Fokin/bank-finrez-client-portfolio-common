package ru.fdo.bank.finrez.clientportfoliocommon.query

import org.springframework.data.domain.Pageable

data class FindAllContractsByTypeOfProgramQuery(val typeOfProgram: String, val pageable: Pageable)
