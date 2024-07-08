package eu.kireobat.nordpoolapi.persistence.repo

import eu.kireobat.nordpoolapi.persistence.entity.PriceEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PriceRepo: JpaRepository<PriceEntity, String> {
}