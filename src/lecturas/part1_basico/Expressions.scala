package lecturas.part1_basico

object Expressions extends App {
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  println(!(1 == x))

  var aVariable = 2
  aVariable += 3 // tambien funciona con +=, *= ....side effects
  println(aVariable)

  // Instrucciones vs Expresiones

  // Expresion IF
  val aCondition = true
  val aConditionValue = if(aCondition) 6 else 7
  println(aConditionValue)
  println(if(aCondition) 6 else 7)

  var aWeirdValue = (aVariable = 3)   // Unit === void
  println(aWeirdValue)

  // code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if(z > 2) "Hello" else "goodbye"
  }

  // diferencia entre "hello world" vs println("hello world")
  println(println("hello word")) // return Unit

  val someValue = {
    2 < 3
  }
  println(someValue)

  // el valor de un bloque de codigo es la ultima expresion
  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }

  println((someOtherValue))

}
