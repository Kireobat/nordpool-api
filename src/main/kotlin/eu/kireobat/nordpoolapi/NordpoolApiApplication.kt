package eu.kireobat.nordpoolapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class NordpoolApiApplication

fun main(args: Array<String>) {
	runApplication<NordpoolApiApplication>(*args)
}
