package com.flydean.language;

import com.flydean.beans.Inventor;
import com.flydean.beans.PlaceOfBirth;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

/**
 * @author wayne
 * @version SafeNavApp,  2019-07-23 07:21
 */
public class SafeNavApp {

    public static void main(String[] args) {

        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        Inventor tesla = new Inventor("Nikola Tesla", "Serbian");
        tesla.setPlaceOfBirth(new PlaceOfBirth("Smiljan"));

        String city = parser.parseExpression("PlaceOfBirth?.City").getValue(context, tesla, String.class);
        System.out.println(city);  // Smiljan

        tesla.setPlaceOfBirth(null);
        city = parser.parseExpression("PlaceOfBirth?.City").getValue(context, tesla, String.class);
        System.out.println(city);  // null - does not throw NullPointerException!!!


    }
}
