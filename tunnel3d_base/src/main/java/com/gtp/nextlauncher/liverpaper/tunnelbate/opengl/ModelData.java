package com.gtp.nextlauncher.liverpaper.tunnelbate.opengl;

import android.content.Context;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: ModelData */
public class ModelData {
    public int f813a;
    public FloatBuffer f814b;
    public FloatBuffer f815c;
    public FloatBuffer f816d;
    public Point f817e;

    public ModelData(Context context, float[] fArr, float[] fArr2, float[] fArr3, Point point) {
        this.f817e = point;
        m1091a(fArr, fArr2, fArr3);
    }

    public void m1091a(float[] fArr, float[] fArr2, float[] fArr3) {
        this.f813a = fArr.length / 3;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f814b = allocateDirect.asFloatBuffer();
        this.f814b.put(fArr);
        this.f814b.position(0);
        allocateDirect = ByteBuffer.allocateDirect(fArr2.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.f815c = allocateDirect.asFloatBuffer();
        this.f815c.put(fArr2);
        this.f815c.position(0);
        ByteBuffer.allocateDirect(fArr3.length * 4).order(ByteOrder.nativeOrder());
        this.f816d = allocateDirect.asFloatBuffer();
        this.f816d.put(fArr2);
        this.f816d.position(0);
    }

    public int m1090a() {
        return this.f813a;
    }

    public FloatBuffer m1092b() {
        return this.f814b;
    }

    public FloatBuffer m1093c() {
        return this.f815c;
    }

    public FloatBuffer m1094d() {
        return this.f816d;
    }

    public Point m1095e() {
        return new Point(528.9468f, 0.0f, -9.410217f);
    }
}
