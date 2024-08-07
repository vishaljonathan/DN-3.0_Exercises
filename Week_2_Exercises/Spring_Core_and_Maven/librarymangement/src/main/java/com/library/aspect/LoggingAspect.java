package com.library.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
  private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

  @Before("execution(* com.library.service..*(..))")
  public void logBefore(JoinPoint joinPoint) {
    logger.info("Before executing method: " + joinPoint.getSignature());
  }

  @After("execution(* com.library.service..*(..))")
  public void logAfter(JoinPoint joinPoint) {
    logger.info("After executing method: " + joinPoint.getSignature());
  }
}
