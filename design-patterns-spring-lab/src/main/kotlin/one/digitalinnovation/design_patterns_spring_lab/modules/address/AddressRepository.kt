package one.digitalinnovation.design_patterns_spring_lab.modules.address

import org.springframework.data.repository.CrudRepository

interface AddressRepository: CrudRepository<Address, String>