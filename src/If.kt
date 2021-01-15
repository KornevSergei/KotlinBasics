fun main() {


    var age: Int
    var isAdult: Boolean
    var isMan: Boolean = true

    age = 30

    

    if (age > 18) {
        println("Больше 18")
        isAdult = true

    } else {
        println("Меньше 18")
        isAdult = false
    }


    if (isAdult && isMan) {
        println("Уже можно")
        println("Мужик")

    } else if (isAdult && !isMan) {
        println("Ещё нельзя")
        println("Баба")
    }
}