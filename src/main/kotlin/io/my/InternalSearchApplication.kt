package io.my

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class InternalSearchApplication

fun main(args: Array<String>) {
    runApplication<InternalSearchApplication>(*args)
}
