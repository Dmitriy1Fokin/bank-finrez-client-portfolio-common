package ru.fdo.bank.finrez.clientportfoliocommon

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ClientPortfolioCommonApplication

fun main(args: Array<String>) {
    runApplication<ClientPortfolioCommonApplication>(*args)
}
