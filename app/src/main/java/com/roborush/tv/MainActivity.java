package com.roborush.tv;
import android.app.Activity;import android.os.Bundle;import android.view.*;import android.webkit.*;
public class MainActivity extends Activity{
WebView w;
@Override protected void onCreate(Bundle b){super.onCreate(b);
getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
w=new WebView(this);WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setMediaPlaybackRequiresUserGesture(false);
w.setBackgroundColor(0xFF000000);w.setWebViewClient(new WebViewClient());setContentView(w);
w.loadUrl("file:///android_asset/index.html");w.requestFocus();
getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN|View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY|View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);}
@Override protected void onPause(){super.onPause();w.onPause();}
@Override protected void onResume(){super.onResume();w.onResume();}
}
