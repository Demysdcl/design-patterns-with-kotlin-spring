package one.digital.innovation.gof.singleton

class SingletonLazyHolder private constructor() {
    private class Holder {
        val instance = SingletonLazyHolder()
    }

    companion object {
        private val holder by lazy { Holder() }
        val instance = holder.instance
    }

}