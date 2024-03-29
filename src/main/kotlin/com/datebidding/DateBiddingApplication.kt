package com.datebidding

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class DateBiddingApplication

fun main(args: Array<String>) {
	runApplication<DateBiddingApplication>(*args)
}
