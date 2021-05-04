package com.sufajar.mylogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sufajar.mylogin.databinding.ActivityDetailBinding
import com.sufajar.mylogin.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root);
        val getData = intent.getParcelableExtra<ModelLogin>("data")
        binding.textuser.text = getData?.username
        binding.textpassword.text = getData?.password
    }
}