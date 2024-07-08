package eu.kireobat.nordpoolapi.api.dto

import eu.kireobat.nordpoolapi.enums.CountryIdEnum

class CreateCityDto {
    lateinit var country: CountryIdEnum
    lateinit var name: String
}