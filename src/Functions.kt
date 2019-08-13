//Simple function, takes in a string and returns nothing
fun printValue(Value: String) {
    println(Value)
}
//Simple function takes in a string and prints the value with a prefix
fun printValueWithPrefix(Value: String, prefix : String = "Testing"){
    println("[$prefix] $Value")
}
//Simple function that multiplies two values and returns the result
fun multiply(val1 : Int, val2: Int) : Int{
    return val1*val2
}
//Simple function that adds two values and returns the result
fun add(val1 : Int, val2: Int) : Int{
    return val1+val2
}
//Simple function that subtracts two values and returns the result
fun subtract(val1 : Int, val2: Int) : Int{
    return val1-val2
}
//Simple function that divides two values and returns the result
fun divide(val1 : Int, val2: Int) : Int{
    return val1/val2
}
//Driver code
fun main() {
    var a = 1
    var b = 2
    var result = multiply(a,b);
    printValue(result.toString())
    result = add(a,b)
    printValueWithPrefix(result.toString())
    printValueWithPrefix(result.toString(), prefix = "Testing 2")


}

