Retrofit2

Retrofit Server에 있는 데이터를 받아와 Log를 찍어 확인을 하였습니다.

RetrofitInstance.kt
Retrofit을 생성하여 Uri를 작성해 서버와 연결

MyApi.kt

    @GET("posts/1")
    fun getPost1() : Call<Post>
    
    post1에 있는 데이터를 받아와 post data class에 콜백을 받는다.
    
    @GET("posts/{number}")
    fun getPostNumber(
        @Path("number") number : Int
    ) : Call<Post>

여기 부분에서 헷갈렸는데 uid,id,title 등 있지만 어떤 값을 리턴 받는지 궁금해서 Log를 찍어 확인했습니다.
결과로 number은 ID값을 받아와 body.toString()으로 그 인덱스에 있는 값을 가져오는것이었습니다.

마지막으로 비동기적 실행에서 코드를 간소화하고 최소화하기 위해서 Coroutine을 사용한다는것을 알았습니다,
다음 예제를 통해서 학습을 할 예정

