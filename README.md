# JUnit4 를 사용한 단위테스트 
1) 테스트코드

  1-1) 테스트코드 작성하는 이유 
  
   빠른 피드백
   
  1-2) 옛 테스트코드 작성 순서
  
        1-2-1) 코드작성
        
        1-2-2) 톰캣이나 프로그램 실행
        
        1-2-3) Postman같은 API 테스트도구로 HTTP 요청
        
        1-2-4) 요청결과 console창 확인
        
        1-2-5) 결과값에 대한 코드 수정
        
  1-3) 장점
  
        1-3-1) 톰캣이나 프로그램을 다시 내렸다가 실행하는 일이 없다
        
        1-3-2) Sysout처럼 눈으로 검증이 아닌 자동검증이 가능
        
        1-3-3) 기능보호
        
         (B라는 기능이 추가되어 테스트를 하는데 오픈 후 잘되던 A기능에 문제가 생김,
         
          이러한 기존 기능이 잘 작동되는 것을 보장 )      
          
  1-4) 단위테스트 Tool
  
      -JUnit 4Ver (현존 5Ver)
      
2) TDD (테스트 주도 개발)

    2-1) Red, Green, Refactor(레드그린 사이클)   

         Red, 항상실패하는 테스트를 먼저 작성 (기능단위 테스트코드 작성)

         Green, 테스트가 통과하는 프로덕션 코드를 작성

         Refactor, 테스트가 통과하면 프로덕션 코드를 리팩토링한다.


    2-2) 단위테스트 (Red)

        2-2-1) JUnit4를 사용하며 메소드에 @Test를 작성하고
        
               assertj 테스트 검증라이브러리의 검증
               
               given,when,then 순
               
3) JUnit4, 5 차이점

  3-1) 
      
      4: @RunWith(SpringRunner.class) 
  
      5: @ExtendWith(SpringExtension.class)  5에선 RunWith 지원하지않음
    
 4) 주의사항
 
   4-1) @WebMvcTest / @SpringBootTest 차이
    
    @WebMvcTest의 경우 JPA 기능이 작동하지 않기때문에 Controller와 ControllerAdvice 등 외부연동과 관련된 부분만 활성화됨
    JPA 기능까지 한번에 테스트할 때는 @SpringBootTest와 TestRestTemplate을 사용
 
    
