package eu.kireobat.nordpoolapi.service

import eu.kireobat.nordpoolapi.api.dto.CreateCityDto
import eu.kireobat.nordpoolapi.persistence.entity.CityEntity
import eu.kireobat.nordpoolapi.persistence.repo.CityRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CityService {

    @Autowired
    lateinit var countryService: CountryService

    @Autowired
    lateinit var cityRepo: CityRepo

    fun createCity(createCityDto: CreateCityDto): CityEntity {

        val countryEntity = countryService.getCountryById(createCityDto.country)

        val cityEntity = CityEntity().apply {
            this.name = createCityDto.name
            this.country = countryEntity
        }

        return cityRepo.saveAndFlush(cityEntity)
    }
}