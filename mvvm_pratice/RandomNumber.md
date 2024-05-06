
## RandomNumber 프로젝트
### 프로젝트 설명
#### 번호의 범위를 설정하면 범위 내의 랜덤 값을 TextView에 표시하고 리스트로 보여진다.

### 프로젝트 목적
#### MVVM 패턴에서 ViewModel의 역할, 클래스 내에서 LiveData와 MutableLiveData 활용방법
#### MVVM 패턴의 이해
#### MVVM 패턴과 RecyclerView의 연결과 구조 이해

## 사용기술
### ViewModel - RandomNumber 데이터 관리, Set,Get 함수를 설정
### LiveData - randomNumber를 관찰하면서 실시간으로 확인하여 UI에 표시
### MutableLiveData - 값이 변경이 가능 초기에 데이터를 저장하기 위해 필요
### Repository - Model과 ViewModel 간에 독립적인 관계를 가지게 하기 위해 Repository가 Model을 관리, DB에 데이터를 요청하고 ViewModel에 데이터를 전송
### Model - RoomDB의 데이터 저장, DB연동, 데이터 Set
### RecyclerView - 리스트로 랜덤 값들을 보여짐

## 기능
### 랜덤번호를 뽑을 범위 지정 - EditText
### 추가 - AddBtn 이벤트시 값 저장
### 뽑기 - 1..N까지 범위를 RandomNuber 값을 UI에 표시
### 리스트

