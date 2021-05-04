package com.sufajar.mylogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.sufajar.mylogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root);

        binding.btnLogin.setOnClickListener{

            val username: String = binding.edtUsername.text.toString()
            val password: String = binding.edtPassword.text.toString()
            if(username.trim().length>0 && password.trim().length>0 ) {
                val datalogin = ModelLogin(
                    binding.edtUsername.text.toString(),
                    binding.edtPassword.text.toString()
                )
                val intent = Intent(this, DetailActivity::class.java)
                intent.putExtra("data", datalogin)
                startActivity(intent)
                finish()
            }
            else {
                Toast.makeText(this,"User and password must be fill in!", Toast.LENGTH_SHORT).show()
            }
        }




    }
}