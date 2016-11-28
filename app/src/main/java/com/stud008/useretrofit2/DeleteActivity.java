package com.stud008.useretrofit2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DeleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        Intent intent = getIntent();
//        String cName= (String) intent.getExtras().getSerializable("cName"); //Serializable 是可序列化
//        System.out.println(cName);

        int postion= (int) intent.getExtras().getSerializable("position"); //Serializable 是可序列化
        System.out.println(postion);

//        TextView textViewName = (TextView) findViewById(R.id.textViewName);
//        textViewName.setText(cName);

        Myapp myapp = (Myapp)getApplicationContext(); //會把Myapp class抓近來
//        Iterator it = myapp.result.iterator();
//
//        int counter = 0;
//        while (it.hasNext()){ //利用while把值抓出來
//            Repo repo = (Repo) it.next();
//            if(counter==postion){ //如果相等 等於到了我們要的位置
//
//                TextView textViewName = (TextView) findViewById(R.id.textViewName);
//                textViewName.setText(repo.cName);
//                TextView textViewSex = (TextView) findViewById(R.id.textViewSex);
//                textViewSex.setText(repo.cSex);
//                TextView textViewBirthday = (TextView) findViewById(R.id.textViewBirthday);
//                textViewBirthday.setText(repo.cBirthday);
//                TextView textViewEmail = (TextView) findViewById(R.id.textViewEmail);
//                textViewEmail.setText(repo.cEmail);
//                TextView textViewPhone = (TextView) findViewById(R.id.textViewPhone);
//                textViewPhone.setText(repo.cPhone);
//                TextView textViewAddr = (TextView) findViewById(R.id.textViewAddr);
//                textViewAddr.setText(repo.cAddr);
//                break;
//            }
//            ++counter;
//        }
        Repo repo = myapp.result.get(postion);

        TextView textViewName = (TextView) findViewById(R.id.textViewName);
        textViewName.setText(repo.cName);
        TextView textViewSex = (TextView) findViewById(R.id.textViewSex);
        textViewSex.setText(repo.cSex);
        TextView textViewBirthday = (TextView) findViewById(R.id.textViewBirthday);
        textViewBirthday.setText(repo.cBirthday);
        TextView textViewEmail = (TextView) findViewById(R.id.textViewEmail);
        textViewEmail.setText(repo.cEmail);
        TextView textViewPhone = (TextView) findViewById(R.id.textViewPhone);
        textViewPhone.setText(repo.cPhone);
        TextView textViewAddr = (TextView) findViewById(R.id.textViewAddr);
        textViewAddr.setText(repo.cAddr);




        Button buttonCancel = (Button) findViewById(R.id.buttonCancel);
        Button buttonDelete = (Button) findViewById(R.id.buttonAdd);






    }
    public void  cancel(View view){

        Intent result = getIntent();
        setResult(Activity.RESULT_CANCELED,result);
        finish(); //結束頁面,會跳回 onActivityResult

    }
    public void  delete(View view){

        Intent result = getIntent();
        //result.putExtra("postion",postion);
        setResult(Activity.RESULT_OK,result);
        finish();

    }

}



