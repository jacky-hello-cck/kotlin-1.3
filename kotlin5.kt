  fun hello() {
  val numbers = mutableListOf("one", "two", "three", "four")
  val mutableIterator = numbers.iterator()
  mutableIterator.next()
  mutableIterator.remove()
  println("After removal: $numbers")
  
   val numbers2 = listOf("one", "two", "three", "four", "five", "six")
   println(numbers2.first { it.length > 3 })
   println(numbers2.last { it.startsWith("f") })
}

fun main() {
  println("Hello kotlin4!")
  val numbers = listOf("one", "two", "three", "four", "five")
   println(numbers.first())
    println(numbers.last())
	hello()
}
