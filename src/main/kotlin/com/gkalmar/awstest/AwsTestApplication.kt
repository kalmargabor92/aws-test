package com.gkalmar.awstest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AwsTestApplication

@Suppress("SpreadOperator")
fun main(args: Array<String>) {
	SpringApplication.run(AwsTestApplication::class.java, *args)
}
