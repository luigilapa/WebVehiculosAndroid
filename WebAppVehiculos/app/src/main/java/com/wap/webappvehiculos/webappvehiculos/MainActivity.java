package com.wap.webappvehiculos.webappvehiculos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView)findViewById(R.id.WebView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.loadUrl("http://lpalma-001-site1.htempurl.com/");

        webView.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView webView1,String url){
                return false;
            }
        });

    }
}
