package one.digital.innovation.gof.strategy

fun main() {
    Robot(NormalBehavior()).run {
        move()
        behavior = DefensiveBehavior()
        move()
        behavior = AggressiveBehavior()
        move()
    }
}