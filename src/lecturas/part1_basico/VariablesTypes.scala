package lecturas.part1_basico

object VariablesTypes extends App {

  val x = 42

  println(x)

  // x = 2
  // vals son inmutables
  // el compilador infiere el tipo de dato, no es necesario informarlo

  val aString: String = "scala"
  val aOtherString = "good night"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4567
  val aLong: Long = 456465465
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //  variables
  var aVariable: Int = 4

  aVariable = 6 // side effects





}
