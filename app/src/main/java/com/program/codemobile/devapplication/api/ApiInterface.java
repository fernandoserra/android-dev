package com.program.codemobile.devapplication.api;

import com.program.codemobile.devapplication.model.CartCreateModel;
import com.program.codemobile.devapplication.model.CartInserModel;
import com.program.codemobile.devapplication.model.CartListModel;
import com.program.codemobile.devapplication.model.CartProduct;
import com.program.codemobile.devapplication.model.CartResponseModel;
import com.program.codemobile.devapplication.model.MyPojo;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("products/{sku}")
    Call<MyPojo> products (@Path("sku") String sku);

    //New Cart
    @POST("cart")
    Call<CartResponseModel> newCart (@Body CartCreateModel cartCreateModel);

    //Get Cart
    @GET("cart")
    Call<CartListModel> listCart (@Query("cart_id") String cart_id, @Query("customer_id") String customer_id );

    //Insert cart
    @Headers("Content-Type: application/json")
    @POST("product")
    Call<ResponseBody> insertCart (@Body CartInserModel cartInserModel);

}
