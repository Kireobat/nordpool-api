package eu.kireobat.nordpoolapi.api.dto

import org.springframework.http.HttpStatus
import java.time.ZonedDateTime

class DefaultResponseDto (
    var success: Boolean,
    var timestamp: ZonedDateTime,
    var status: HttpStatus,
    var message: String
)