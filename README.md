# 멋쟁이사자처럼 백엔드 부트캠프 25기 Spring Boot 프로그래밍 저장소

## 목차
- [1. 스프링 프레임워크 핵심 원리](docs/01.spring_core.md)
- [2. 스프링 부트 시작하기](docs/02.spring_boot.md)
- [3. Spring MVC 웹 개발 기초](docs/03.spring_web_mvc.md)
- [4. Spring 데이터 접근 기술과 데이터베이스 모델링](docs/04.spring_database.md)
- [5. MyBatis와 트랜잭션 관리](docs/05.mybatis.md)
- [6. Spring Data JPA]
- [7. Spring REST API]
- [8. Spring Security]
- [9. Spring Batch]
- [10. Spring MVC 웹 개발 심화]

# 수업 진도
<details>
<summary>펼치기</summary>
<details>
<summary><h2>8주차 - 2026.07.08(수) ~ 2026.07.14(화)</h2></summary>

<details>
<summary><h3>36일차(2026.07.08 수)</h3></summary>

#### 오전(3시간)
- [1. 스프링 입문](docs/01.spring_core.md#1-스프링-입문)
  + [1.1 프레임워크와 라이브러리](docs/01.spring_core.md#11-프레임워크와-라이브러리)
  + [1.2 스프링 프레임워크 개요](docs/01.spring_core.md#12-스프링-프레임워크-개요)
  + [1.3 스프링 핵심 용어 사전](docs/01.spring_core.md#13-스프링-핵심-용어-사전)
- [2. 빌드 도구 (Build Tool)](docs/01.spring_core.md#2-빌드-도구-build-tool)
  + [2.1 스프링 프로젝트의 빌드 및 배포 흐름](docs/01.spring_core.md#21-스프링-프로젝트의-빌드-및-배포-흐름)
  + [2.2 Maven과 Gradle](docs/01.spring_core.md#22-maven과-gradle)

#### 오후(3시간)
- [3. 스프링 프로젝트 구성](docs/01.spring_core.md#3-스프링-프로젝트-구성)
  + [3.1 프로젝트 생성](docs/01.spring_core.md#31-프로젝트-생성)
    - 💻 실습 (깃허브 레포지토리 생성): [스프링 부트 레포지토리](https://github.com/BEBC-25/springboot-yong)
    - 💻 실습 (첫번째 스프링 프로젝트): [SpringCore](SpringCore)
  + [3.2 자바 컴파일러 및 Gradle JVM 검토](docs/01.spring_core.md#32-자바-컴파일러-및-gradle-jvm-검토)
  + [3.3 build.gradle 기본 설정 및 구조 분석](docs/01.spring_core.md#33-buildgradle-기본-설정-및-구조-분석)
  + [3.4 스프링 프레임워크 의존성 추가](docs/01.spring_core.md#34-스프링-프레임워크-의존성-추가)
  + [3.5 프로젝트 구조](docs/01.spring_core.md#35-프로젝트-구조)
- [4. 제어의 역전 (IoC: Inversion of Control)](docs/01.spring_core.md#4-제어의-역전-ioc-inversion-of-control)
  - [4.1 의존 객체 직접 결합](docs/01.spring_core.md#41-의존-객체-직접-결합)
  - [4.2 다형성을 활용한 느슨한 결합](docs/01.spring_core.md#42-다형성을-활용한-느슨한-결합)
    - 💻 실습 (OOP를 적용하기 이전 Driver, GasolineCar): [oop/before](SpringCore/src/main/java/net/likelion/bebc25/oop/before)
    - 💻 실습 (OOP를 적용한 후 Driver, GasolineCar): [oop/after](SpringCore/src/main/java/net/likelion/bebc25/oop/after)
  - [4.3 제어의 역전(IoC)의 출현과 개념](docs/01.spring_core.md#43-제어의-역전ioc의-출현과-개념)
- [5. 의존성 주입 (DI: Dependency Injection)](docs/01.spring_core.md#5-의존성-주입-di-dependency-injection)
  - [5.1 설정 클래스 정의](docs/01.spring_core.md#51-설정-클래스-정의)
  - [5.2 메인 클래스 구성](docs/01.spring_core.md#52-메인-클래스-구성)
    - 💻 실습 (의존성 주입 - Constructor Injection): [spring/di/constructor](SpringCore/src/main/java/net/likelion/bebc25/spring/di/constructor)
    
</details>

<details>
<summary><h3>37일차(2026.07.09 목)</h3></summary>

#### 오전(3시간)
- [5. 의존성 주입 (DI: Dependency Injection)](docs/01.spring_core.md#5-의존성-주입-di-dependency-injection)
  - [5.3 의존성 주입 방식](docs/01.spring_core.md#53-의존성-주입-방식)
    - 💻 실습 (의존성 주입 - Setter Injection): [spring/di/setter](SpringCore/src/main/java/net/likelion/bebc25/spring/di/setter)
- [6. 관점 지향 프로그래밍 (AOP: Aspect Oriented Programming)](docs/01.spring_core.md#6-관점-지향-프로그래밍-aop-aspect-oriented-programming)
  - [6.1 AOP 개념과 도입 배경](docs/01.spring_core.md#61-aop-개념과-도입-배경)
  - [6.2 프록시(Proxy) 기반 AOP 기술](docs/01.spring_core.md#62-프록시proxy-기반-aop-기술)
    - 💻 실습 (정적 프록시를 이용한 AOP): [spring/aop/staticproxy](SpringCore/src/main/java/net/likelion/bebc25/spring/aop/staticproxy)
    - 💻 실습 (동적 프록시를 이용한 AOP): [spring/aop/dynamicproxy](SpringCore/src/main/java/net/likelion/bebc25/spring/aop/dynamicproxy)

#### 오후(3시간)
- [6. 관점 지향 프로그래밍 (AOP: Aspect Oriented Programming)](docs/01.spring_core.md#6-관점-지향-프로그래밍-aop-aspect-oriented-programming)
  - [6.3 스프링 AOP와 AspectJ의 관계](docs/01.spring_core.md#63-스프링-aop와-aspectj의-관계)
  - [6.4 AOP 핵심 용어](docs/01.spring_core.md#64-aop-핵심-용어)
  - [6.5 스프링 AOP 적용 방법](docs/01.spring_core.md#65-스프링-aop-적용-방법)
    - 💻 실습 (스프링 AOP): [spring/aop/springaop](SpringCore/src/main/java/net/likelion/bebc25/spring/aop/springaop)

</details>

<details>
<summary><h3>38일차(2026.07.10 금)</h3></summary>

#### 오전(3시간)
- [7. 컴포넌트 스캔과 의존성 자동 주입](docs/01.spring_core.md#7-컴포넌트-스캔과-의존성-자동-주입)
  - [7.1 컴포넌트 스캔 (Component Scan)](docs/01.spring_core.md#71-컴포넌트-스캔-component-scan)
  - [7.2 의존성 자동 주입 (Dependency Auto Injection)](docs/01.spring_core.md#72-의존성-자동-주입-dependency-auto-injection)
  - 💻 실습 (컴포넌트 스캔): [spring/componentscan](SpringCore/src/main/java/net/likelion/bebc25/spring/componentscan)
- [8. 스프링 컨테이너 핵심 메커니즘](docs/01.spring_core.md#8-스프링-컨테이너-핵심-메커니즘)
  - [8.1 스프링 빈 스코프 (Scope)](docs/01.spring_core.md#81-스프링-빈-스코프-scope)
  - [8.2 스프링 빈 생명주기 및 콜백](docs/01.spring_core.md#82-스프링-빈-생명주기-및-콜백)
  - 💻 실습 (초기화 메서드와 소멸 메서드): [spring/lifecycle](SpringCore/src/main/java/net/likelion/bebc25/spring/lifecycle)

#### 오후(3시간)
- [1. 스프링 부트 개요](docs/02.spring_boot.md#1-스프링-부트-개요)
  - [1.1 스프링 부트의 정의와 역할](docs/02.spring_boot.md#11-스프링-부트의-정의와-역할)
  - [1.2 스프링 프레임워크와 스프링 부트의 차이점](docs/02.spring_boot.md#12-스프링-프레임워크와-스프링-부트의-차이점)
- [2. 스프링 부트 프로젝트 환경 구축](docs/02.spring_boot.md#2-스프링-부트-프로젝트-환경-구축)
  - [2.1 스프링 이니셜라이저로 프로젝트 생성](docs/02.spring_boot.md#21-스프링-이니셜라이저로-프로젝트-생성)
    - 💻 실습 (Spring Initializr로 스프링 부트 프로젝트 생성): [spring-boot-initilizr](spring-boot-initializr)
  - [2.2 IntelliJ에서 직접 프로젝트 생성](docs/02.spring_boot.md#22-IntelliJ에서-직접-프로젝트-생성)
    - 💻 실습 (IntelliJ로 스프링 부트 프로젝트 생성): [spring-boot-intellij](spring-boot-intellij)
- [3. 스프링 부트 빌드 설정](docs/02.spring_boot.md#3-스프링-부트-빌드-설정)
  - [3.1 build.gradle 설정](docs/02.spring_boot.md#31-buildgradle-설정)
- [4. 스프링 부트의 자동 빈 등록 메커니즘](docs/02.spring_boot.md#4-스프링-부트의-자동-빈-등록-메커니즘)
  - [4.1 메인 실행 클래스와 @SpringBootApplication](docs/02.spring_boot.md#41-메인-실행-클래스와-springbootapplication)
  - [4.2 자동 의존성 주입 예시](docs/02.spring_boot.md#42-자동-의존성-주입-예시)
  - 💻 실습 (스프링 부트에서 Car, Driver 작성): [spring-boot-intellij](spring-boot-intellij/src/main/java/net/likelion/bebc25/intellij)
  
</details>

<details>
<summary><h3>39일차(2026.07.13 월)</h3></summary>

#### 오전(3시간)
- [1. 스프링 부트 프로젝트 생성](docs/03.spring_web_mvc.md#1-스프링-부트-프로젝트-생성)
  - [1.1 IntelliJ 기반 프로젝트 생성](docs/03.spring_web_mvc.md#11-intellij-기반-프로젝트-생성)
  - [1.2 서버 구동 및 테스트](docs/03.spring_web_mvc.md#12-서버-구동-및-테스트)
  - [1.3 스프링 부트 빌드 설정 파일 구성](docs/03.spring_web_mvc.md#13-스프링-부트-빌드-설정-파일-구성)
  - [1.4 샘플 코드 복사](docs/03.spring_web_mvc.md#14-샘플-코드-복사)
  - [1.5 실시간 변경 감지 및 자동 재시작 설정](docs/03.spring_web_mvc.md#15-실시간-변경-감지-및-자동-재시작-설정)
  - 💻 실습 (게시판 프로젝트 생성, 샘플 코드 복사): [spring-board](spring-board)

#### 오후(3시간)
- [2. HTTP 프로토콜](docs/03.spring_web_mvc.md#2-http-프로토콜)
  - [2.1 주요 특징](docs/03.spring_web_mvc.md#21-주요-특징)
  - [2.2 동작 방식](docs/03.spring_web_mvc.md#22-동작-방식)
  - [2.3 Request 메시지 구조](docs/03.spring_web_mvc.md#23-request-메시지-구조)
  - [2.4 Response 메시지 구조](docs/03.spring_web_mvc.md#24-response-메시지-구조)
  - [2.5 HTTP의 특징](docs/03.spring_web_mvc.md#25-http의-특징)
  - [2.6 HTTP 주요 메서드](docs/03.spring_web_mvc.md#26-http-주요-메서드)
- [3. 3티어 아키텍처와 MVC 패턴 설계](docs/03.spring_web_mvc.md#3-3티어-아키텍처와-mvc-패턴-설계)
  - [3.1 3티어 아키텍처의 이해](docs/03.spring_web_mvc.md#31-3티어-아키텍처의-이해)
  - [3.2 Model 1과 Model 2 아키텍처](docs/03.spring_web_mvc.md#32-model-1과-model-2-아키텍처)
  - [3.3 MVC 패턴](docs/03.spring_web_mvc.md#33-mvc-패턴)
  - [3.4 계층별 클래스 설계 기법 (Layered Architecture)](docs/03.spring_web_mvc.md#34-계층별-클래스-설계-기법-layered-architecture)
  - [3.5 계층 간 데이터 전달 객체의 분류](docs/03.spring_web_mvc.md#35-계층-간-데이터-전달-객체의-분류)
  - [3.6 프로젝트 패키지 구조 설계](docs/03.spring_web_mvc.md#36-프로젝트-패키지-구조-설계)
- [4. Spring MVC 컨트롤러 설계 및 웹 요청 핸들러 정의](docs/03.spring_web_mvc.md#4-spring-mvc-컨트롤러-설계-및-웹-요청-핸들러-정의)
  - [4.1 Controller 어노테이션 정의 및 데이터 직접 응답](docs/03.spring_web_mvc.md#41-controller-어노테이션-정의-및-데이터-직접-응답)
  - [4.2 HTTP 파라미터 매핑 방법](docs/03.spring_web_mvc.md#42-http-파라미터-매핑-방법)
  - 💻 실습 (게시글 목록 조회 - 컨트롤러에서 직접 View 응답): [board01](spring-board/src/main/java/net/likelion/bebc25/board01)

</details>

<details>
<summary><h3>40일차(2026.07.14 화)</h3></summary>

#### 오전(3시간)
- 💻 실습 (게시글 등록, 상세조회, 수정, 삭제 기능 구현): [board01](spring-board/src/main/java/net/likelion/bebc25/board01)

#### 오후(3시간)
- [5. 뷰(View) 구현 및 렌더링](docs/03.spring_web_mvc.md#5-뷰view-구현-및-렌더링)
  - [5.1 서버 사이드 동적 화면 생성 기술의 변천사](docs/03.spring_web_mvc.md#51-서버-사이드-동적-화면-생성-기술의-변천사)
  - [5.2 스프링의 뷰(View)와 뷰 리졸버(ViewResolver) 아키텍처](docs/03.spring_web_mvc.md#52-스프링의-뷰view와-뷰-리졸버viewresolver-아키텍처)
  - [5.3 뷰 리졸버 (ViewResolver) 인터페이스](docs/03.spring_web_mvc.md#53-뷰-리졸버-viewresolver-인터페이스)
  - [5.4 뷰 (View) 인터페이스](docs/03.spring_web_mvc.md#54-뷰-view-인터페이스)
  - [5.5 뷰 처리 렌더링 동작 시나리오](docs/03.spring_web_mvc.md#55-뷰-처리-렌더링-동작-시나리오)
- [6. Thymeleaf 뷰 템플릿 엔진](docs/03.spring_web_mvc.md#6-thymeleaf-뷰-템플릿-엔진)
  - [6.1 컨트롤러 데이터 바인딩 및 템플릿 파일 경로 규칙](docs/03.spring_web_mvc.md#61-컨트롤러-데이터-바인딩-및-템플릿-파일-경로-규칙)
  - [6.2 타임리프 기본 문법](docs/03.spring_web_mvc.md#62-타임리프-기본-문법)
  - 💻 실습 (타임리프 템플릿 기반 동적 화면 렌더링): [templates/board](spring-board/src/main/resources/templates/board)

</details>

</details>

<details>

<summary><h2>9주차 - 2026.07.15(수) ~ 2026.07.23(목)</h2></summary>

<details>
<summary><h3>41일차(2026.07.15 수)</h3></summary>

#### 오전(3시간)
- [6. Thymeleaf 뷰 템플릿 엔진](docs/03.spring_web_mvc.md#6-thymeleaf-뷰-템플릿-엔진)
  - [6.3 공통 레이아웃 설계 및 컴포넌트 재사용](docs/03.spring_web_mvc.md#63-공통-레이아웃-설계-및-컴포넌트-재사용)
- [7. 웹 요청 처리와 디스패처 서블릿](docs/03.spring_web_mvc.md#7-웹-요청-처리와-디스패처-서블릿)
  - [7.1 HTTP 요청 라이프사이클 및 디스패처 서블릿의 핵심 역할](docs/03.spring_web_mvc.md#71-http-요청-라이프사이클-및-디스패처-서블릿의-핵심-역할)
  - [7.2 요청에서 응답까지 MVC 구성 요소의 호출 흐름](docs/03.spring_web_mvc.md#72-요청에서-응답까지-mvc-구성-요소의-호출-흐름)
  - 💻 실습 (공통 레이아웃 프래그먼트 분리): [templates/layout](spring-board/src/main/resources/templates/layout)

#### 오후(3시간)
- [8. 데이터 검증 및 예외 처리](docs/03.spring_web_mvc.md#8-데이터-검증-및-예외-처리)
  - [8.1 Controller 계층에서의 입력값 검증 필요성 및 @Valid 활용](docs/03.spring_web_mvc.md#81-controller-계층에서의-입력값-검증-필요성-및-valid-활용)
  - [8.2 BindingResult 객체를 이용한 검증 에러 처리](docs/03.spring_web_mvc.md#82-bindingresult-객체를-이용한-검증-에러-처리)
  - [8.3 @ControllerAdvice 기반 글로벌 예외 처리](docs/03.spring_web_mvc.md#83-controlleradvice-기반-글로벌-예외-처리)
- [3. 3티어 아키텍처와 MVC 패턴 설계](docs/03.spring_web_mvc.md#3-3티어-아키텍처와-mvc-패턴-설계)
  - [3.4 계층별 클래스 설계 기법 (Layered Architecture)](docs/03.spring_web_mvc.md#34-계층별-클래스-설계-기법-layered-architecture)
  - 💻 실습 (Validation 데이터 검증, 예외 처리 및 계층 분리): [board02](spring-board/src/main/java/net/likelion/bebc25/board02)
    
</details>

<details>
<summary><h3>42일차(2026.07.16 목)</h3></summary>

#### 오전(3시간)
- [1. 스프링 JDBC와 JdbcTemplate](docs/04.spring_database.md#1-스프링-jdbc와-jdbctemplate)
  - [1.1 순수 JDBC와 복잡성](docs/04.spring_database.md#11-순수-jdbc와-복잡성)
  - 💻 실습 (순수 JDBC 기반 리포지토리 구현 및 빈 선택): [board03/post/repository](spring-board/src/main/java/net/likelion/bebc25/board03/post/repository)

#### 오후(3시간)
- [1. 스프링 JDBC와 JdbcTemplate](docs/04.spring_database.md#1-스프링-jdbc와-jdbctemplate)
  - [1.2 JdbcTemplate 개요 및 의존성 설정](docs/04.spring_database.md#12-jdbctemplate-개요-및-의존성-설정)
  - [1.3 RowMapper를 활용한 결과 매핑](docs/04.spring_database.md#13-rowmapper를-활용한-결과-매핑)
  - [1.4 JdbcTemplate 기반 CRUD 구현](docs/04.spring_database.md#14-jdbctemplate-기반-crud-구현)
  - [1.5 데이터베이스 접속 정보의 외부 격리 및 @Value 활용](docs/04.spring_database.md#15-데이터베이스-접속-정보의-외부-격리-및-value-활용)
  - [1.6 데이터베이스 초기화 및 커넥션 풀 제어](docs/04.spring_database.md#16-데이터베이스-초기화-및-커넥션-풀-제어)
  - 💻 실습 (JdbcTemplate 연동 및 DB 초기화 스크립트 적용): [board03/post/repository](spring-board/src/main/java/net/likelion/bebc25/board03/post/repository)

</details>

<details>
<summary><h3>43일차(2026.07.21 화)</h3></summary>

#### 오전(3시간)
- Git

#### 오후(3시간)
- Git

</details>

<details>
<summary><h3>44일차(2026.07.22 수)</h3></summary>

#### 오전(3시간)
- Git

#### 오후(3시간)
- Git

</details>

<details>
<summary><h3>45일차(2026.07.23 목)</h3></summary>

#### 오전(3시간)
- Git

#### 오후(3시간)
- Git

</details>

</details>

<details>

<summary><h2>14주차 - 2026.08.26(수) ~ 2026.09.01(화)</h2></summary>

<details>
<summary><h3>69일차(2026.08.31 월)</h3></summary>

#### 오전(3시간)
- [2. 데이터베이스 모델링](docs/04.spring_database.md#2-데이터베이스-모델링)
  - [2.1 데이터베이스 모델링 개요](docs/04.spring_database.md#21-데이터베이스-모델링-개요)
  - [2.2 데이터베이스 정규화 이론](docs/04.spring_database.md#22-데이터베이스-정규화-이론)

#### 오후(3시간)
- [2. 데이터베이스 모델링](docs/04.spring_database.md#2-데이터베이스-모델링)
  - [2.3 ERD 설계와 Crow's Foot 표기법](docs/04.spring_database.md#23-erd-설계와-crows-foot-표기법)
  - [2.4 식별 관계와 비식별 관계의 구조적 구분](docs/04.spring_database.md#24-식별-관계와-비식별-관계의-구조적-구분)
  - [2.5 SNS 핵심 도메인 테이블 정의서 및 최종 DDL 스키마](docs/04.spring_database.md#25-sns-핵심-도메인-테이블-정의서-및-최종-ddl-스키마)
  - [2.6 대표적인 모델링 도구 및 설계 가이드라인](docs/04.spring_database.md#26-대표적인-모델링-도구-및-설계-가이드라인)
    
</details>

<details>
<summary><h3>70일차(2026.09.01 화)</h3></summary>

#### 오전(3시간)
- [3. 인덱스와 쿼리 성능 최적화](docs/04.spring_database.md#3-인덱스와-쿼리-성능-최적화)
  - [3.1 인덱스 정의와 옵티마이저 작동 원리](docs/04.spring_database.md#31-인덱스-정의와-옵티마이저-작동-원리)
  - [3.2 인덱스 관리 SQL 및 설계 원칙](docs/04.spring_database.md#32-인덱스-관리-sql-및-설계-원칙)
  - [3.3 쿼리 성능 저하 원인 분석](docs/04.spring_database.md#33-쿼리-성능-저하-원인-분석)
  - 💻 실습 (대량 더미 데이터 생성 프로시저): [spring-data/query/procedure.sql](spring-data/query/procedure.sql)

#### 오후(3시간)
- [3. 인덱스와 쿼리 성능 최적화](docs/04.spring_database.md#3-인덱스와-쿼리-성능-최적화)
  - [3.4 데이터베이스 실행 계획 확인](docs/04.spring_database.md#34-데이터베이스-실행-계획-확인)
  - [3.5 페이징 처리 기법](docs/04.spring_database.md#35-페이징-처리-기법)
  - 💻 실습 (인덱스 생성·성능 측정 및 실행 계획 분석): [spring-data/query/index.sql](spring-data/query/index.sql)
- [1. MyBatis](docs/05.mybatis.md#1-mybatis)
  - [1.1 MyBatis 개요와 SQL 매퍼 패러다임](docs/05.mybatis.md#11-mybatis-개요와-sql-매퍼-패러다임)

</details>

</details>

<details>

<summary><h2>15주차 - 2026.09.02(수) ~ 2026.09.08(화)</h2></summary>

<details>
<summary><h3>71일차(2026.09.02 수)</h3></summary>

#### 오전(3시간)
- [1. MyBatis](docs/05.mybatis.md#1-mybatis)
  - [1.2 MyBatis 핵심 구성 요소와 동작 원리](docs/05.mybatis.md#12-mybatis-핵심-구성-요소와-동작-원리)
  - [1.3 MyBatis 빌드 의존성 및 환경 설정](docs/05.mybatis.md#13-mybatis-빌드-의존성-및-환경-설정)
  - [1.4 Mapper 인터페이스와 매개변수 바인딩](docs/05.mybatis.md#14-mapper-인터페이스와-매개변수-바인딩)
- [2. MyBatis 실습: SNS 데이터 계층 구현](docs/05.mybatis.md#2-mybatis-실습-sns-데이터-계층-구현)
  - [2.1 프로젝트 환경 구성 및 설정](docs/05.mybatis.md#21-프로젝트-환경-구성-및-설정)
  - [2.2 기본 CRUD 기능 구현 및 단위 테스트](docs/05.mybatis.md#22-기본-crud-기능-구현-및-단위-테스트)
  - 💻 실습 (MyBatis SNS 프로젝트 설정 및 기본 CRUD 단위 테스트): [mybatis-sns](mybatis-sns)

#### 오후(3시간)
- [1. MyBatis](docs/05.mybatis.md#1-mybatis)
  - [1.5 ResultMap과 복합 객체 조인 매핑](docs/05.mybatis.md#15-resultmap과-복합-객체-조인-매핑)
  - [1.6 동적 SQL 제어와 공통 쿼리 모듈화](docs/05.mybatis.md#16-동적-sql-제어와-공통-쿼리-모듈화)
- [2. MyBatis 실습: SNS 데이터 계층 구현](docs/05.mybatis.md#2-mybatis-실습-sns-데이터-계층-구현)
  - [2.3 ResultMap 복합 조인 상세 조회 구현 및 단위 테스트](docs/05.mybatis.md#23-resultmap-복합-조인-상세-조회-구현-및-단위-테스트)
  - [2.4 동적 SQL 검색 및 일괄 삭제 구현 및 단위 테스트](docs/05.mybatis.md#24-동적-sql-검색-및-일괄-삭제-구현-및-단위-테스트)
  - 💻 실습 (ResultMap 1:1/1:N 복합 조인 및 동적 SQL 단위 테스트): [mybatis-sns/src/test/java/net/likelion/bebc25/sns/mapper/PostMapperTest.java](mybatis-sns/src/test/java/net/likelion/bebc25/sns/mapper/PostMapperTest.java)
    
</details>

<details>
<summary><h3>72일차(2026.09.03 목)</h3></summary>

#### 오전(3시간)
- [3. 스프링 선언적 트랜잭션](docs/05.mybatis.md#3-스프링-선언적-트랜잭션)
  - [3.1 스프링 트랜잭션 추상화](docs/05.mybatis.md#31-스프링-트랜잭션-추상화)
  - [3.2 @Transactional 선언과 AOP 프록시 동작 메커니즘](docs/05.mybatis.md#32-transactional-선언과-aop-프록시-동작-메커니즘)
  - [3.3 트랜잭션 전파 속성과 격리 수준](docs/05.mybatis.md#33-트랜잭션-전파-속성과-격리-수준)
  - [3.4 @Transactional 실무 사용법과 권장 설정](docs/05.mybatis.md#34-transactional-실무-사용법과-권장-설정)

#### 오후(3시간)
- [4. 서비스 계층 선언적 트랜잭션 실습](docs/05.mybatis.md#4-서비스-계층-선언적-트랜잭션-실습)
  - [4.1 트랜잭션 적용 시나리오: 좋아요 토글](docs/05.mybatis.md#41-트랜잭션-적용-시나리오-좋아요-토글)
  - [4.2 매퍼 설계 원칙: 도메인 관점과 테이블 책임 분리](docs/05.mybatis.md#42-매퍼-설계-원칙-도메인-관점과-테이블-책임-분리)
  - [4.3 PostLikeMapper 인터페이스 및 XML 구현](docs/05.mybatis.md#43-postlikemapper-인터페이스-및-xml-구현)
  - [4.4 PostMapper 인터페이스 및 XML 메서드 추가](docs/05.mybatis.md#44-postmapper-인터페이스-및-xml-메서드-추가)
  - [4.5 서비스 인터페이스 및 구현 클래스 작성](docs/05.mybatis.md#45-서비스-인터페이스-및-구현-클래스-작성)
  - [4.6 트랜잭션 롤백 테스트 및 무결성 검증](docs/05.mybatis.md#46-트랜잭션-롤백-테스트-및-무결성-검증)
  - 💻 실습 (서비스 계층 선언적 트랜잭션 실습): [mybatis-sns](mybatis-sns)

</details>

<details>
<summary><h3>73일차(2026.09.04 금)</h3></summary>

#### 오전(3시간)

#### 오후(3시간)

</details>

<details>
<summary><h3>74일차(2026.09.07 월)</h3></summary>

#### 오전(3시간)

#### 오후(3시간)

</details>

<details>
<summary><h3>75일차(2026.09.08 화)</h3></summary>

#### 오전(3시간)

#### 오후(3시간)

</details>

<details>

<summary><h2>16주차 - 2026.09.09(수) ~ 2026.09.15(화)</h2></summary>

<details>
<summary><h3>76일차(2026.09.09 수)</h3></summary>

#### 오전(3시간)


#### 오후(3시간)

    
</details>

<details>
<summary><h3>77일차(2026.09.10 목)</h3></summary>

#### 오전(3시간)

#### 오후(3시간)

</details>

<details>
<summary><h3>78일차(2026.09.11 금)</h3></summary>

#### 오전(3시간)

#### 오후(3시간)

</details>

<details>
<summary><h3>79일차(2026.09.14 월)</h3></summary>

#### 오전(3시간)

#### 오후(3시간)

</details>

<details>
<summary><h3>80일차(2026.09.15 화)</h3></summary>

#### 오전(3시간)

#### 오후(3시간)

</details>

</details>

<details>

<summary><h2>17주차 - 2026.09.16(수) ~ 2026.09.22(화)</h2></summary>

<details>
<summary><h3>81일차(2026.09.16 수)</h3></summary>

#### 오전(3시간)


#### 오후(3시간)

    
</details>

<details>
<summary><h3>82일차(2026.09.17 목)</h3></summary>

#### 오전(3시간)
- 응용 프로젝트 준비

#### 오후(3시간)
- 응용 프로젝트 준비

</details>

<details>
<summary><h3>83일차(2026.09.18 금)</h3></summary>

#### 오전(3시간)
- 응용 프로젝트

#### 오후(3시간)
- 응용 프로젝트

</details>

<details>
<summary><h3>84일차(2026.09.21 월)</h3></summary>

#### 오전(3시간)
- 응용 프로젝트

#### 오후(3시간)
- 응용 프로젝트

</details>

<details>
<summary><h3>85일차(2026.09.22 화)</h3></summary>

#### 오전(3시간)
- 응용 프로젝트

#### 오후(3시간)
- 응용 프로젝트

</details>


</details>


</details>


