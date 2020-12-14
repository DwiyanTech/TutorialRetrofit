package com.dwiyanstudio.retrofittutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NetworkConfig.getNetwrokInterface().getCharacter().enqueue(object :
            Callback<List<Character>>{
            override fun onFailure(call: Call<List<Character>>, t: Throwable) {
                Log.d("GAGAL",t.message.toString())
            }

            override fun onResponse(
                call: Call<List<Character>>,
                response: Response<List<Character>>
            ) {
                recycler_view.layoutManager = LinearLayoutManager(applicationContext)
                recycler_view.adapter = response.body()?.let { AdapterCharacter(it) }

            }

        })

    }
}