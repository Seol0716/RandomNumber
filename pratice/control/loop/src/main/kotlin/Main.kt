fun main() {

    //for문
    //지정한 변수에 반복된 값을 넣어준다

    //..을 활용

    val test1 : IntRange = 1..10

    for(i in test1){
        println("i : ${i}")
    }

    //step
    //n씩 증가
    val test2 = 1..10 step 2

    for(i in test2){
        println("i : ${i}")
    }

    //역순
    val test3 = 10 downTo 1 step 2

    for(i in test3){
        println("i : ${i}")
    }

    //차이 값 비교
    val test4 = 3 compareTo 2
    println(test4)

    var test5 = 10

    //while
    //주어진 조건식이 true일 경우 반복된다
    //조건식이 false일 경우 한번이라도 수행X

    while(test5 >= 5){
        println("test5 : ${test5}")
        test5--
    }

    //do - while
    //조건식이 true일때 반복
    //조건식이 하단에 있으므로 false라도 한번은 실행한다

    var test6 = 0

    do {
        println("test6 : ${test6}")
        test6++
    } while (test6 <= 10)

    var test7 = 0
    //조건식이 false일 경우
    do {
        println("test7 : ${test7}")
        test7++
    } while( test7 == 1)
}