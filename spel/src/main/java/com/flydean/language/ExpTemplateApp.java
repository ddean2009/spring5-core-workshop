package com.flydean.language;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author wayne
 * @version ExpTemplateApp,  2019-07-23 23:23
 */
public class ExpTemplateApp {

    public static void main(String[] args) {

        ExpressionParser parser = new SpelExpressionParser();

        String randomPhrase = parser.parseExpression(
                "random number is #{T(java.lang.Math).random()}",
                new TemplateParserContext()).getValue(String.class);

        // evaluates to "random number is 0.7038186818312008"

        System.out.println(randomPhrase);
    }
}
