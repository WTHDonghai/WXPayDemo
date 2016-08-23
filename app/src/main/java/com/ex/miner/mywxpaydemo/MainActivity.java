package com.ex.miner.mywxpaydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

public class MainActivity extends AppCompatActivity {

    private Button mBtn_pay;
    private TextView mTv_Result;
    private IWXAPI api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn_pay = (Button) findViewById(R.id. btn_pay);
        mTv_Result = (TextView) findViewById(R.id.payResult);

        //注册微信
        api = WXAPIFactory.createWXAPI(this, Constants.APP_ID, false);
        api.registerApp(Constants.APP_ID);

    }

    /**
     * 开始支付
     */
    public void click(View view)
    {





    }


    /**
     * 微信支付
     */
    public void wxPay()
    {



    }

}
