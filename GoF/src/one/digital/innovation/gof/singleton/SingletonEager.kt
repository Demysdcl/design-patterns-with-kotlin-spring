package one.digital.innovation.gof.singleton

class SingletonEager private constructor() {
    companion object {
        val instance = SingletonEager()
    }
}