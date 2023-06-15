<h1>Binding</h1>
<h3>공부한 내용</h3>

--------------------

+ ### [이론] ViewBindind이 나온이유</h4>

     ##### findViewById의 문제점

     findViewById는 뷰와 id를 연결하여 사용할 수 있도록 한다. 
     하지만 뷰의 연결하는 개체수가 많아질수록 반복작업이 많아지고 느려진다는 단점이 있다.


    #### Kotlin-extensions

     그런 단점을 최소화하기 위하여 "Kotlin-extensions"라는 라이브러리가 등장했다. 
     하지만 다른 레이아웃간의 연결이 가능하고 자칫 잘못하면 Null-point의 치명적인 오류가 발생할 가능성이 있기에 사용이 중단되었다. 

     +하지만 플러그인에 추가하여 사용은 가능하다.

+ ### ViewBinding

    ####  실습
    ViewBinding + Fragment를 활용하여 Button 클릭시 text가 변하도록 연습을 하여 사용법을 익혔다.
    사용방법은 ActivityBinding을 사용하고 뷰와 연결하는 특징이 있다.
    
+ ### DataBinding

     ####  실습
     DataBinding + Fragment를 활용하여 Button 클릭시 text가 변하도록 하는 연습을 하여 사용법을 익혔다.
     사용방법은 xml 파일에 <layout> </layout>으로 layout을 감싸도록 하고 ActivityBinding DataBindingUtil을 사용하여 View와 연결하는 특징이 있다.
     
+ ### RecyclerView + ViewBinding


+ ### RecyclerView + DataBinding
