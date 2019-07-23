package com.flydean;

import com.flydean.beans.Demo;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author wayne
 * @version ParserConfigApp,  2019-07-21 16:22
 */
public class ParserConfigApp {

    public static void main(String[] args) {
        // Turn on:
// - auto null reference initialization
// - auto collection growing
        SpelParserConfiguration config = new SpelParserConfiguration(true,true);

        ExpressionParser parser = new SpelExpressionParser(config);

        Expression expression = parser.parseExpression("list[3]");

        Demo demo = new Demo();

        Object o = expression.getValue(demo);

        // demo.list will now be a real collection of 4 entries
        // Each entry is a new empty String
    }
}
