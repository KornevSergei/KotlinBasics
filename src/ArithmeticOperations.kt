fun main() {

    var number1: Int = 23
    var number2: Int = 34
    var number3: Int = 65
    var number4: Int = 111


    number1 -= 12
    number2 += 4
    number3 /= 5
    number4++


    println(number2)
    println(number1)
    println(number3)
    println(number4)
    
    println(number1 + number2)
    //приводим к Дабл
    println(number1 + number2.toDouble())
}