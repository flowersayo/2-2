# Chap07. 컬렉션과 제네릭

## 1. 컬렉션과 제네릭개념

### 컬렉션 
: 객체를 배열로 만든것. 

### 제네릭 
: 모든 종류의 데이터 타입을 다룰 수 있도록 클래스나 메소드를 일반화시키는 기법 (=Wrapper 클래스 쓸 수 있도록) 컬렉션은 제네릭 기법으로 구현됨.

### Wrapper 클래스 
: 자바의 기본타입을 클래스화. 

Byte,Short,Integer,Long,Character,Float,Double,Boolean


```
Integer i=Interger.valueOf(10); // 10을 지닌 객체 생성
Integer i=Interger.valueOf("10"); // 10을 지닌 객체 생성
Character c=Character.valueOf('c'); //c를 지닌 객체 생성
```

## 2. Vector<E> 
 
### `Vector <E> v  new Vector<Integer>();`

 
### Vector 메소드
  
   📌p.12
  ```
  boolean add(E element) // 맨 뒤에 element 추가
  add(int index,E element) // index에 element 삽입
  E elementAt(int index) // index 번째 요소 리턴
  E get(int index) // index번째 요소 리턴
  bool isEmpty() // 비어있으면 true리턴
  E remove(int index) // index의 요소 삭제
  int size() // 벡터가 포함하는 요소의 개수 리턴.
  void removeAllElements() // 모든 요소 삭제하고 크기를 0으로 만듦
  ```
  
  
❓`elementAt 과 get의 차이` 
  
  Get는 복사본이 넘어오고 ElementAt는 포인트가 넘어온다.
즉 Get로 받은 변수의 값을 변경해도 원본은 그대로다. 실제 값을 변경하고 싶다면 ElementAt 사용해야한다.
  
  + 값 꺼내오기예제
  ```
    Integer obg = v.get(1); // index 1번째 객체 가져옴
  int i=obj.intValue(); // 객체 안에 들어있는 int 값 가져옴.
  
  ```

  ### 자동 박싱/언박싱
  
  ```
  v.add(4); //Integer.valueOf(4) 로 자동 박싱
  int k=v.get(0); //Integer 타입이 int타입으로 자동 언박싱, k=4.
  ```
 
  
## 3. ArrayList<E> 
  : 벡터와 달리 스레드 동기화(스레드의 순서를 정함) 기능 없음. 개발자가 스레드 동기화 코드 작성해야함.
  
  ### `ArrayList<E> al = new ArrayList<E>();`
  
  
   
### ArrayList 메소드
  
   📌p.21
  ```
  boolean add(E element) // 맨 뒤에 element 추가
  add(int index,E element) // index에 element 삽입
  E elementAt(int index) // index 번째 요소 리턴
  E get(int index) // index번째 요소 리턴
  bool isEmpty() // 비어있으면 true리턴
  E remove(int index) // index의 요소 삭제
  int size() // 벡터가 포함하는 요소의 개수 리턴.
  void clear() // 모든 요소 삭제
  ```

## 4. Iterator
  : `Vector` , `ArrayList`, `LinkedList` 와 같은 리스트 구조의 **컬렉션에서 요소의 순차 검색** 을 위해서 상속받는 인터페이스
  !주의! HashMap은 Iterator 사용 불가
  
  ### Iterator 메소드
  ``` 
  boolean hasNext() // 방문할 요소가 남아있으면 true리턴
  E next() // 다음 요소 리턴
  void remove() // 마지막으로 리턴된 요소 제거
  ```
  
  
  - 예제
  ```
 var it = v.iterator();
		
		int sum=0;
		while (it.hasNext()) {
			
			int n=it.next();
			sum+=n;
			System.out.println(n);
			
		}
  
  ```
## 5. HashMap <K,V>
  : 키(Key) 와 값(Value) 의 쌍으로 구성되는 요소를 다루는 컬렉션. 삽입,삭제,검색이 빠르다
  
  ### `HashMap<E,E> map = new HashMap<E,E>();`
  
  
  ### HashMap 메소드
     📌p.30
  ```
  void clear() // 해시맵의 모든 요소 삭제
  V get(Object key) // 지정된 키(key)의 값(value) 리턴
  V put(K key,V value) // key와 value 쌍을 해시맵에 저장
  V remove(Object key) // 지정된 key를 찾아 키와 값 모두 삭제
  int size() // HashMap에 포함된 요소의 개수
  set<K> keySet() // 해시맵의 모든 키를 담은 Set<K> 컬렉션 리턴
  ```
  
  - 예제
  ```
  dic.put("baby", "아기"); // 해시맵에 새로운 key-value 쌍 추가
  String kor = h.get("baby"); // key로 valuer가져오기. kor = "아기"
  h.remove("baby") // 키로 요소 삭제
  Set<String> keys=scoreMap.keySet(); //Hashmap 키값 가져오기
  ```
  
## 6. LinkedList
  : 맨 앞이나 맨 뒤에 요소를 추가하거나 삭제할 수 있어 스택이나 큐로 사용가능.
  - add()으로 추가 get()으로 가져오기
 
  
## 7. Collections 
  : 컬렉션에 대한 연산을 수행하는 클래스
  
  - 모든 메소드는 `static` 타입
  
  ### 주요메소드
  - sort()
  - reverse()
  - max(),min()
  - binarySearch()
  
  ```
  Collections.sort(myList);
  Collections.reverse(myList);
  int idx = Collections.binarySearch(myList, item )+1; //item이 몇번째 요소인지
  
  ```
  
## 8. 사용자 제네릭 클래스
  
  
  ### 제네릭 만들기
  ```
 public class MyClass<T>{ //제네릭 클래스 선언. 타입 매개변수 T
  T val;
  
   void set(T a){
   val=a;
   }
   T get(){
   return val;
   }
 }
  
  // 제네릭 클래스 레퍼런스 변수 선언. T자리에 어떤 일반화된 객체도 들어갈 수 있음.
  MyClass<String> s;
  
  // 제네릭 타입의 클래스에 구체적인 타입을 대입하여 객체 생성
  s= new MyClass<String)(); // 제네릭 타입 T에 String 지정
                            
```  
                            
🚫타입 매개변수에 기본타입(자료형)은 사용할 수 없음. ex)int,char
                            
                            
 ### 타입 매개변수
: `<` 과 `>` 사이에 하나의 대문자를 타입 매개변수로 사용. 어떤 문자도 매개변수로 사용가능하나 주로 T(Type), E(Element), V(Value), K(Key) 를 사용. 
  
  
 ### 유의사항
  
   - 제네릭 클래스 또는 인터페이스의 배열을 허용하지 않음
  ex) GStack <Integer> [] gs = new GStack<Integer>[10];  ❌
  
  - 타입 매개변수가 나타내는 타입의 객체 OR 배열 생성 불가 -> 만일 필요하다면 Object와 캐스팅 이용하기.
  ex) T a = new T(); ❌, T[] a= new T[10];
  
 - 타입 매개변수의 배열에 레퍼런스는 허용.
  ex) return (T)stack[tos]; //타입 매개변수 T타입으로 캐스팅 , public void myArray(T[] a){...}
  
  
  ### 제네릭 메소드
  : 인자로 넘어오는 자료형을 모를때 유용
  
  public static <T> 리턴값 함수명 (인자)  
  
  - 컴파일 시에 타입이 결정되어 보다 안전한 프로그래밍 가능
  - 런타임 타입 충돌 문제 방지
  - ClassCastException 방지
  
  ### 예제
  ```
  public static <T> GStack<T> reverse (GStack<T> a)
  ```
  
  

  
  
                     
                            
                            
                            
                            
  
  
  
  
  
