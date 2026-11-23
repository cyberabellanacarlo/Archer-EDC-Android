package com.archer.edc;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;

public class MainActivity extends Activity {
  private WebView view;
  @Override public void onCreate(Bundle state) {super.onCreate(state);
    view=new WebView(this); view.setBackgroundColor(0xfff4f8fc);
    WebSettings settings=view.getSettings(); settings.setJavaScriptEnabled(true); settings.setDomStorageEnabled(true);
    settings.setAllowFileAccess(true); settings.setAllowContentAccess(false);
    settings.setAllowFileAccessFromFileURLs(false); settings.setAllowUniversalAccessFromFileURLs(false);
    settings.setDefaultTextEncodingName("UTF-8");
    view.setWebChromeClient(new WebChromeClient());
    view.setWebViewClient(new WebViewClient(){
      @Override public boolean shouldOverrideUrlLoading(WebView w,String url){return route(url);}
      @Override public boolean shouldOverrideUrlLoading(WebView w,android.webkit.WebResourceRequest req){return route(req.getUrl().toString());}
      private boolean route(String url){if(url.startsWith("tel:")){startActivity(new Intent(Intent.ACTION_DIAL,Uri.parse(url)));return true;}
        return !url.startsWith("file:///android_asset/");}
    });
    setContentView(view);view.loadUrl("file:///android_asset/index.html");
  }
  @Override public void onBackPressed(){if(view.canGoBack())view.goBack();else super.onBackPressed();}
  @Override protected void onDestroy(){view.destroy();super.onDestroy();}
}
