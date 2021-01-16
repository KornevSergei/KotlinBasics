fun main() {

    //если не планируем добавлять
    var map1 = mapOf("a" to 1, "b" to 2, "c" to 3)

    
    //если планируем добавлять
    var map2 = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    //добавляем
    map2["d"] = 4


    //если весь массив
    println(map1)
    //если к конкретному элементу
    println(map1["b"])


    //выводим весь список
    println(map2)

}