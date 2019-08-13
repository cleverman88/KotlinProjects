/*
Infix notation
Functions marked with the infix keyword can also be called using the infix notation
(omitting the dot and the parentheses for the call)
 */

class Person(private val name : String, private val age: Int){
    private val owns = ArrayList<Dog>()

    fun addPet(dog : Dog) : Unit{
        owns.add(dog)
    }

    infix fun loves(other : Dog){
        println(this.getName()+ " loves "+ other.getName())
    }

    fun getName(): String{
        return name
    }

    fun getAge(): Int{
        return age
    }

    fun getListOfDogs(): List<Dog>{
        return owns
    }

    override fun toString(): String {
        return this.getName()
    }
}

class Dog(private val name : String, private val age: Int, private var owner: Person){
    fun getName(): String{
        return name
    }
    fun getAge(): Int{
        return age
    }
    fun getOwner() : Person{
        return owner
    }
    fun setOwner(person : Person) : Unit{
        owner = person
    }

    override fun toString(): String {
        return this.getName()
    }
}

fun main() {
    var Sohaib = Person("Sohaib", 18)
    var Jack = Person("Jack", 19)
    println(Sohaib.getName()+ " is " + Sohaib.getAge()+ " years old")
    var Molly = Dog("Molly", 2 , Sohaib)
    println(Molly.getName()+ " is " + Molly.getAge()+ " years old and is owned by "+ Molly.getOwner())
    Sohaib.addPet(Molly)
    println("Sohaib owns these pets")
    for(d :Dog in Sohaib.getListOfDogs()){
        println(d)
    }

    //Now for the infix functions
    Sohaib loves Molly




}