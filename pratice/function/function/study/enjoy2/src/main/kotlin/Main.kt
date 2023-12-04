fun main() {

    test1(10)
    test2(10, 1.5)

    //named arguments
//    test3(i = 2, i2 = 2)
    test3(i2 = 2)
    test4()
    test5(1,2)

    //인스턴스 초기화
    seq(10,20)

    println(test6(1,2,3.4))

}


//parameters
//함수나 메서드에 정의되는 변수
//매개변수는 파스칼 표기법을 사용하여 정의
//쉼표로 구분하며 각각의 매개변수는 명시적으로 입력

fun test1(test1 : Int) {
    println(test1)
}

//다수의 매개변수를 나타낼때
//trailing comma
//후햄쉼표
fun test1(test1 : Int, test2 : Double){
}

//default arguments
//기본인자
//인자값 호출이 없을때 설정한 기본인자값으로 출력
fun test2(test1 : Int = 10, test2 : Double) {
    println("테스트 결과 ${test1}  ${test2}")
}

//method overriding
open class A {
    open fun foo(i : Int = 10) {
        println(foo())
    }


}

class B : A() {
    override fun foo(i : Int) {
        println(foo())
    }
}

//named arguments
fun test3(i: Int = 10, i2: Int) {
    println("${i} ${i2}")
}


//default value
fun test4(i : Int = 10, i2 : Int = 11){
    println("${i} ${i2}")
}

//Unit
fun test5(i : Int, j : Int) {
    println("${i} ${j}")
    println("Unit 테스트 입니다")
}


//단일 표현식
fun test6(a : Int, b : Int , c : Double) = a + b + c

class seq {
    init {
        println("init 초기화")
    }

    constructor(i : Int = 20, j : Int = 20){
        println("${i} ${j}")
    }
}