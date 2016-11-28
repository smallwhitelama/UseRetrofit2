package com.stud008.useretrofit2;

import android.app.Application;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * Created by yvtc on 2016/11/18.
 */

public class Myapp extends Application {

    List<Repo> result; //把資料放入這裡
    GitHubService service;
    Call<List<Repo>> repos;
    Call<ResponseBody> delete;
    Call<ResponseBody> add;
    Call<ResponseBody> addByFormPost;
    //這邊可以寫get result &putresult 會比較漂亮
}
