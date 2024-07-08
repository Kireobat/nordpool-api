package eu.kireobat.nordpoolapi.persistence.repo

import eu.kireobat.nordpoolapi.enums.CountryIdEnum
import eu.kireobat.nordpoolapi.persistence.entity.CountryEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CountryRepo: JpaRepository<CountryEntity, String> {
    fun findById(id: CountryIdEnum): CountryEntity
}