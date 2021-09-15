# 목차
- [Database](#database)
- [DBMS](#dbms)
- [DBMS 와 File System](#dbms--file-system)
- [관계형 데이터베이스](#관계형-데이터베이스)

<br>

## Database
> - #### 정의 
>    - 다양한 사람이 공유하여 사용할 목적으로 체계화해 통합, 관리하는 **데이터의 집합**입니다.
>    - 데이터베이스는 아주 클 수도 있습니다.

<br>

## DBMS
> - #### DataBase Management System
> - #### 정의     
>   - 다수의 사용자들이 DB 내의 데이터를 접근할 수 있도록 해주는 소프트웨어입니다.
> - #### 특징      
>   - 데이터와 관련된 모든 작업 및 관리를 합니다. (추가/삭제/변경/검색 등등)
>   - 사용하기에 편리하고 효율적이어야 합니다.
>   - 그 종류로는 MySQL, Oracle, Postgres 등등이 있습니다.

<br>

## DBMS 와 File System
> - File System 으로 데이터베이스를 관리한다면
>   - 중복, 불일치, 접근의 어려움, 제약에 대한 어려움, 비원자성, 동시접근 문제, 보안에 취약 등등 
> 많은 단점이 있습니다.
> - 하지만 DBMS 로 관리한다면 위의 모든 문제를 해결할 수 있습니다. 

<br>

## 관계형 데이터베이스
> - #### 정의
>   - 관계형 데이터 모델에 기초를 둔 데이터베이스입니다.
> - #### 특징
>   - 관계형 데이터베이스는 다수의 테이블(table)의 모임으로 구성되어 있습니다.
>   - table 은 relation 이라고도 부르며, column(attribute), row(tuple) 를 갖고 있습니다.<br><br>
> - ![img.png](img.png)
> - ![img_1.png](img_1.png)
> - #### attribute 의 세 가지 속성
>   - 속성이 가질 수 있는 값의 데이터 타입을 정할 수 있습니다. (int, string 등등)
>   - atomic (원자적) 즉 더 이상 쪼갤 수 없습니다.
>   - null 값을 가질 수 있습니다.
> - #### Relation Schema
>   - Schema 는 고정적이며 변할 수 없습니다.
>   - R(A1, A2, A3) 에서 R 은 relation 이름, 괄호 안에 있는 것들은 attribute 입니다.
>   - R(A1, A2, A3)를 relation schema 라고 합니다.
> - #### Relation Instance
>   - 특정 시간에 데이터베이스에 있는 데이터입니다.
>   - schema 와는 달리 변경될 수 있습니다.
> - #### 나쁜 디자인의 relation 이 되지 않는 방법
>   - null 값은 사용하지 않는 것이 좋습니다.
>   - 중복값이 저장되어 있지 않아야 합니다.(정보 불일치 현상이 발생합니다.)
>   - 한 relation 에 모든 것을 넣는 설계는 좋은 설계가 아닙니다.