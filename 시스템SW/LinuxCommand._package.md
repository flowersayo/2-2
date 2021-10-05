# ➕LinuxCommand_package 
`부가적인 리눅스 커맨드 모음 ver. package`

## 📢패키지 관리 (Package Mangagement)
:
: 우리가 커맨드를 입력하고 엔터키를 누를때마다, bash가 우리의 명령어를 실행하기 이전에 텍스트에서 몇가지 대체를 수행하는것.


## 경로명 확장 (Pathname Expansion)
### 💲echo 
\# ehco 아니다😓 \#따라쟁이
- shell builtin 커맨드
- standard output 형태로 텍스트를 출력해준다. 


```
echo * : 현재 경로에있는 모든 파일들을 출력한다. (Pathname expansion)
echo 문자(열)* : 문자(열)로 시작하는 디렉토리만 출력한다. 
echo *문자(열) : 문자(열)로 끝나는 디렉토리만 출력한다.
echo ~ : 사용자의 홈 디렉토리를 출력한다. ex ) /c/Users/flowe (Tilde expansion)
```

🔍더 자세한 ehco 사용법
https://jjeongil.tistory.com/997

## 💠산술확장 (Arithmatic Expansion) 

- shell은 수학공식이 expansion에 의해 수행될 수 있도록 한다.
- shell prompt를 계산기로서 이용가능하게 해준다.
- 기본 형태 : `$((expression))` 

```
echo $((2+2)) //4
echo $(((5**2)*3)) //75
echo $((5/2)) //2 -> support only integer arithmetic
```

## {} 괄호확장 (Brace Expansion)

- 특정 패턴하에 반복적으로 string을 생성할 수 있다.

```
echo {Z..A} // Z Y X W ..... C B A
echo {A..C} {A,B,D,E} // A B C A B D E
echo {A..C}-{A,B,D,E} // A-A A-B A-D A-E B-A B-B B-D .... C-E
mkdir test- {1..3} // test1,test2,test3 디렉토리 생성
```
🔊{}와 {}가 붙어있으면 같은 덩어리로 분류되지만 떨어져있으면 각자 출력된다.

## 🔔매개변수확장(Parameter Expansion)

```
echo $USER : 유저의 이름 출력
printenv | head n -6 : 환경변수목록을 앞에서부터 6번째 줄까지 출력
```
🔍리눅스에서 환경변수를 설정하는 방법
http://daplus.net/linux-%EB%A6%AC%EB%88%85%EC%8A%A4%EC%97%90%EC%84%9C-%ED%99%98%EA%B2%BD-%EB%B3%80%EC%88%98-ld_library_path%EB%A5%BC-%EC%84%A4%EC%A0%95%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95/

##  ⭐명령어 치환(Command Substitution)

- 한 명령어의 output을 다른 문장(명령어)의 input으로 연결해준다.
- `|` (pipeline)과 반대효과.
- 
```
ls -l $(which cp) // cp명령어가 위치한 곳에서 ls -l 커맨드 실행
type $(ls /usr/bin/* | grep zip) //  1. /usr/bin폴더의 모든 파일의 목록이 grep명령어의 input으로 쓰인다. 2.grep결과가 type명령어의 input으로 쓰인다.
```
