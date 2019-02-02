package com.shazam.android.test.conditions;

import android.content.Context;
import androidx.test.InstrumentationRegistry;
import android.util.DisplayMetrics;

public class Form {

    public static class Tablet implements Condition {

        @Override
        public boolean isSatisfied() {
            Context targetContext = InstrumentationRegistry.getTargetContext();
            DisplayMetrics displayMetrics = targetContext.getResources().getDisplayMetrics();
            int width = dps(displayMetrics.widthPixels, displayMetrics.densityDpi);
            int height = dps(displayMetrics.heightPixels, displayMetrics.densityDpi);
            return width >= 600 || height >= 600;
        }

    }

    private static int dps(int dimension, int densityDpi) {
        return (160 * dimension) / densityDpi;
    }
}
