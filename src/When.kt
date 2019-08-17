/*
Instead of the widely used switch statement, Kotlin provides the more flexible
and clear when construction. It can be used either as a statement or as an expression.
 */

fun main() {
    case("Sohaib")
    case(1)
    case("1")
    case(Cat("Minooche",4))
    println(assign("Sohaib"))
}

//Checked in order
fun case(obj: Any){
    when(obj){
        "Sohaib" -> println("$obj is your name!")
        1 -> println("This is the number one")
        is Int -> println("Integer")
        is String -> println("Is a string")
        else -> println("Might be a cat")
    }
}

fun assign(obj: Any) : Any{
    var v = when(obj){
        "Sohaib" -> "This is your name"
        1 -> "This is a number"
        else -> "This is a cat"
    }

    return v
}