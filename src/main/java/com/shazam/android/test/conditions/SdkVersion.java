package com.shazam.android.test.conditions;

import android.os.Build;

public class SdkVersion {

    public static class IceCreamSandwichAndEarlier implements Condition {
        @Override
        public boolean isSatisfied() {
            return isEqualOrLessThan(Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1);
        }
    }

    public static class JellyBeanAndEarlier implements Condition {
        @Override
        public boolean isSatisfied() {
            return isEqualOrLessThan(Build.VERSION_CODES.JELLY_BEAN_MR2);
        }
    }

    private static boolean isEqualOrLessThan(int apiLevel) {
        return apiLevel <= Build.VERSION.SDK_INT;
    }
}
