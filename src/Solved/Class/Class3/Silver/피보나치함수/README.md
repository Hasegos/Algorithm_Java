# 피보나치 함수

## 목차

1. 문제 주소 : `https://www.acmicpc.net/problem/1003`
2. [문제 시작](#문제)
3. [해결방안](#해결방안)
4. [Class 3 목차 돌아가기](../README.md)
___

### [해당 코드](./피보나치함수.java)

## 통과

<img src="https://github.com/user-attachments/assets/1c3ca668-32ca-48f6-b0e6-c0714ba30c71">

## 문제

다음 소스는 N번째 피보나치 수를 구하는 C++ 함수이다.

```cpp
int fibonacci(int n) {
    if (n == 0) {
        printf("0");
        return 0;
    } else if (n == 1) {
        printf("1");
        return 1;
    } else {
        return fibonacci(n‐1) + fibonacci(n‐2);
    }
}
```
fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.

+ fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
+ fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
+ 두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
+ fibonacci(0)은 0을 출력하고, 0을 리턴한다.
+ fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
+ 첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
+ fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.

1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.

___

## 입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.

___

## 출력

각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다.

___

## 예제 입력 1

3 <br>
0 <br>
1 <br>
3

---

## 예제 출력 1

1 0 <br>
0 1 <br>
1 2

---

## 예제 입력 2

2 <br>
6 <br>
22

---

## 예제 출력 2

5 8 <br>
10946 17711

---

## 해결방안
**1.해당 문제는 피보나치 수열에서 이미 중복된 계산을 하지말고 이미 저장된(캐시) 값을 가져와서 해결해야된다.** <br>
**2.TopBottom 으로 0과 1이 몇번 사용했는지 알아야하기에 0과 1이될때 그 값을 더해야한다.**<br>
**ex) 3 -> 2 / 1 -> 1, 1, 0 이렇게된다.**<br>
**즉, 만약 f(3) = f(2) + f(1) 인데 f(2)의 값이 존재한다면 계산하지말고 저장된값을 가져온다**<br>

[맨위로 이동하기](#피보나치-함수)