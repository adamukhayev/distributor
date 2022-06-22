package kz.adam.ukhayev.distributor.component.aspect;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    @Around("execution(* kz.adam.ukhayev.distributor.service.impl.UserServiceImpl+.*(..))")
    public Object aroundReturnUserServiceAdvice(ProceedingJoinPoint joinPoint)
            throws Throwable {
        log.info(joinPoint.getSignature().getName() + Arrays.toString(joinPoint.getArgs()));
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return result;
    }

//    @Around("execution(* kz.adam.ukhayev.distributor.service.impl.MediaApiServiceImpl+.*(..))")
//    public Object aroundReturnMediaApiServiceAdvice(ProceedingJoinPoint joinPoint)
//            throws Throwable {
//        log.info(joinPoint.getSignature().getName() + Arrays.toString(joinPoint.getArgs()));
//        Object result = null;
//        try {
//            result = joinPoint.proceed();
//        } catch (Exception e) {
//            log.error(e.getMessage());
//        }
//        return  result;
//    }
//
//    @Around("execution(* kz.adam.ukhayev.distributor.service.impl.MessengerApiService+.*(..))")
//    public Object aroundReturnMessengerApiServiceAdvice(ProceedingJoinPoint joinPoint)
//            throws Throwable {
//        log.info(joinPoint.getSignature().getName() + Arrays.toString(joinPoint.getArgs()));
//        Object result = null;
//        try {
//            result = joinPoint.proceed();
//        } catch (Exception e) {
//            log.error(e.getMessage());
//        }
//        return  result;
//    }
}
