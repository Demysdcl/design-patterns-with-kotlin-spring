package one.digital.innovation.gof.strategy

class Robot(var behavior: Behavior) {
    
    fun move() = behavior.move()
}