fun main() {

    //вариант конструктора сразу в классе
//    class Person(name: String,age: Int, isMarried: Boolean ) {


    //создали класс
    class Person {
        //Если просто обозначеем переменную ничего не присваивая
        var name: String
        //Если указываем параметры изначально
        var age = 0
        var isMarried = true

        //делаем конструктор без параметров
        constructor() {
            this.name = "111"+ "222"
            this.age = age
            this.isMarried = isMarried
        }


        //делаем конструктор с параметрами
        constructor(name: String, age: Int, isMarried: Boolean) {
            this.name = name
            this.age = age
            this.isMarried = isMarried
        }


    }

    //создали обьект класса
    var sergei = Person()

    //создали обьект класса с параметрами
    var irina = Person("Irina",31, false)


    //присвоили новые значения
    sergei.age = 30
    sergei.isMarried = false

    //выводим значения обьекта
    println(sergei.name)
    println(sergei.age)
    println(sergei.isMarried)

    println(irina.name)
    println(irina.age)
    println(irina.isMarried)
}