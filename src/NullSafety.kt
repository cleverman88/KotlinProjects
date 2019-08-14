/*
    Kotlin does not allow nulls in variables unless specified
 */
fun main() {
    // Can't set this string to null
    var string : String = "JimBob"

    // Can set this string to null as there is a ? which means that this variable can be null
    var string2 : String? = "Harry"
    string2 = null


    /*
        Kotlin allows you to work with nulls quite nicely
     */

    //Only accepts strings that can't be null
    fun stringMethodNotNull (string : String) : Int{
        return string.length;
    }

    fun stringMethodNull (string : String?) : Int{
        if(string != null) {
            return string.length;
        }
        return 0
    }

    println(stringMethodNotNull(string));
    println(stringMethodNull(string2));



}