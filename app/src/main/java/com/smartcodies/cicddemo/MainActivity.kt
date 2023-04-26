package com.smartcodies.cicddemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewbinding.BuildConfig
import com.smartcodies.cicddemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

//        throw RuntimeException("Test Crash abc123") // Force a crash

        mBinding.tvText.text = "@${mBinding.tvText.text}" + if (BuildConfig.DEBUG)
            "Build Type: DEBUG" else "Build Type: Release"
    }
}