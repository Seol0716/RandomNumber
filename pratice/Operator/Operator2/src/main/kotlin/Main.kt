fun main(){

    //+,-,! 연산자
    //+ 연산자
    val a1 : Int = 10
    val a2 : Int = -10

    //+a = a = a + 10?
    val result1 : Int = +a1
    val result2 : Int = +a2

    //결과값 유추

    //양수 -> 양수
    //음수 -> 음수
    println("a1 : ${a1}, result1 : ${result1}")
    println("a2 : ${a2}, result2 : ${result2}")

    //- 연산자
    val result3 : Int = -a1
    val result4 : Int = -a2

    //양수 -> 음수
    //음수 -> 양수
    println("a1 : ${a1}, result : ${result3}")
    println("a2 : ${a2}, result : ${result4}")

    //Boolean 연산자 !

    val a3 : Boolean = true
    val a4 : Boolean = false

    //result5 = true - > false
    //result6 = false -> true
    val result5 : Boolean = !a3
    val result6 : Boolean = !a4

    println("a3 : ${a3}, result5 : ${result5}")
    println("a4 : ${a4}, result6 : ${result6}")


    //증감 연산자
    //++
    var a5 : Int = 10
    var a6 : Int = 10

    //후위 연산자
    val result7 : Int = a5++
    val result8 : Int = a6--

    println("a5 : ${a5}, r7 : ${result7}")
    println("a6 : ${a6}, r8 : ${result8}")

    //전위 연산자
    var a7 : Int = 10
    var a8 : Int = 10

    val result9 : Int = ++a7
    val result10 : Int = --a8

    println("a7 : ${a7}, r9 : ${result9}")
    println("a8 : ${a8}, r10 : ${result10}")

    val result11 : Int = 10 + 3
    val result12 : Int = 10 - 3
    val result13 : Int = 10 * 3
    //나머지
    val result14 : Int = 10 / 3
    //몫
    val result15: Int = 10 % 3

    println("${result11}, ${result12}, ${result13}, ${result14}, ${result15}")

    val result16 : IntRange = 10..20
    println("r16 : ${result16}")

    //대입연산자

    var a9 : Int = 10
    var a10 : Int = 10
    var a11 : Int = 10
    var a12 : Int = 10
    var a13 : Int = 10

    //a9 = a9 + 3
    a9 += 3

    //a10 = a10 - 3
    a10 -= 3

    //a11 = a11 * 3
    a11 *= 3

    //a12 = a12 / 3
    a12 /= 3

    //a13 = a13 % 3
    a13 %= 3

    println("${a9}, ${a10}, ${a11}, ${a12}, ${a13}")

    //비교연산자

    val a14 : Int = 10
    val r16 : Boolean = a14 == 10
    val r17 : Boolean = a14 != 10

    //true , false
    println("${r16} , ${r17}")


    val r18 : Boolean = a14 == 20
    val r19 : Boolean = a14 != 20

    //false , true
    println("${r18} , ${r19}")

    //비교연산자

    val a15 : Int = 10
    val r21 : Boolean = a15 < 20
    val r22 : Boolean = a15 > 20
    val r23 : Boolean = a15 <= 10
    val r24 : Boolean = a15 >= 10

    //true, false, true, true
    println("${r21}, ${r22}, ${r23}, ${r24}")
}