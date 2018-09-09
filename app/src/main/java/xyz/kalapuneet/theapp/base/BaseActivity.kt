package xyz.kalapuneet.theapp.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    abstract val layoutId: Int

    final override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
        initUi()
    }

    abstract fun initUi()
}