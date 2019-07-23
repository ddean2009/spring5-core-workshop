package com.flydean;

import com.flydean.beans.MyMessage;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.SpelCompilerMode;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author wayne
 * @version SpelCompileApp,  2019-07-21 16:46
 */
public class SpelCompileApp {

    public static void main(String[] args) {
        SpelParserConfiguration config = new SpelParserConfiguration(SpelCompilerMode.IMMEDIATE,
                null);

        SpelExpressionParser parser = new SpelExpressionParser(config);

        Expression expr = parser.parseExpression("payload");

        MyMessage message = new MyMessage();

        Object payload = expr.getValue(message);
    }
}
