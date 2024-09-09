package one.digital.innovation.gof.singleton


fun main() {
    val lazy = SingletonLazy.instance
    println(lazy)
    val lazy2 = SingletonLazy.instance
    println(lazy2)

    val eager = SingletonEager.instance
    println(eager)
    val eager2 = SingletonEager.instance
    println(eager2)

    val holder = SingletonLazyHolder.instance
    println(holder)
    val holder2 = SingletonLazyHolder.instance
    println(holder2)
}