# 재귀의 귀재

## 목차

1. 문제 주소 : `https://www.acmicpc.net/problem/25501`
2. [문제 시작](#문제)
3. [해결방안](#해결방안)
4. [재귀 목차로 돌아가기](../README.md)
___

## 문제

정휘는 후배들이 재귀 함수를 잘 다루는 재귀의 귀재인지 알아보기 위해 재귀 함수와 관련된 문제를 출제하기로 했다.

팰린드롬이란, 앞에서부터 읽었을 때와 뒤에서부터 읽었을 때가 같은 문자열을 말한다.<br>
팰린드롬의 예시로 AAA, ABBA, ABABA 등이 있고, 팰린드롬이 아닌 문자열의 예시로 ABCA, PALINDROME 등이 있다.

어떤 문자열이 팰린드롬인지 판별하는 문제는 재귀 함수를 이용해 쉽게 해결할 수 있다.<br>
아래 코드의 isPalindrome 함수는 주어진 문자열이 팰린드롬이면 1, 팰린드롬이 아니면 0을 반환하는 함수다.

```
#include <stdio.h>
#include <string.h>

int recursion(const char *s, int l, int r){
    if(l >= r) return 1;
    else if(s[l] != s[r]) return 0;
    else return recursion(s, l+1, r-1);
}

int isPalindrome(const char *s){
    return recursion(s, 0, strlen(s)-1);
}

int main(){
    printf("ABBA: %d\n", isPalindrome("ABBA")); // 1
    printf("ABC: %d\n", isPalindrome("ABC"));   // 0
}
```

정휘는 위에 작성된 isPalindrome 함수를 이용하여 어떤 문자열이 팰린드롬인지 여부를 판단하려고 한다.

구체적으로는, 문자열 $S$를 isPalindrome 함수의 인자로 전달하여 팰린드롬 여부를 반환값으로 알아낼 것이다.<br>
더불어 판별하는 과정에서 recursion 함수를 몇 번 호출하는지 셀 것이다.

정휘를 따라 여러분도 함수의 반환값과 recursion 함수의 호출 횟수를 구해보자.

___

## 입력

첫째 줄에 테스트케이스의 개수 $T$가 주어진다. ($1 \leq T \leq 1\,000$)

둘째 줄부터 $T$개의 줄에 알파벳 대문자로 구성된 문자열 $S$가 주어진다. ($1 \leq \vert S\vert \leq 1\,000$)

---

## 출력

각 테스트케이스마다, isPalindrome 함수의 반환값과 recursion 함수의 호출 횟수를 한 줄에 공백으로 구분하여 출력한다.

---

## 예제 입력 & 출력 1

| 예제 입력 | 예제 출력 |
|-----|-----|
| 5<br>AAA<br>ABBA<br>ABABA<br>ABCA<br>PALINDROME    | 1 2<br>1 3<br>1 3<br>0 2<br>0 1    |

---

## 해결방안
**1.문자열이 팰린드롬인지 재귀 함수를 이용해 판별하고, 재귀가 몇 번 호출되는지도 함께 출력하는 문제이다.**<br>
**2.문자열의 왼쪽 인덱스(l)와 오른쪽 인덱스(r)를 비교하며, 두 값이 같으면 안쪽(l+1, r-1)으로 재귀 호출을 진행한다.**<br>
**3.l이 r보다 크거나 같아지면 팰린드롬이 성립하므로 1을 반환하고, 중간에 문자가 다르면 0을 반환한다.**<br>
**4.재귀 함수가 호출될 때마다 호출 횟수를 증가시켜, 팰린드롬 여부와 함께 총 재귀 호출 횟수를 출력한다.**

### 👉 [해당 코드 보기](BOJ_25501_재귀의귀재.java)

---

[⬆ 맨위로 이동하기](#재귀의-귀재)