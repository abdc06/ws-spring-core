package me.abdc.springel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    /**
     * #{표현석}
     */
    @Value("#{1 + 1}")
    int value;

    @Value("#{'Hello ' + 'SpringEL'}")
    String greeting;

    @Value("#{1 eq 1}")
    boolean trueOrFalse;

    /**
     * ${프로퍼티}
     */
    @Value("${my.value}")
    int myValue;

    /**
     * 표현식은 프로퍼티를 하위 요소로 가질 수 있음
     */
    @Value("#{${my.value} eq 100}")
    boolean isMyValue100;

    @Value("#{sample.data}")
    int sampleData;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("---------- 표현식 ----------");
        System.out.println(value);
        System.out.println(greeting);
        System.out.println(trueOrFalse);
        System.out.println();

        System.out.println("---------- 프로퍼티 ----------");
        System.out.println(myValue);
        System.out.println();

        System.out.println("---------- 표현식 > 프로퍼티 ----------");
        System.out.println(isMyValue100);
        System.out.println();

        System.out.println("---------- 빈의 요소 ----------");
        System.out.println(sampleData);
        System.out.println();

        System.out.println("---------- Expression을 사용한 방법 ----------");
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("7 + 10");
        Integer value = expression.getValue(Integer.class);
        System.out.println(value);
    }
}
