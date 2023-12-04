import com.sun.jdi.connect.Connector.Argument

fun main() {

    //단항 연산자 : 항이 하나인 연산자

    // + : 양수

    val a1 : Int = 10
    val a2 : Int = -10

    val r1 : Int = +a1
    val r2: Int = +a2

    println("r1 : $r1")
    println("r2 : $r2")

    //- 음수

    //! Not 연산자
    val a3 : Boolean = true
    val a4 : Boolean = false

    val r5 : Boolean = !a3
    val r6 : Boolean = !a4

    println("a3 : $a3, r5 : $r5")
    println("a4 : $a4, r6 : $r6")

    //증감연산자

    println("--------------------")

    var a5 : Int = 10
    var a6 : Int = 10

    a5++
    a6++

    println("a5 : $a5")
    println("a6 : $a6")

    var a7 : Int = 10
    var a8 : Int = 10

    ++a7
    --a8

    println("-------------------")

    val r11 : Int = 10 + 3
    val r12 : Int = 10 - 3
    val r13 : Int = 10 * 3
    val r14: Int = 10 / 3
    val r15 : Int = 10 % 3

    println("$r11, $r12,$r13,$r14,$r15")

    //10부터 20까지
    val r16 : IntRange = 10..20
    println("r16 : $r16")

    println("----------------------")

    //+=

    var a9 : Int = 9
    var a10 : Int = 10
    var a11 : Int = 11
    var a12 : Int = 12
    var a13 : Int = 13

    a9 += 3 // a9 = a9 + 3
    a10 -= 3 //a10 = a10 - 3
    a11 *= 3 //a11 = a11 * 3
    a12 /= 3 //a12 = a12 / 3
    a13 %= 3 //a13 = a13 % 3

    println("$a9, $a10, $a11, $a12, $a13")

    println("-----------------------")

    //대입 연산자
    //true, false

    val a14 : Int = 10

    //a14가 10이랑 같은가
    //a14가 10이랑 같지않는가
    val r17 : Boolean = a14 == 10
    val r18 : Boolean = a14 != 10

    println("r17 : $r17")
    println("r18 : $r18")

//    //a14가 20이랑 같은가
//    //a14가 20이랑 같지않는가
//    val r19 : Boolean = a14 == 20
//    val r20 : Boolean = a14 != 20
//
//    println("r19 : $r19")
//    println("r20 : $r20")
//
//    println("-------------------")
//
//    //비교 연산자
//    //true false
//
//    val a15 : Int = 10
//    val r21 : Boolean = a15 < 20
//    val r22 : Boolean = a15 > 20
//    val r23 : Boolean = a15 <= 10
//    val r24 : Boolean = a15 >= 10
//
//    println("$r21, $r22,$r23,$r24")

    //연습
    var name : String = "Alexis"
    var age : Int = 3

    //${} $나 문자열에 똑같이 포함된다
    println("제 이름은 ${name} 입니다")
    println("제 나이는 ${age} 입니다")

    println("제 이름은 $name 입니다")
    println("제 나이는 $age 입니다")

    //하지만 문자열을 합칠시 ${}를 사용하여 +연산을 해줘야한다
    println("제 이름은 ${name + age} 입니다")


    //Unit
    Test()
    Test2()
//    //Noting
//    Test1()
    Test3("null")
    Test4("null")
    double(5)
}


//void함수로 반환
//코틀린 Unit 함수 자바에서는 Void 함수랑 같음
fun Test() {
    println("Unit 테스트 입니다")
}

////try - catch
////Nothing
//fun Test1(): Nothing {
//
////    while이 false일때 아무것도 값을 반환해주지 않아
////    return으로 에러처리를 해줘야한다
//
//    while(false){
//        println("에러")
//    }
//
//    return throw IllegalArgumentException("에러")
//}

//Unit 타입으로 반환
fun Test2() : Unit ? {

    return null
}

//Unit 예제
fun Test3(name : String ?) : Unit {
    if(name == null) {
        println("ok")
    }
    else {
        println("no")
    }
}

//Unit을 제네릭으로 활용한 경우

fun Test4(name : String) {

    if(name == null){

        return
    }

    else {
        println("아닙니다")
    }
}

//프리온보딩
//
//fun double(number : Int) : Int{
//
//    return number * 2
//}

//예시
//매개변수는 primitive를 따로 지정하지 않으면 val로 간주
fun double(number : Int) {

    //매개변수의 값을 변경할려고 할때
//    val Result : Int = number * 2
//
//    println("${Result}의 값은?")

    println("${number * 2}의 값은")
}

val doubleNumber : (number : Int) -> Int = { number ->
    number * 2
}

