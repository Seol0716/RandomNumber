fun main() {


    //객체지향 프로그래밍
    //생성자

    //객체생성
    val testclass = TestClass()
    val testclass2 = TestClass(1,2)
    //멤버변수

    println("testvar : ${testclass.testvar}")
    //멤버함수
    testclass.testmethod()
    println("${testclass2.v1} ${testclass2.v2}")


}

class TestClass {

    var v1 : Int = 0
    var v2 : Int = 0

    //멤버변수
    val testvar : Int = 10

    fun testmethod() {
        println("멤버함수 입니다")
    }

    //생성자
    init {
        println("객체가 생성되면 자동으로 수행하는 코드입니다")
    }

    //constructor
    //constructor는 매개변수와 자료형을 사용하여 여러개 만들 수 있다


    constructor() {
        println("매개변수가 없는 생성자")
    }

    //매개변수가 있는 생성자
    constructor(i : Int , j : Int ) {
        v1 = i
        v2 = j
    }


}