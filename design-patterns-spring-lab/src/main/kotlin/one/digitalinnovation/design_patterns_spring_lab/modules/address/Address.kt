package one.digitalinnovation.design_patterns_spring_lab.modules.address

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Address(
    @Id
    val cep: String? = "",
    val logradouro: String? = "",
    val complemento: String? = "",
    val bairro: String? = "",
    val localidade: String? = "",
    val uf: String? = "",
    val ibge: String? = "",
    val gia: String? = "",
    val ddd: String? = "",
    val siafi: String? = "",
)