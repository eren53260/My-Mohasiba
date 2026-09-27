package com.mohasiba.app;
import android.app.Activity; import android.os.Bundle; import android.webkit.WebSettings; import android.webkit.WebView; import android.webkit.WebViewClient;
public class MainActivity extends Activity {
  @Override public void onCreate(Bundle b){super.onCreate(b); WebView w=new WebView(this); setContentView(w); w.setWebViewClient(new WebViewClient()); WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setDefaultTextEncodingName("UTF-8"); w.loadUrl("file:///android_asset/index.html");}
}
