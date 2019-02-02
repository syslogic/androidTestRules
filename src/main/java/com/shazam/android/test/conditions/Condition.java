package com.shazam.android.test.conditions;

/**
 * A condition which will cause a test method or class to be ignored when satisfied.
**/
public interface Condition {

    /**
     * Checks whether a condition is satisfied.
     * @return true - the validity of a condition
    **/
    boolean isSatisfied();
}
