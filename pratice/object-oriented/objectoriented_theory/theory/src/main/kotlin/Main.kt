fun main() {


    //객체지향 프로그래밍
    //생성자

    //객체생성
    val testclass = TestClass()
    val testvar = testclass.testvar

    //멤버변수
    println("testvar : ${testclass.testvar}")
    println("temethod : ${testclass.testclassmethod()}")
}

class TestClass {

    //멤버변수
    val testvar : Int = 10


    //멤버함수
    fun testclassmethod() {
        println("멤버함수 입니다")
    }

}

//기본 생성자

class TestClass2 constructor(var v1 : Int, var v2 : Int){

}

class TestClass3(var al : Int, var a2 : Int){

}

class Testclass4(var a1 : Int , val a2 : Int){

    init {
        println
    }
}