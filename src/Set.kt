fun main() {

    //нельзя добавить одинаковые элементы
    var set = mutableSetOf("a", "b", "c")

    //добавляем
    set.add("d")

    //присываиваем айтем через цикл и выводим
    for (item in set) {
        println(item)
    }
    

}