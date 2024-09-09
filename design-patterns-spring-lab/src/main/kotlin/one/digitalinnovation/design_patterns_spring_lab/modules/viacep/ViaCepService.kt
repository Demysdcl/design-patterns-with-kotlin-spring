package one.digitalinnovation.design_patterns_spring_lab.modules.viacep

import one.digitalinnovation.design_patterns_spring_lab.modules.address.Address
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
interface ViaCepService {

    @GetMapping("/{cep}/json/")
    fun searchCep(@PathVariable("cep") cep: String?): Address
}