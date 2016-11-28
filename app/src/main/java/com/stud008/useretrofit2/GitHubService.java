package com.stud008.useretrofit2;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by yvtc on 2016/11/18.
 */

public interface GitHubService {
//  @get("網址")
    @GET("api/read_data.php")  //GET 跟http協定有關
    Call<List<Repo>> listRepos();  //listRepos 當成JAVA的方法來使用,user要同上一行user 因為代表參數
    //建立Repo的list   因為是用GSON格式所以要用 LIST<<Rrpo>>
    @GET("api/api_delete_get.php")
    Call<ResponseBody> delete(@Query("cID") String cID) ;//Response 代表不做處理直接傳,@Query會帶加?所以會傳[?cID]
    @GET("api/api_add_get.php")
    Call<ResponseBody> add(@Query("cName") String cName);

    //下面用表單的方式
    @FormUrlEncoded
    @POST("api/api_add_post.php")
    Call<ResponseBody> addByFormPost(@Field("cName") String cName,
                                     @Field("cSex") String cSex,
                                     @Field("cBirthday") String cBirthday,
                                     @Field("cEmail") String cEmail,
                                     @Field("cPhone") String cPhone,
                                     @Field("cAddr") String cAddr);
}
