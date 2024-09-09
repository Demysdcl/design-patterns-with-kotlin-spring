package one.digitalinnovation.design_patterns_spring_lab.modules.customer

import jakarta.persistence.*
import one.digitalinnovation.design_patterns_spring_lab.modules.address.Address

@Entity
data class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
    val name: String = "",
    @ManyToOne
    val address: Address = Address()
)