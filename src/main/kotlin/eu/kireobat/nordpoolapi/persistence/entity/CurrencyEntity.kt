package eu.kireobat.nordpoolapi.persistence.entity

import eu.kireobat.nordpoolapi.enums.CurrencyIdEnum
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.NotNull

@Entity
@Table(schema = "nordpool_api",name = "currency")
class CurrencyEntity {

    @Id
    @NotNull
    @Column(name = "id")
    lateinit var id: CurrencyIdEnum

    @NotNull
    @Column(name = "name")
    lateinit var name: String

    @NotNull
    @Column(name = "symbol")
    lateinit var symbol: String

    @NotNull
    @Column(name = "decimals")
    var decimals: Int = 0
}