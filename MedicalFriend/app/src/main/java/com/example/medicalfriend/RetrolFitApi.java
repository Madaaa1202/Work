package com.example.medicalfriend;

import ChatBot.MsgModal;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrolFitApi {
    @GET
    Call<MsgModal> getMessage(@Url String url);
}
