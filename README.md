# 테스트코드
  1-1) 테스트코드 작성하는 이유 
        -> 빠른 피드백
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
