package com.mohasiba.app;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
  private WebView w;
  @Override public void onCreate(Bundle b){
    super.onCreate(b);
    w=new WebView(this);
    setContentView(w);
    w.setWebViewClient(new WebViewClient());
    WebSettings s=w.getSettings();
    s.setJavaScriptEnabled(true);
    s.setDomStorageEnabled(true);
    s.setDefaultTextEncodingName("UTF-8");
    w.loadUrl("file:///android_asset/index.html");
  }
  @Override public void onBackPressed(){
    if(w!=null && w.getUrl()!=null){
      w.evaluateJavascript("(window.handleAndroidBack && window.handleAndroidBack()) ? 'handled' : 'exit'", value -> {
        if(value==null || value.contains("exit")) finish();
      });
    } else finish();
  }
}
