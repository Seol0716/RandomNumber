fun main() {

    //정수 리터럴
    println(100);
    //값이 20억이 넘어갈때 L을 붙히지 않아도
    //자동으로 자바코드로 변환할때 L을 붙여준다
    println(10000000000)
    println(914_100_414_314)

    //실수 리터럴
    println(11.11)
    println(22.22F)

    //문자 리터럴
    println('A')
    println('가')

    //문자열 리터럴
    println("문자열")

    //논리 리터럴
    println(true)
    println(false)

    //Raw String
    println("동해물과 백두산이 \n 마르고 닳도록 \n 하느님이 보우하사 \n 우리나라 만세")

    //""" Raw String """
    //긴 문장시 좋음
    println("""동해물과 백두산이
        |마르고 닳도록
        |하느님이 보우하사
        |우리나라 만세
    """.trimMargin())

    //변수 선언
    //var 값을 다시 저장가능
    //메모리를 많이 쓰고 단점 속도가 느리다

    //val 다시 저장X
    //속도가 빠르다

    println("----------------------------")

    val a : Int = 100
    println("a : ${a}"  )

    //변수형 타입 생략 가능
    //저장하는 값에 따라 자동으로 타입결정
    var b = 200

    println("----------------------")
    var a1:Int = 100
    val b1:Int = 100

    println("a1 : ${a1}")

    a1 = 200
    println("a1 : ${a1}")

    //val 변수는 값을 다시 저장하지 못한다
    //수정시 에러
    //오류코드
//    b1 = 200

    println("b1 : ${b1}")

    println("-------------------")
    //Null 허용 변수
    // "?" //Null을 허용
    //"!!" //Null을 허용X

    var a5:Int = 200
    var a6:Int ?= null

    println("a5 : ${a5}")
    println("a6 : ${a6}")

    var a7:Int ?= a5
    println("a7 : ${a7}")

//    //오류코드
//    var a8:Int ?= a6!! //널이 아님을 선언했지만 a6값에는 Null이므로 실행시 오류 발생
//    println("a8 : ${a8}")
}