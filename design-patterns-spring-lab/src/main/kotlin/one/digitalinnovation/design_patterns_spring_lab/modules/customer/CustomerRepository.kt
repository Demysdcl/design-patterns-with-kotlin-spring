package one.digitalinnovation.design_patterns_spring_lab.modules.customer

import org.springframework.data.repository.CrudRepository

interface CustomerRepository: CrudRepository<Customer, Long>