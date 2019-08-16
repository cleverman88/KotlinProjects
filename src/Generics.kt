class MutableQueue<E>(vararg values : E){
    private var elements = values.toMutableList()

    infix fun push(other : E) = elements.add(other)

    fun pop(): E = elements.removeAt(0)
    fun peak(): E = elements.first()
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size

    override fun toString() = "MutableQueue (${elements.joinToString()})"
}

fun main() {
    var queue = MutableQueue<Int>()
    queue push 4
    queue push 5
    queue push 6
    println(queue)
    println(queue.peak())
    queue.pop()
    println(queue)
}