# 목차
- [Algorithm](#algorithm)
- [STL](#stl)
- [시간 복잡도](#시간-복잡도)

<br>

## Algorithm
> - #### 정의
>   - 컴퓨터를 이용하여 문제를 풀기위한 방법을 과정이나 절차를 이용해 만들어 놓은 것입니다.
> - #### 5가지 필요조건
>   - input
>   - output
>   - definiteness 다른 해석의 여지가 없어야 함을 의미합니다.
>   - finiteness 반드시 유한한 횟수의 연산으로 결과를 만들 것을 의미합니다.
>   - efficiency 컴퓨터의 자원을 최대한 절약하면서 결과를 만들 것을 의미합니다.
<br>

## STL
> - #### Standard Template Library
> - #### 정의
>   - 다양한 자료구조와 관련 알고리즘을 미리 정의해 놓은 C++ 라이브러리입니다.
> - #### 사용 이유
>   - 길고 복잡할 수 있는 구현을 단순하게 만들어줍니다.
> - #### 구성 요소
>   - Container
>   - Iterator
>   - Algorithm
> - #### Container
>   - ##### sequence container (순차 컨테이너)
>       - 연속된 공간에 데이터를 저장하는 컨테이너입니다.
>       - Vector, List, Array, etc
>   - ##### associative container (연관 컨테이너)
>       - 저장된 데이터가 정렬된 컨테이너입니다.
>       - Set, Map, etc
>   - ##### container adapter (컨테이너 어댑터)
>       - 입력과 출력이 제한된 장소에서만 수행되는 컨테이너입니다.
>       - Stack, Queue, etc
> - #### Iterator
>   - 컨테이너에 저장된 원소를 순회하는 도구입니다.
>   - (*) 연산자 사용 가능
>   - ++, -- 연산자 사용 가능
>   - 비교, 대입 연산자 사용 가능
> - #### Algorithm
>   - `#include <algorithm>`
>   - `count - 조건에 맞는 요소의 개수를 센다.`
>   - 등등 수많은 알고리즘이 있습니다.
> - #### Vector
>   - 배열과 유사한 순차 컨테이너입니다.
>   - Iterator 가 random access 할 수 있습니다.
>   - 연속된 메모리 주소를 차지합니다.
>   - 새로운 원소의 삽임과 삭제에는 비효율적입니다.
> - #### List
>   - Linked List 와 유사한 순차 컨테이너입니다.
>   - Iterator 를 이용해서 원소에 접근할 수 있습니다.
>   - 새로운 원소를 삽입, 삭제하는 과정이 효율적입니다.
>   - 원소에 대한 direct access 가 불가능합니다.
> - #### Stack
>   - 컨테이너에 포함된 원소에 직접 접근할 수 없습니다.
>   - Vector 의 변형입니다.
>   - Iterator 를 허용하지 않습니다.
> - #### Queue
>   - Vector 의 변형입니다.
>   - Iterator 를 허용하지 않습니다.
>   - deque 의 일종으로 구현합니다.
> - #### Priority Queue
>   - Vector 의 변형입니다.
>   - Iterator 를 허용하지 않습니다.
>   - 저장되는 데이터는 내림차순으로 정렬됩니다.
> - #### Set
>   - 키라고 불리우는 원소를 저장합니다.
>   - Set 에 저장된 모든 원소는 유일합니다.(중복 x)
>   - Red-Black tree 로 구현되어 있습니다.
>   - 정렬된 상태를 유지하며 O(log n)의 내에서 해결됩니다.
>   - Iterator 는 tree 를 inorder traversal 하면서 결과를 출력합니다.
> - #### Map
>   - 키와 값의 쌍을 저장합니다.
>   - 모든 원소의 키는 유일합니다.

<br>

## 시간 복잡도
> - #### 