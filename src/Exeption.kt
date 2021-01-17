fun main() {

    //обозначаем "?" что переменная может быть нулл
    var a: String? = "abc"
    a = null
    println(a)


    //обозначаем "?" что переменная может быть нулл
    var b: String? = "abc"
    b = null
    //если уверены что будет нулл то "!!" ставим
    println(b!!.length)

}