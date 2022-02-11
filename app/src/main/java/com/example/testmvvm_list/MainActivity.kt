package com.example.testmvvm_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val respository = UsersRespository(ApiService())
        GlobalScope.launch(Dispatchers.Main) {
            val user = respository.getUsers()
            Toast.makeText(this@MainActivity, "$user", Toast.LENGTH_LONG).show()
        }
    }
}