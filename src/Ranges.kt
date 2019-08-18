// Ranges in kotlin

fun main() {

    for(i in 0..3) {
        println(i)
    }

    for(i in 1..10 step 2){
        println("Increments twice")
    }

    for(i in 3 downTo 0){
        println("Decrements the value")
    }


    for(c in 'a'..'d'){
        println("Can increment through letters $c")
    }
    var x = 3
    if( x in 1..10){
        println("It is in range")
    }

}