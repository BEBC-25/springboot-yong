package net.likelion.bebc25.spring.aop.springaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect // 횡단 관심사 클래스 정의
public class LoggingAspect {

    @Before("execution(* net.likelion.bebc25.spring.aop.springaop.*Driver.*(..))")
    public void logBefore(){ // 메서드 수행 전에 로그 메세지 출력
        System.out.println("[AOP 로그 before] 메서드 실행 전에 처리할 코드를 작성합니다.");
    }

    public void logAfter(){ // 메서드 수행 후에 로그 메세지 출력
        System.out.println("[AOP 로그 after] 메서드 실행 후에 처리할 코드를 작성합니다.");
    }

    public void logAround(){ // 메서드 수행 전/후에 로그 메세지 출력
        System.out.println("[AOP 로그 around] 메서드 실행 전에 처리할 코드를 작성합니다.");

        System.out.println("[AOP 로그 around] 메서드 실행 후에 처리할 코드를 작성합니다.");
    }
}
