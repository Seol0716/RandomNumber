fun main() {


    //객체지향 프로그래밍
    //생성자

//
//    println("testvar : ${testclass.testvar}")
//    //멤버함수
//    testclass.testmethod()
//    println("${testclass2.v1} ${testclass2.v2}")


    var tst3 = TstClass3("hee", 26);
    var tst4 = TstClass3("ri", 1, "010-1234-1234");

    println("tst3.name : ${tst3.name}");
    println("tst3.age : ${tst3.age}");

    println("tst4.name : ${tst4.name}");
    println("tst4.age : ${tst4.age}");

    val p = Person("홍길동")
    var person = Person("김루피",11,"010-1111-2222")
}


class Person(name : String) {
    var name : String
    var age : Int
    var phoneNumber : String

    init {
        println("init 실행")
        this.name = name
        this.age = 0
        this.phoneNumber = " "
        println("${name} ${age}")
    }

    constructor(name : String, age : Int , phoneNumber: String) : this(name){
        println("보조 생성자 실행")
        println("${name} ${age} ${phoneNumber}")

    }

}

class person(val name : String, val age : Int, val phonenumber : String){

    init {
        this.name
        this.age
        this.phonenumber
    }


}
class x {

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


class TstClass3 constructor(name: String, age : Int) {
    var name =name;
    var age = age;
    var phoneNumber = "";

    constructor(name: String, age : Int, phoneNumber : String) : this(name, age) {
        this.phoneNumber = phoneNumber;
    }
}
