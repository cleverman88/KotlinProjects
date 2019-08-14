fun main() {
    //Replacing the * with my defined operator
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Sohaib ")

    //Allowing easy range access on strings.
    operator fun String.get(range : IntRange) = substring(range)
    var sentence = "On another note i want to say thanks to kyle."
    println(sentence[0..5])

    /*
        Functions with the vararg Parameter
        It allows you to pass in any number of arguments by separating them with commas
     */

    fun sayAll (vararg Strings : String) {
        for (m in Strings)
            print("$m ")
    }
    sayAll("Kill me", "Kill you", "OMEGALUL")
    fun sayAllWithPrefix (vararg Strings: String, prefix : String = "Kill me LUL"){
        for(m in Strings)
            print("$prefix $m")
    }
    sayAllWithPrefix("KILL ME LUL, KILL ME LUL", prefix = "YEET")

    // To pass on a vararg to another method you pass it with * before the value e.g sayAll(*values)




}