package com.cheongmin.voicereader.network

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.cheongmin.voicereader.model.User
import com.cheongmin.voicereader.R
import com.cheongmin.voicereader.model.Question
import com.cheongmin.voicereader.model.QuestionRequest
import com.cheongmin.voicereader.service.QuestionService
import com.cheongmin.voicereader.service.UserService
import kotlinx.android.synthetic.main.activity_retrofit.*
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File


class RetrofitTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)
    }
}

        /*btn_request.setOnClickListener {
            val apiClient = RetrofitManager.create(UserService::class.java)
            apiClient.fetchUser("5bf7647613a29200014e9a10")
                    .enqueue(object : Callback<User> {
                        override fun onResponse(call: Call<User>, response: Response<User>) {
                            Log.d("Retrofit", "call onResponse")
                            Log.d("Retrofit", response.message())
                            if (response.isSuccessful) {
                                tv_response.text = response.body().toString()
                            }
                        }

                        override fun onFailure(call: Call<User>, t: Throwable) {
                            Log.d("Retrofit", "call onFailure")
                            t.printStackTrace()
                        }
                    })
        }


        val file = File("/storage/emulated/0/Download/1.wav")
        val sound = MultipartBody.Part.createFormData("sound", file.getName(), RequestBody.create(MediaType.parse("audio/*"), file))
        val json = MultipartBody.Part.createFormData("json", QuestionRequest("testsubtitle", "testcontents").toString())

        btn_request.setOnClickListener {
            val apiClient = RetrofitManager.createWithAccessToken(QuestionService::class.java)
            apiClient.newQuestion(sound, json)
                    .enqueue(object : Callback<Question> {
                        override fun onResponse(call: Call<Question>, response: Response<Question>) {
                            Log.d("Retrofit", "call onResponse")
                            Log.d("Retrofit", response.message())
                            Log.d("Retrofit", response.body().toString())
                        }

                        override fun onFailure(call: Call<Question>, t: Throwable) {
                            Log.d("Retrofit", "call onFailure")
                            t.printStackTrace()
                        }
                    })
        }
    }
}*/