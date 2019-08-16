//Can have classes with no parameters passed in kotlin will make the default constructor
//Dont need curly brace if it has no body
class animal()

class Cat(var name : String, var age : Int, var speak : String = "Meow"){
    fun Speak(){
        println(this.speak);
    }

    fun changeName(name : String){
        this.name = name;
    }

    fun changeAge(age : Int){
        this.age = age;
    }

    fun changeSpeak(vararg words : String){
        this.speak = "";
        for(x in words){
            this.speak += "$x "
        }
    }

    override fun toString(): String {
        return "Cat name: $name, Cat age : $age, Cat words $speak"
    }

}

fun main() {
    var a = animal()

    var cat = Cat("Minooche",5)
    println(cat)
    cat.Speak()
    cat.changeAge(6)
    cat.changeName("Bobby")
    cat.changeSpeak("Can't", "wait", "for","antony","fantano","to","review","the","new","trippie","redd","album")
    println(cat)
}