package one.digitalinnovation.design_patterns_spring_lab.modules.customer

import one.digitalinnovation.design_patterns_spring_lab.modules.address.AddressRepository
import one.digitalinnovation.design_patterns_spring_lab.modules.viacep.ViaCepService
import org.springframework.stereotype.Service

@Service
class CustomerService(
    private val repository: CustomerRepository,
    private val addressRepository: AddressRepository,
    private val viaCepService: ViaCepService
) {
    fun findAll(): MutableIterable<Customer> = repository.findAll()

    fun findById(id: Long) = repository.findById(id)


    fun insert(customer: Customer): Unit = addressRepository
        .findById(customer.address.cep ?: "")
        .orElseGet {
            viaCepService
                .searchCep(customer.address.cep)
                .let { addressRepository.save(it) }
        }
        .let { repository.save(customer.copy(address = it)) }

    fun update(id: Long, customer: Customer) = repository
        .findById(id)
        .let {
            if (it.isPresent) {
                insert(it.get().copy(address = customer.address))
            }
        }


    fun delete(id: Long) = repository.deleteById(id)
}