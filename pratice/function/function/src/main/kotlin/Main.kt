fun main() {

    //함수
    test1()

    //매개변수
    test2(100,100.1100)

    //직접 매개변수 값을 지정가능
    test2(a1 = 200, a2 = 100.11)

    test3(a2 = 33.33)

    val re1: Int = test4(100,200)
    val re2 : Int = test4(200,300)

    println("re1 : ${re1}")
    println("re2 : ${re2}")
    println("-----------------")
    test5()

    test7()
    test7(100)
    test7(11.11)
    test7(100,11.11)
    test8(8,7)
}

fun test1() {
    println("test1 호출")
    println("----------------")
}

fun test2(a1 : Int , a2 : Double){
    println("test2 호출")
    println("a1 : ${a1}")
    println("a2 : ${a2}")
    println("-----------------")
}

//매개변수에 기본값을 설정해놓은 경우
fun test3(a1 : Int = 100, a2 : Double = 0.0){
    println("-------------------")
    println("test3 호출")
    println("a1 : ${a1}")
    println("a2 : ${a2}")
    println("-----------------")
}

//리턴
fun test4(a1 : Int = 100, a2 : Int = 300) : Int {
    val result : Int = a1 + a2

    return result
}

//void
fun test5() : Unit{

    println("test 5 호출")
}

//함수의 오버로딩
fun test7(){
    println("test 7 호출 - 매개변수 없음")
    println("--------------------------")
}

fun test7(a : Int){
    println("test7 호출 - 매개변수 한개(int")
    println("--------------------------")
}


fun test7(a : Double){
    println("test7 호출 - 매개변수 한개(double")
    println("--------------------------")
}


fun test7(a : Int, b : Double){
    println("test7 호출 - 매개변수 두개(int,double)")
    println("--------------------------")
}

//인자값은 val일까 var값 일까

fun test8(a : Int, b : Int) {

    a = 10
    println(a)
}

