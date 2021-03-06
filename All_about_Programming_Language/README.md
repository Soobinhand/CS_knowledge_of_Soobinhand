## Introduction
- ### 옛날의 프로그래밍
    - #### 이전의 컴퓨터는 괴물같은 장치였다.
    - #### 프로그래머들은 쌌다.
    - #### 기계어로 프로그래밍을 했다.
- ### 기계어
    - #### 프로세서를 직접 제어하는 비트 순서(데이터를 한 곳에서 다른 곳으로 추가, 비교, 이동 등)
    - #### 예) 유클리드의 알고리즘을 이용한 두 정수의 최대공약수 계산하기
        - 55 89 e5 53 83... -> 기계어
- ### 다음 단계는 어셈블리어로 쓰는 것이었다.
    - #### 니모닉 약어 사용(연상기호)
- ### 어셈블리어
    - #### 어셈블러가 번역한 기계어 명령어와 니모닉 사이의 일대일 매핑.
    - #### 어셈블러는 "매크로 확장"으로 증강되어 일반적인 명령 시퀀스에 대한 파라미터화된 약어를 정의합니다.
- ### 기계어보다 쉬워졌지만 여전히 어렵고 기계중심적임
    - #### 특정 시스템에서만 돌아감
- ### 수치 계산 기능을 갖춘 기계 중립 프로그래밍 언어에 대한 꿈
    - #### Fortran
    - #### 인간은 컴파일된 코드보다 더 빠른 프로그램을 작성할 수 있었다.
- ### Lisp 나 Algol 같은 더 높은 단계의 언어가 소개됨
- ### 고급 언어에서 어셈블리 또는 기계어로 변환하는 것은 컴파일러의 작업이다.
    - #### 소스와 대상 작업 간에 1:1 대응이 없기 때문에 어셈블러보다 복잡합니다.
- ### 실행 능력 격차가 좁혀졌다가 결국 역전됐다.
- ### 프로그래머의 노력을 절약해야 합니다.
    - #### 프로그램의 원래 구성.
    - #### 후속 프로그램 유지 - 개선 및 수정
    - #### 노동 비용은 이제 하드웨어 비용보다 비싸다.

<br>

## The Art of Language Design
- ### 왜 이렇게 많은 프로그래밍 언어들이 존재할까?
    - #### 진화 - 우리는 시간이 지남에 따라 일을 더 잘하는 방법을 배워옴.
        - #### 일을 성취하기 위한 끊임없는 발전
        - #### goto 기반 제어 흐름 (Fortran, Cobol, Basic)
        - #### 구조화된 프로그래밍
            - #### goto 대신에 while, switch 같은 흐름 제어를 사용함 (Algol, Pascal, C, Ada)
        - #### 객체 지향 프로그래밍 (Smalltalk, C++, Eiffel, Java, C#)
        - #### 스크립트 언어는 빠른 개발을 위해 컴파일 언어를 대체 (Python, Ruby)
    - #### 특정 목적
        - #### 특정 문제 영역을 위해 설계됨
            - #### Lisp - 기호 데이터 및 복잡한 데이터 구조 표현
            - #### Icon, Awk 는 문자열을 조작하는데 좋음.
            - #### C - 하드웨어를 건드리기 쉬움.
            - #### Prolog - 데이터 간 논리적 관계 추론.
        - #### 다른 일반 작업에 사용할 수도 있지만 전문 분야에 중점을 둔다.
    - #### 개인적 선호도
        - #### 서로 취향이 다름.
        - #### 재귀 / 반복
        - #### 모든 사람들을 만족시키는 언어를 만드는 것은 불가능함.
- ### 무엇이 언어를 성공하게 만드는가?
    - #### 표현력
        - #### 한언어에 대한 고찰은 다른 것보다 강함.
        - #### 언어 특징
            - #### 특히 매우 큰 시스템의 경우 명확하고 간결하며 유지 관리 가능한 코드를 작성하는 프로그래머의 능력에 큰 영향을 미칩니다.
    - #### 초보자가 쉽게 사용
        - #### Basic, Pascal
    - #### 구현하기 쉬움
        - #### Basic, Forth, Squeak, Pascal
    - #### 표준화
        - #### 플랫폼 간 코드 이식성을 보장하는 유일하고 효과적인 방법
    - #### 오픈 소스
        - #### 오늘날 대부분의 언어들은 적어도 하나의 오픈소스 컴파일러나 인터프리터가 있음
    - #### 훌륭한 컴파일러들
        - #### Fortran and Common Lisp
    - #### 경제적, 큰회사의 지원, 관성
        - #### 기술적 장점 이외의 요소들이 성공에 영향을 미친다.
        - #### 강력한 스폰서의 후원
        - #### 일부 언어는 설치된 소프트웨어와 프로그래머 전문지식의 기반 때문에 널리 사용되고 있음.
- ### 어떤 요소도 언어가 좋은지 아닌지를 결정짓지 못한다.
- ### 특히 프로그래머와 언어 구현자 둘 다의 관점에서 문제를 고려해야 합니다.

    
    
