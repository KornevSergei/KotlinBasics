fun main() {

    //переменная которую можно менять
    var greeting1 = "Hello!"
    greeting1 = "Hi!"

    //если строго надо присвоить варинт переменной
    var greeting3: String = "GoodBye!"
    var number1: Int = 2
    var number2: Double = 3.69

    //переменная которую нельзя менять
    val greeting2 = "Bye!"


    println(number2)
    println(number1)
    println(greeting3)
    println(number1 + number2)
    //приводим к Инт
    println(number1 + number2.toInt())

}