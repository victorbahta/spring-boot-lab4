package miu.edu.waa_lab1.aspect;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import miu.edu.waa_lab1.domain.Logger;
import miu.edu.waa_lab1.repository.LoggerRepo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Aspect
@Component
public class LoggerAspect {
    @Autowired
    LoggerRepo loggerRepo;
    @Pointcut("execution ( * miu.edu.waa_lab1.controller..*(..))")
    public void logAllMethods() {}

    @Pointcut("@annotation(miu.edu.waa_lab1.annotations.ExecutionTime)")
    public void executionTime() {}

    @Around("executionTime()")
    public void getExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        joinPoint.proceed();
        long finish = System.nanoTime();
        System.out.println("The total execution time for " + joinPoint.getSignature().getName() + " is " + (finish-start));

    }
    @After("logAllMethods()")
    public void logAfter(JoinPoint joinPoint) {

        String operation = joinPoint.getSignature().getName();
        LocalDateTime date = LocalDateTime.now();
        String principle = "User-Victor";
        String time = date.getHour() + ":" + date.getMinute();

        Logger logger = new Logger();
        logger.setDate(date);
        logger.setOperation(operation);
        logger.setPrincple(principle);
        logger.setTime(time);
        loggerRepo.save(logger);

    }


}
