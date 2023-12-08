fun main() {

    val test : Int = 10
    //return return은 값을 되돌려 받는게 아니라
    //수행중인 함수를 종료하는 구문
    //반환 값이 있을경우 함수를 종료한 다음 반환 값을 작성

    //순차적으로 작업을 수행하다가 return을 만나면
    //함수를 종료후 리턴값을 호출한 함수로 가져가 값을 보내준다

    val result = test1(100)
    println("${result}")

    val result2 = testfun2(0)

    println("${result2 }")


    //break
    //조건에 만족하면 다음 작업이 있더라도 종료

    for(item in 1..10){

        if(item > 5){
            break
        }
        println("item : ${item}")
    }

    //continue
    //continue를 만나면 다음 반복을 진행하도록 한다


    for(item in 1..10){

        if(item % 2 == 0){
            continue
        }
        println("item : ${item}")
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


}

fun test1(i : Int) : Int {
    println("return 연습입니다")

    return i + 100
}

fun testfun2(i : Int) {

    if( i == 0){
        return
    }

    println("100 입니다")
}