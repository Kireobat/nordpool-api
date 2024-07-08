package eu.kireobat.nordpoolapi.persistence.repo

import eu.kireobat.nordpoolapi.persistence.entity.CurrencyEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CurrencyRepo: JpaRepository<CurrencyEntity, String> {
}