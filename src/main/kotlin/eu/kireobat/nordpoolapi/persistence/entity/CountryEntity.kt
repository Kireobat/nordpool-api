package eu.kireobat.nordpoolapi.persistence.entity

import eu.kireobat.nordpoolapi.enums.CountryIdEnum
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.NotNull

@Entity
@Table(schema = "nordpool_api",name = "country")
class CountryEntity {

    @Id
    @NotNull
    @Column(name = "id")
    lateinit var id: CountryIdEnum

    @NotNull
    @Column(name = "name")
    lateinit var name: String
}