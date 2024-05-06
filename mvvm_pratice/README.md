
## RandomNumber 프로젝트
#### 기존에 만들었던 RandomNumber를 좀 더 보안하기로 했다
#### 1.코드가 엉망인점
#### 2.랜덤숫자뽑기 기능 : RoomDB에서 데이터를 원활히 받지 않았다
#### 3.삭제 기능 이벤트시 종료
#### 4. 동적 뷰X 리스트뷰 사용X

### 프로젝트 목적
#### MVVM 패턴에서 ViewModel의 역할, 클래스 내에서 LiveData와 MutableLiveData 활용방법
#### MVVM 패턴의 이해

## 사용기술
### ViewModel
#### RandomNumber 데이터 관리, Set,Get 함수를 설정
### LiveData - randomNumber를 관찰하면서 실시간으로 확인하여 UI에 표시
### MutableLiveData - 값이 변경이 가능 초기에 데이터를 저장하기 위해 필요

## 기능
### 랜덤번호를 뽑을 범위 지정 - EditText
### 추가 - AddBtn 이벤트시 값 저장
### 뽑기 - 1..N까지 범위를 RandomNuber 값을 UI에 표시

### 추가할 기능
#### 뽑은 RandomNumber 값을 리스트로 표현
