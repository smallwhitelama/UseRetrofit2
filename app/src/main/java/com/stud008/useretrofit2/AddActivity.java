package com.stud008.useretrofit2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }





    public void  cancel(View view){

        Intent result = getIntent();
        setResult(Activity.RESULT_CANCELED,result);
        finish(); //結束頁面,會跳回 onActivityResult

    }
    public void  add(View view){


        Intent result = getIntent();
        //result.putExtra("postion",postion);
        setResult(Activity.RESULT_OK,result);
        finish();

    }
}
