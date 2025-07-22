package com.s8066830.Services;

import com.s8066830.Models.AuthRequest;
import com.s8066830.Models.AuthResponse;
import com.s8066830.Models.EntityResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {
    @POST("sydney/auth")
    Call<AuthResponse> login(@Body AuthRequest request);

    @GET("dashboard/{entity}")
    Call<EntityResponse> getEntities(@Path("entity") String entityType);
}
