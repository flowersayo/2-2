# GDB

## compille

### `$gcc [flags] 소스파일 -o 결과파일명` 

[flags]
- `-o 출력파일명`  : 출력 파일명을 지정할 때 사용
- `-O1 ~ -O3`  :최적화 수준을 지정. 숫자가 클수록 높은 수준의 최적화
- `-g` : 디버깅을 위한 정보를 컴파일하면서 생성하도록 함.
- 

## Starting Up GDB 
- `gdb`  -> `(gdb) gdb 프로그램명`     
- `gdb ./프로그램명`   


```
(gdb) break main.c:10                        //main.c 파일의 10번째 줄에 break point 설정하기
(gdb) b 10                                   //10번째 줄에서 브레이크 포인트 설정
(gdb) b 함수명                               //해당 함수에서 브레이크 포인트 설정
(gdb) break *메모리주소                      // 해당 instruction 에 break point 설정하기.
(gdb) break main.c:10 if(i*20000) >= 10      // conditional breakpoint
(gdb) run                                    // break point까지 실행 . 처음부터 재시작 
(gdb) continue/c                               // 다음 break point까지 계속.
(gdb) step/s                                   // single-step. 다음줄 실행.
(gdb) next/n                                   // single-step. 그러나 sub-routine을 실행하지 않고 하나의 instruction으로서 취급함.
(gdb) ni                                       // 다음 instruction 실행.
(gdb) watch 변수명                             // 변수의 값이 변경될때마다 break.

```

📌 step과 next, nexti 의 차이점 
- n (next) : high level에서 라인 단위로 넘어간다. 함수를 만나면 그냥 실행한다.
 
- s (step) : high level에서 라인 단위로 넘어간다. 함수를 만나면 안으로 들어간다.

- ni (next instruction) : assembly에서 instrunction 단위로 넘어간다. 


## Print values

```
(gdb) print 변수명                             //변수에 들어있는 값 출력 (10진수)
(gdb) print/x 변수명                          //변수에 들어있는 값 출력 (16진수)
(gdb) info registers                         // 레지스터 정보 출력
(gdb) info registers rax                     //rax 레지스터에 들어있는 값 출력
(gdb) x 메모리주소(16진수 0x로 시작)         // 레지스터에 들어있는 값 출력(16진수)
(gdb) x/nfu 메모리주소(16진수 0x로 시작)     // 레지스터에 들어있는 값 출력(10진수)

```

## TUI Mode (Text User Interface)
- ctrl x -> ctrl a : TUI Mode 전환. (enable / disable)

```
(gdb) tui enable          // TUI 켜기
(gdb) tui disable         // TUI 끄기
(gdb) layout asm          // 어셈블리와 명령창을 보여주는 모드
(gdb) layout src          // 소스코드와 명령 창을 보여주는 모드 


```




