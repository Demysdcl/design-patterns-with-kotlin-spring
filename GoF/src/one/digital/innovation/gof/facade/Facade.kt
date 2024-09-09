package one.digital.innovation.gof.facade

import subsystem.crm.CrmService
import subsystem.zipCode.ZipCodeApi

class Facade {
    fun migrateCustomer(name: String, zipCode: String) = ZipCodeApi.instance.run {
        CrmService.recordCustomer(name, zipCode, recoverCity(zipCode), recoverState(zipCode))
    }
}