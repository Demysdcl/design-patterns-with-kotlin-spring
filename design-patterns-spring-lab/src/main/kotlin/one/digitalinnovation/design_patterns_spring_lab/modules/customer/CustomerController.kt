package one.digitalinnovation.design_patterns_spring_lab.modules.customer

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("customers")
class CustomerController(private val customerService: CustomerService) {

    @GetMapping
    fun findAll() = ResponseEntity.ok(customerService.findAll())

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = ResponseEntity.ok(customerService.findById(id))

    @PostMapping
    fun insert(@RequestBody customer: Customer) = ResponseEntity.ok(customerService.insert(customer))

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody customer: Customer) =
        ResponseEntity.ok(customerService.update(id, customer))
}