fun main() {

    val test1 : Int = 10

    //2개 이상 문장 실행시 블록처리
    //,를 사용하여 2개 이상 값도 하나로 처리가능
    //범위도 지정가능
    //else도 사용가능
    //when은 ->로 표현 else도 포함
    //when은 수식이나 결과값에 따라 코드를 분기해서 수행하는 제어문

    when(test1){
        10 -> {
            println("이 코드가 실행합니다")
            println("10 입니다")
        }
        1 -> println("1 입니다")
    }

    //연습
    val test2 : Int = 10
    when(test2){

        1 -> println("1이 실행됩니다")
        2 -> println("2가 실행됩니다")
        3 -> println("3이 실행됩니다")

        else -> {
            println("1 2 3이 아닙니다")
            println("10이 실행됩니다")
        }
    }

    //연습2

    //범위도 설정이 가능한가
    val test3 : Int = 2
    when(test3) {

        1,3 -> println("1이거나 3입니다")
    }

    //범위 지정연습
    val test4 : Int = 2

    when(test4) {

        in 1..3 -> println("1에서 3 사이의 숫자입니다")
        in 4..6 -> println("4에서 6사이의 숫자입니다")
        in 7..9 -> println("7에서 9사이의 숫자입니다")
    }

    val str : String = setValue(5)
    val num : String = testCode(5)
    println(str)
    println(num)
}

//if문과 when문을 활용하여 값을 세팅
//when을 사용할때 값을 세팅할 경우에는 else를 붙여야된다
fun setValue(test1 : Int) = when(test1){

    1 -> "문자열1"
    2 -> "문자열2"
    3 -> "문자열3"

    else -> "그 외의 문자열"
}


//연습
//함수 if문 연습
fun testCode(num : Int): String = if(num == 1) "1입니다" else "다른 값 입니다"

