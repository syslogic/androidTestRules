package com.shazam.android.test.conditions;

import android.annotation.TargetApi;
import android.os.Build;

public class Camera {

    @Deprecated
    public static class NoBackFacingCamera implements Condition {

        @TargetApi(Build.VERSION_CODES.GINGERBREAD)
        @Override
        public boolean isSatisfied() {
            return !hasCamera(android.hardware.Camera.CameraInfo.CAMERA_FACING_BACK);
        }
    }

    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    private static boolean hasCamera(int cameraFacing) {
        android.hardware.Camera.CameraInfo info = new android.hardware.Camera.CameraInfo();
        for (int i = 0; i < android.hardware.Camera.getNumberOfCameras(); i++) {
            android.hardware.Camera.getCameraInfo(i, info);
            if (cameraFacing == info.facing) {
                return true;
            }
        }
        return false;
    }
}
