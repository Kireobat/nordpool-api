package eu.kireobat.nordpoolapi.api.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1")
@Tag(name = "Nordpool API")
class NordpoolController {

    @GetMapping("/test")
    @Operation(summary = "test")
    fun test(): String {
        return "Hello World"
    }
}