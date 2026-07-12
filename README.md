# 멋쟁이사자처럼 백엔드 부트캠프 25기 Spring Boot 프로그래밍 저장소

## 목차
- [1. 스프링 프레임워크 핵심 원리](docs/01.spring_core.md)
- [2. 스프링 부트 시작하기](docs/02.spring_boot.md)
- [3. Spring MVC 웹 개발 기초](docs/03.spring_web_mvc.md)
- [4. Spring JDBC 데이터 접근](docs/04.spring_data_jdbc.md)
- [5. Spring MVC 웹 개발 심화](docs/05.spring_web_advanced.md)
- [6. Spring Data JPA](docs/06.spring_data_jpa.md)
- [7. Spring REST API](docs/07.spring_rest_api.md)
- [8. Spring Security](docs/08.spring_security.md)
- [9. Spring Batch](docs/09.spring_batch.md)

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
    - 💻 실습 (스프링 DI를 이용한 의존성 주입): [spring/di/constructor](SpringCore/src/main/java/net/likelion/bebc25/spring/di/constructor)
    
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
    - 💻 실습 (Spring Initializr로 스프링 부트 프로젝트 생성): [spring-boot-initilizr](spring-boot-initilizr)
  - [2.2 IntelliJ에서 직접 프로젝트 생성](docs/02.spring_boot.md#22-인텔리제이에서-직접-프로젝트-생성)
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

#### 오후(3시간)

</details>

<details>
<summary><h3>40일차(2026.07.14 화)</h3></summary>

#### 오전(3시간)

#### 오후(3시간)

</details>

</details>

</details>


