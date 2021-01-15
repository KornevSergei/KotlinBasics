fun main() {

    //В эти не можем добавлять новые значения
    var myArray = arrayOf(1, 3, 5, true, 6.93, 569, "Hello")

    //В эти не можем добавлять новые значения
    //В эти можем помещать только которые указали
    var myList = listOf<Double>(2.1, 4.1, 6.1)


    //В эти можем помещать значения все значения
    var mutableList1 = mutableListOf(1, 59, 36.9)

    //В эти можем помещать значения все значения
    //В эти можем помещать только которые указали
    var mutableList2 = mutableListOf<Double>(1.395, 59.3, 36.9)
    var mutableList3 = mutableListOf<String>("", "Hello!", "Hi!")

    //добавляем один элемент
    mutableList3.add("Goodbye!")
    //добавляем в Лист ещё один целый лист
    mutableList2.addAll(myList)


    println(mutableList3)

    println(mutableList2)


}