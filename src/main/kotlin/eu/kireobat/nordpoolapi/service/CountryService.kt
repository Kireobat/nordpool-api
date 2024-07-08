package eu.kireobat.nordpoolapi.service

import eu.kireobat.nordpoolapi.enums.CountryIdEnum
import eu.kireobat.nordpoolapi.persistence.entity.CountryEntity
import eu.kireobat.nordpoolapi.persistence.repo.CountryRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CountryService {

    @Autowired
    lateinit var repo: CountryRepo

    fun getCountryById(id: CountryIdEnum): CountryEntity {
        return repo.findById(id)
    }
}