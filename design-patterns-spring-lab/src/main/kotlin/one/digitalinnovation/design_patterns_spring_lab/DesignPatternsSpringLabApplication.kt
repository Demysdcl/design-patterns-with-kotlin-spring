package one.digitalinnovation.design_patterns_spring_lab

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class DesignPatternsSpringLabApplication

fun main(args: Array<String>) {
    runApplication<DesignPatternsSpringLabApplication>(*args)
}
