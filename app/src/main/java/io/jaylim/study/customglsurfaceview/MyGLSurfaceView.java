package io.jaylim.study.customglsurfaceview;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by jaylim on 12/7/2016.
 */

public class MyGLSurfaceView extends GLSurfaceView {

  private final MyGLRenderer mRenderer;

  public MyGLSurfaceView(Context context) {
    super(context);

    setEGLContextClientVersion(2);

    mRenderer = new MyGLRenderer();

    setRenderer(mRenderer);
  }


}
