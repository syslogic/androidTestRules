package com.shazam.android.test.rules;

import com.shazam.android.test.conditions.ExampleConditions.AnyConfiguration;

import org.junit.*;

import static org.junit.Assert.fail;

@IgnoreWhen(device = AnyConfiguration.class)
public class ClassIgnoringTest {

    @Rule public ConditionalIgnoreRule rule = new ConditionalIgnoreRule();

    @Test
    public void confirmMethodsFromTestClassAreIgnored() {
        fail("This test should not have been executed because of its class annotation.");
    }
}
