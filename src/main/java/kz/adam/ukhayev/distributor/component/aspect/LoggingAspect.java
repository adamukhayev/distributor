//package kz.adam.ukhayev.distributor.component.aspect;
//
//import java.util.Arrays;
//import kz.adam.ukhayev.distributor.exception.GeneralTestApiException;
//import kz.adam.ukhayev.distributor.exception.TestApiError;
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//@Slf4j
//public class LoggingAspect {
//
//    @Around("execution(* kz.adam.ukhayev.distributor.controller.UserApiHandlerController+.*(..))")
//    public Object aroundReturnUserControllerAdvice(ProceedingJoinPoint joinPoint)
//            throws Throwable {
//        log.info("UserApiHandlerController." + joinPoint.getSignature().getName() + Arrays
//                .toString(joinPoint.getArgs()));
//        Object result = null;
//        try {
//            result = joinPoint.proceed();
//        } catch (Exception e) {
//            log.error(e.getMessage());
//        }
//        return result;
//    }
//
//    @Around("execution(* kz.adam.ukhayev.distributor.controller.MediaApiController+.*(..))")
//    public Object aroundReturnMediaControllerAdvice(ProceedingJoinPoint joinPoint)
//            throws Throwable {
//        log.info("MediaApiController." + joinPoint.getSignature().getName() + Arrays
//                .toString(joinPoint.getArgs()));
//        Object result = null;
//        try {
//            result = joinPoint.proceed();
//        } catch (Exception e) {
//            log.error(e.getMessage());
//        }
//        return result;
//    }
//
//    @Around("execution(* kz.adam.ukhayev.distributor.controller.MessengerApiController+.*(..))")
//    public Object aroundReturnMessageControllerAdvice(ProceedingJoinPoint joinPoint)
//            throws Throwable {
//        log.info("MessengerApiController." + joinPoint.getSignature().getName() + Arrays
//                .toString(joinPoint.getArgs()));
//        Object result = null;
//        try {
//            result = joinPoint.proceed();
//        } catch (Exception e) {
//            log.error(e.getMessage());
//        }
//        return result;
//    }
//
//    @Around("execution(* kz.adam.ukhayev.distributor.service.impl.UserServiceImpl+.*(..))")
//    public Object aroundReturnUserServiceAdvice(ProceedingJoinPoint joinPoint)
//            throws Throwable {
//        log.info("UserServiceImpl: " + joinPoint.getSignature().getName() + Arrays
//                .toString(joinPoint.getArgs()));
//        Object result = null;
//        try {
//            result = joinPoint.proceed();
//        } catch (GeneralTestApiException e) {
//            log.error(e.getMessage());
//            throw new GeneralTestApiException(TestApiError.E403_FORBIDDEN, e.getMessage());
//        }
//        return result;
//    }
//
//    @Around("execution(* kz.adam.ukhayev.distributor.service.impl.MediaApiServiceImpl+.*(..))")
//    public Object aroundReturnMediaServiceAdvice(ProceedingJoinPoint joinPoint)
//            throws Throwable {
//        log.info("MediaServiceImpl." + joinPoint.getSignature().getName() + Arrays
//                .toString(joinPoint.getArgs()));
//        Object result = null;
//        try {
//            result = joinPoint.proceed();
//        } catch (Exception e) {
//            log.error(e.getMessage());
//        }
//        return result;
//    }
//
//    @Around("execution(* kz.adam.ukhayev.distributor.service.impl.MessengerApiServiceImpl+.*(..))")
//    public Object aroundReturnMessageServiceAdvice(ProceedingJoinPoint joinPoint)
//            throws Throwable {
//        log.info("MessengerServiceImpl." + joinPoint.getSignature().getName() + Arrays
//                .toString(joinPoint.getArgs()));
//        Object result = null;
//        try {
//            result = joinPoint.proceed();
//        } catch (Exception e) {
//            log.error(e.getMessage());
//        }
//        return result;
//    }
//}
