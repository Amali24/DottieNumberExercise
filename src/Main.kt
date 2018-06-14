import kotlin.math.cos
import kotlin.math.tan

fun main (args: Array<String>){
    var previousNumber = 0.0
    var currentNumber = cos(5.0)

    while (currentNumber != previousNumber){
        previousNumber = currentNumber
        currentNumber = cos(currentNumber)
    }

    println("Dottie Number: $currentNumber")

    previousNumber = 0.0
    currentNumber = 2 - tan(2.0)

    while (currentNumber != previousNumber){
        previousNumber = currentNumber
        currentNumber -= tan(currentNumber)
    }

    println("Fixed point of f(x) = x - tan(x): $currentNumber")

    previousNumber = 0.0
    currentNumber = 1 + 1/5.0

    while (currentNumber != previousNumber){
        previousNumber = currentNumber
        currentNumber = 1 + 1/currentNumber
    }

    println("Fixed point of f(x) = 1 + 1/x: $currentNumber")


}