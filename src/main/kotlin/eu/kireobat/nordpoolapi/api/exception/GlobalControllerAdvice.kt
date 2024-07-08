package eu.kireobat.nordpoolapi.api.exception

import eu.kireobat.nordpoolapi.api.dto.DefaultResponseDto
import org.apache.coyote.BadRequestException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.server.ResponseStatusException
import java.time.ZonedDateTime

@ControllerAdvice
class GlobalControllerAdvice {

    @ExceptionHandler(Exception::class)
    fun handleException(e: Exception): ResponseEntity<DefaultResponseDto> {
        val response = e.message?.let {
            DefaultResponseDto(
                false, ZonedDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, it
            )
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response)
    }

    @ExceptionHandler(BadRequestException::class)
    fun handleBadRequestException(e: BadRequestException): ResponseEntity<DefaultResponseDto> {
        val response = e.message?.let {
            DefaultResponseDto(
                false, ZonedDateTime.now(), HttpStatus.BAD_REQUEST, it
            )
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response)
    }

    @ExceptionHandler(ResponseStatusException::class)
    fun handleResponseStatusException(e: ResponseStatusException): ResponseEntity<DefaultResponseDto> {
        val response = e.body.detail?.let {
            DefaultResponseDto(
                false, ZonedDateTime.now(), HttpStatus.valueOf(e.body.status), it
            )
        }
        return ResponseEntity.status(HttpStatus.valueOf(e.body.status)).body(response)
    }
}