fun main() {
    /*
        Kotlin uses nice type inference so you don't really need to do it.
        Kotlin does not enforce immutability, although it is recommended, use val over var.
     */

    //Mutable type
    var firstNumber = 1
    firstNumber = 3

    //Immutable type
    val string = "Sohaib"

    //Declared type
    var secondNumber : Int = 2
    //Inferred type
    var thirdNumber = 2


}