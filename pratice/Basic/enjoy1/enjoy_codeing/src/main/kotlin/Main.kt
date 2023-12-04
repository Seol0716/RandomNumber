fun main() {

    val test_str : String = "41414"
    val test_int : Int = 4

    //자동 형변환 연습
    //문자형과 정수형 일때
//    //오류 : 타입이 다를때 +연산자를 정의할 수 없다
//    println("test 결과 : ${test_str + test_int}")

    //서로 다른 타입으론 할 수 없다 두 타입중 형변환캐스팅을 통해 연산이 가능

    val test_result = test_int.toString()

    //$는 어떨때 사용하는가? print나 println 출력시 문자열내에 변수를 출력할 때 사용
    println("Test 결과 1 : ${test_result + test_str}")

    //바이트 값 확인

    //정수형 바이트값
    val show_int_byte = test_int.toByte()

    println("바이트 값 확인 : ${show_int_byte}")

    val test_long = -543_7847_3984_7238_4723

    println("result : ${test_long + test_int}")

    val test_float = 10.1414f
    println("result1 : ${test_int + test_float} ")

    var show_str : Int = 10

    //문자열로 캐스팅
    val show_test = show_str.toString()

    println(show_test)
}