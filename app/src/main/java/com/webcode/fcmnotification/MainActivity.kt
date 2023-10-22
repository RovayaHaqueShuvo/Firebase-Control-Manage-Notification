package com.webcode.fcmnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.webcode.fcmnotification.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        var dataString:String=""
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        if(intent!= null){
            if (intent.hasExtra("Live")){
                for(key in intent.extras!!.keySet()){
                    dataString = dataString+intent.extras!!.getString(key)+"\n"
                }
                binding.text.text = dataString.toString()
            }

        }
    }
}