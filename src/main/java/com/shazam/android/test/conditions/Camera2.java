package com.shazam.android.test.conditions;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;

import static android.content.Context.CAMERA_SERVICE;
import static androidx.test.InstrumentationRegistry.getContext;

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class Camera2 {

    public static class NoBackFacingCamera implements Condition {
        @Override
        public boolean isSatisfied() {
            return !hasCamera(CameraCharacteristics.LENS_FACING_FRONT);
        }
    }

    public static boolean hasCamera(int cameraFacing) {
        CameraManager manager = (CameraManager) getContext().getSystemService(CAMERA_SERVICE);
        try {
            for (String cameraId : manager.getCameraIdList()) {
                CameraCharacteristics chars = manager.getCameraCharacteristics(cameraId);
                Integer facing = chars.get(CameraCharacteristics.LENS_FACING);
                if(facing != null && facing == cameraFacing) {
                    return true;
                }
            }

        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
        return false;
    }
}
