package com.shazam.android.test.conditions;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import androidx.test.InstrumentationRegistry;

class Modules {

    private static Context getTargetContext() {
        return InstrumentationRegistry.getTargetContext();
    }

    static Resources resources() {
        return getTargetContext().getResources();
    }

    static PackageManager packageManager() {
        return getTargetContext().getPackageManager();
    }
}
