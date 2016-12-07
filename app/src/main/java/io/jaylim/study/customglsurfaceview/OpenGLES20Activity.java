package io.jaylim.study.customglsurfaceview;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by jaylim on 12/7/2016.
 */

public class OpenGLES20Activity extends AppCompatActivity {
  private GLSurfaceView mGLView;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Create a GLSurfaceView instance and set it
    // as the ContentView for this Activity.

    mGLView = new MyGLSurfaceView(this);
    setContentView(mGLView);
  }
}
