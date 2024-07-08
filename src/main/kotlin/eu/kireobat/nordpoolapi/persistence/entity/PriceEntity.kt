package eu.kireobat.nordpoolapi.persistence.entity

import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import java.math.BigInteger
import java.time.ZoneOffset
import java.time.ZonedDateTime

@Entity
@Table(schema = "nordpool_api",name = "price")
class PriceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "priceSeq")
    @SequenceGenerator(name = "priceSeq", sequenceName = "price_seq", allocationSize = 1)
    @Column(name = "id")
    lateinit var id: BigInteger

    @ManyToOne
    @NotNull
    @JoinColumn(name = "city_id")
    lateinit var city: CityEntity

    @NotNull
    @Column(name = "price_raw")
    lateinit var priceRaw: BigDecimal

    @ManyToOne
    @NotNull
    @JoinColumn(name = "currency_id")
    lateinit var currency: CurrencyEntity

    @Column(name = "timestamp")
    val timestamp = ZonedDateTime.now(ZoneOffset.UTC)
}