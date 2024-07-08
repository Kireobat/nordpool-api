package eu.kireobat.nordpoolapi.api.controller

import eu.kireobat.nordpoolapi.api.dto.CreateCityDto
import eu.kireobat.nordpoolapi.persistence.entity.CityEntity
import eu.kireobat.nordpoolapi.service.CityService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Cities")
class CityController(private val cityService: CityService) {

    @PostMapping("/city")
    @Operation(summary = "Create a new city")
    fun createCity(@RequestBody createCityDto: CreateCityDto): CityEntity {
        return cityService.createCity(createCityDto)
    }
}