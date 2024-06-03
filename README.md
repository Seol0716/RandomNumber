# 랜덤번호 뽑기
### 프로젝트 설명
#### 숫자를 입력한다. 이 값은 범위를 지정하는 것이며, 뽑을 때 마다 1부터 N 까지 범위 내 한 개의 번호를 화면에 보여진다. 마지막으로 리스트의 스크롤 기능을 통해 여러 뽑은 번호를 확인도 가능하다

### 프로젝트 목적
#### MVVM 패턴 연습
#### 구조 이해

## 사용언어
#### 코틀린

## 사용기술
#### ViewModel 
#### LiveData 
#### Repository 
#### Model 
#### RecyclerView 
#### RoomDB
#### ViewBinding
#### Random 라이브러리

## 기능
### 범위설정 
### 뽑기 
### 당첨번호 리스트

## 배운점
### ViewModel
#### ViewModel lifecycler은 액티비티 생명주기에 같이 활동을 하며 UI와 데이터의 상태를 관리한다.
#### 1.UI 상태관리: 회전 및 화면 구성 변경에도 데이터를 유지
#### 2.비지니스 로직 처리: ViewModel에서 View의 이벤트 및 기능을 ViewModel에서 구현을 하여 독립적인 상태 유지
#### 3.비동기 작업 관리: ViewModel에서 구현된 기능내의 여러 작업을 처리할때 ViewModelscope,CoroutineScope을 구현해 처리
#### 4.데이터 상태관리: UI의 데이터를 유지하고 상시 업데이트를 해준다: LiveData
