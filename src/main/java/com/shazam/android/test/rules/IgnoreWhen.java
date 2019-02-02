package com.shazam.android.test.rules;

import com.shazam.android.test.conditions.Condition;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation can be used on test cases or methods in order to exclude
 * them in the test run on the current device depending on its runtime.
**/
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Documented
public @interface IgnoreWhen {
    Class<? extends Condition>[] device() default {};
}
