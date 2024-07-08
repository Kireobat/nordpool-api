package eu.kireobat.nordpoolapi.persistence.repo

import eu.kireobat.nordpoolapi.persistence.entity.CityEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CityRepo: JpaRepository<CityEntity, String> {
}