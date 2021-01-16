fun main() {


    val names = listOf("Сергей", "Василий", "Ирина", 6)

    //переберая элементы даём каждому имя
    for (name in names) {
        println(name)
    }

    //присваиваем х от 0 до 10
    for (x in 0..10) {
        println(x)
    }

    //присваиваем х от 0 до 10 и добавляем шаг
    for (y in 0..10 step 2) {
        println(y)
    }


    //перебераем числа из списка
    var number = 10 downTo 0
    for (z in number) {
        println(z)
    }

    //от 1 до 20 и проверяем на четность
    var q = 1
    while (q < 20) {
        if (q % 2 == 0) {
            println(q)
        }
        q++
    }


}