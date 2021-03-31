package com.hig.highlyintelligentgaller.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;

/**
 * Сквозные функции
 * <p>
 * Используются для логирование(см АОП)
 */

@Aspect
public class LoggingAspect {
    private final Environment env;

    public LoggingAspect(Environment env) {
        this.env = env;
    }

    @Pointcut(
            "within(@org.springframework.stereotype.Repository *)" +
                    " || within(@org.springframework.stereotype.Service *)" +
                    " || within(@org.springframework.web.bind.annotation.RestController *)"
    )
    public void springBeanPointcut() {
        // ToDo: implement me pls
    }

    @Pointcut(
            "within(com.hig.highlyintelligentgaller.repository..*)" +
                    " || within(com.hig.highlyintelligentgaller.service..*)" +
                    " || within(com.hig.highlyintelligentgaller.controller..*)"
    )
    public void applicationPackagePointcut() {
        // ToDo: implement me pls
    }

    private Logger logger(JoinPoint joinPoint) {
        return LoggerFactory.getLogger(joinPoint.getSignature().getDeclaringTypeName());
    }

}
