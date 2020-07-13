package lecturas.part1_basico

object Functions extends App {

  def aFunction(a: String, b: Int) : String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction() : Int = 42
  println(aParameterlessFunction())
  // println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  // cuando necesitemos algun loop usar recursividad
  println(aRepeatedFunction("hello",3))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int) :Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }


  // funcion saludar
  def greetingFunction(name: String, age: Int): String = {
    "Hola, mi nombre es " + name + " y tengo " + age + " años de edad"
  }

  println(greetingFunction("Sara", 28))

  // funcion factorial
  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n-1)
  }

  println(factorial(5))

  // funcion fibonachi


}
