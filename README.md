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

#### 오후(3시간)
- [6. 관점 지향 프로그래밍 (AOP: Aspect Oriented Programming)](docs/01.spring_core.md#6-관점-지향-프로그래밍-aop-aspect-oriented-programming)
  - [6.1 AOP 개념과 도입 배경](docs/01.spring_core.md#61-aop-개념과-도입-배경)
  - [6.2 프록시(Proxy) 기반 AOP 기술](docs/01.spring_core.md#62-프록시proxy-기반-aop-기술)
  - [6.3 스프링 AOP와 AspectJ의 관계](docs/01.spring_core.md#63-스프링-aop와-aspectj의-관계)
  - [6.4 AOP 핵심 용어](docs/01.spring_core.md#64-aop-핵심-용어)
  - [6.5 프록시 기반 AOP 구현](docs/01.spring_core.md#65-프록시-기반-aop-구현)
  
</details>

<details>
<summary><h3>38일차(2026.07.10 금)</h3></summary>

#### 오전(3시간)

#### 오후(3시간)

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


