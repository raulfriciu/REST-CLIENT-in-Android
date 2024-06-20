package com.vogella.java.retrofitgerrit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GerritAPI {

    @GET("users/{user}/repos")
    Call<List<Change>> loadChanges(@Path("user") String user);
}
