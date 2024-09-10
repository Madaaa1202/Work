package ChatBot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medicalfriend.R;
import com.example.medicalfriend.RetrolFitApi;
import com.example.medicalfriend.paginaPrincipalaDupaAutentificare;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PaginaPrincipalaChatBot extends AppCompatActivity {

    RecyclerView recyclerView;
    EditText editText;
    ImageView imageView;
    ArrayList<Chatsmodal> chatsmodalArrayList;
    ChatAdapter chatAdapter;
    private final String USER_KEY= "user";
    private final String BOT_KEY= "bot";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principala_chat_bot);
        overridePendingTransition(0, 0);

        recyclerView=findViewById(R.id.chat_recycler);
        editText=findViewById(R.id.edt_msg);
        imageView=findViewById(R.id.send_btr);
        chatsmodalArrayList =new ArrayList<>();
        chatAdapter=new ChatAdapter(chatsmodalArrayList,this);
        LinearLayoutManager mager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mager);
        recyclerView.setAdapter(chatAdapter);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().isEmpty()){
                    Toast.makeText(PaginaPrincipalaChatBot.this, R.string.please, Toast.LENGTH_SHORT).show();
                    return;
                }
                getResponse(editText.getText().toString());
                editText.setText("");
            }
        });

    }

    private void getResponse(String message) {
        chatsmodalArrayList.add(new Chatsmodal(message,USER_KEY));
        chatAdapter.notifyDataSetChanged();
        String url="http://api.brainshop.ai/get?bid=160167&key=8h8vRUhkZo5zyBrO&uid=[uid]&msg="+message;
        String BASE_URL = "http://api.brainshop.ai/";
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrolFitApi retrolFitApi=retrofit.create(RetrolFitApi.class);
        Call<MsgModal> call=retrolFitApi.getMessage(url);
        call.enqueue(new Callback<MsgModal>() {
            @Override
            public void onResponse(Call<MsgModal> call, Response<MsgModal> response) {
                if (response.isSuccessful()){
                    MsgModal msgModal=response.body();
                    chatsmodalArrayList.add(new Chatsmodal(msgModal.getCnt(),BOT_KEY));
                    chatAdapter.notifyDataSetChanged();
                    recyclerView.scrollToPosition(chatsmodalArrayList.size()-1);
                }
            }

            @Override
            public void onFailure(Call<MsgModal> call, Throwable t) {
                chatsmodalArrayList.add(new Chatsmodal("No response",BOT_KEY));
                chatAdapter.notifyDataSetChanged();

            }
        });


    }

    public void onBackPressed() {
        Intent int2=new Intent(PaginaPrincipalaChatBot.this, paginaPrincipalaDupaAutentificare.class);
        startActivity(int2);
        super.onBackPressed();
        return;
    }
}