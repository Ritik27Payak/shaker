package com.example.ritik;

import android.hardware.SensorEvent;

public interface Shake {
    void onShakeChanged(SensorEvent se);
}
