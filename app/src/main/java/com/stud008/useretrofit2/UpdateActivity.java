package com.stud008.useretrofit2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class UpdateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        Intent intent = getIntent();
        int postion= (int) intent.getExtras().getSerializable("position"); //Serializable 是可序列化
        System.out.println(postion);

        Myapp myapp =(Myapp) getApplicationContext();
        Repo repo = myapp.result.get(postion);

        EditText cName = (EditText) findViewById(R.id.updateName);
        cName.setText(repo.cName);
        EditText cSex = (EditText) findViewById(R.id.updateSex);
        cSex.setText(repo.cSex);
        EditText cBirthday = (EditText) findViewById(R.id.updateBirthday);
        cBirthday.setText(repo.cBirthday);
        EditText cEmail = (EditText) findViewById(R.id.updateEmail);
        cEmail.setText(repo.cEmail);
        EditText cPhone = (EditText) findViewById(R.id.updatePhone);
        cPhone.setText(repo.cPhone);
        EditText cAddr = (EditText) findViewById(R.id.updateAddr);
        cAddr.setText(repo.cAddr);


    }

    public void  cancel(View view){

        Intent result = getIntent();
        setResult(Activity.RESULT_CANCELED,result);
        finish(); //結束頁面,會跳回 onActivityResult

    }
    public void  update(View view){
        //方法一 利用全域變數的方式
        Myapp myapp =(Myapp) getApplicationContext();

        myapp.StudentInformation.cName=((EditText)findViewById(R.id.updateName)).getText().toString();
        myapp.StudentInformation.cSex= ((EditText)findViewById(R.id.updateSex)).getText().toString();
        myapp.StudentInformation.cBirthday=((EditText)findViewById(R.id.updateBirthday)).getText().toString();
        myapp.StudentInformation.cEmail=((EditText)findViewById(R.id.updateEmail)).getText().toString();
        myapp.StudentInformation.cPhone=((EditText)findViewById(R.id.updatePhone)).getText().toString();
        myapp.StudentInformation.cAddr=((EditText)findViewById(R.id.updateAddr)).getText().toString();


////        String cID,cName,cSex,cBirthday,cEmail,cPhone,cAddr;
//        //方法二  利用Intent
        Intent result = getIntent(); //利用Intent來傳遞值
//        result.putExtra("cName",((EditText)findViewById(R.id.addName)).getText().toString());
//        result.putExtra("cSex",((EditText)findViewById(R.id.addSex)).getText().toString());
//        result.putExtra("cBirthday",((EditText)findViewById(R.id.addBirthday)).getText().toString());
//        result.putExtra("cEmail",((EditText)findViewById(R.id.addEmail)).getText().toString());
//        result.putExtra("cPhone",((EditText)findViewById(R.id.addPhone)).getText().toString());
//        result.putExtra("cAddr",((EditText)findViewById(R.id.addAddr)).getText().toString());


        setResult(Activity.RESULT_OK,result);
        finish();

    }
}
