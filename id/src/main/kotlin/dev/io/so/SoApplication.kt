package dev.io.so

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SoApplication

fun main(args: Array<String>) {
	runApplication<SoApplication>(*args)
}
