package subsystem.zipCode

class ZipCodeApi private constructor() {
    companion object {
        val instance = ZipCodeApi()
    }

    fun recoverCity(zipCode: String) = "Curitiba"
    fun recoverState(zipCode: String) = "Paraná"
}