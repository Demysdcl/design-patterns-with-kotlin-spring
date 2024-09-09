package subsystem.crm

class CrmService private constructor() {
    companion object {
        fun recordCustomer(name: String, zipCode: String, city: String, state: String) {
            println("The customer was saved in the CRM system")
            println(name)
            println(zipCode)
            println(city)
            println(state)
        }
    }
}