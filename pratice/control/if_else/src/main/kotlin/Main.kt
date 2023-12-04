fun main() {

    val test : Int = 10

    //if문은 조건식의 값이 true일때 내부의 코드가 실행된다
    //순차 실행

    //if문만 있을때
    //결과값이 false이면 아무것ㄷ 실행되지 않는다

    //if - else if문일 떄
    //if문이 false일때 else if문으로 내려와 true인지 판별하고
    //else if문도 false이면 아무것도 실행하지 않는다

    //if - else if - else
    //if문, else if문이 false일때 else문으로 내려와 else문의 내부의 코드를
    //실행한다

    //10이 맞을때 true
    if(test == 10){

        println("10 입니다")
    }

    //10이 아닐때 true
    //그러니깐 디버깅창에 결과값이 출력이 되지않는다
    if(test != 10){
        println("10이 아닙니다")
    }

    //else 문 : 조건식이 false일때 실행
    if(test == 10){
        println("10 입니다")
    }

    else {
        println("10이 아닙니다")
    }

    if(test == 20){
        println("20입니다")
    }

    else {
        println("20이 아닙니다")
    }
//if -else if - else는 조건식이 많을때 사용
    //else는 무조건 1개만 사용
    if(test == 5){
        println("5입니다")
    }

    else if(test == 10){
        println("10입니다")
    }

    else{
        println("5, 10도 아닙니다")
    }

    //if문의 모든 조건식이 2가지 이상 만족해야할때
    val test2 : Int = 10
    val test3 : Int = 20

    if(test2 == 10 && test3 == 20){
        println("test2는 10이고 test3는 20입니다")
    }
    else {
        println("10, 20 아닙니다")
    }

    //예제 연습

    val test4 : Int = 13
    val test5 : Int = 21

    if(test4 == 10 && test5 == 20){
        println("test4는 10이고 test5는 20입니다")
    }

    else if(test4 == 15 && test5 == 25){
        println("test4는 15이고 test5는 25입니다")
    }

    else {
        println("둘다 아닙니다")
        println("test 4는 ${test4}이고 test 5는 ${test5} 입니다")
    }

    //조건문을 활용하여 변수 값을 설정
    //else if문은 사용이 안된다
    //and나 or은 사용가능
    val test6  : Int = 50
    val test7 : Int = 60
    val test_str : String = if (test6 > 50) "50보다 큽니다" else "50보다 작습니다"

    println(test_str)

    val test_str2 : String = if(test6 == 10 && test7 == 60) "true입니다" else "false 입니다"

    println(test_str2)
}