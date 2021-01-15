package ru.fdo.bank.finrez.clientportfoliocommon.event.update

data class EmployeeUpdatedEvent(
    val contractId: String,
    val employeeId: String
)
