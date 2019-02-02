package com.shazam.android.test.rules;

import com.shazam.android.test.conditions.ExampleConditions.AnyConfiguration;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.fail;

public class MethodIgnoringTest {

    @Rule public ConditionalIgnoreRule rule = new ConditionalIgnoreRule();

    @Test
    @IgnoreWhen(device = AnyConfiguration.class)
    public void confirmTestMethodIsIgnored() {
        fail("This test should not have executed because of its method annotation.");
    }

}
