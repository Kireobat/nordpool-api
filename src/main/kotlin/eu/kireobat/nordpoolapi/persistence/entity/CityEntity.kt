package eu.kireobat.nordpoolapi.persistence.entity

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import java.math.BigInteger

@Entity
@Table(schema = "nordpool_api",name = "city")
class CityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "citySeq")
    @SequenceGenerator(name = "citySeq", sequenceName = "city_seq", allocationSize = 1)
    @Column(name = "id")
    lateinit var id: BigInteger

    @ManyToOne
    @NotNull
    @JoinColumn(name = "country_id")
    lateinit var country: CountryEntity

    @NotNull
    @Column(name = "name")
    lateinit var name: String
}