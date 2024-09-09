package one.digital.innovation.gof.singleton

class SingletonLazy private constructor() {

    companion object {
        val instance by lazy {
            SingletonLazy()
        }
    }

}