package xyz.kalapuneet.theapp.activities

import android.os.Handler
import xyz.kalapuneet.theapp.R
import xyz.kalapuneet.theapp.base.BaseActivity



class SplashActivity : BaseActivity() {
    override val layoutId: Int = R.layout.activity_splash

    override fun initUi() {
        Handler().postDelayed({
            startActivity(HomeActivity.getIntent(this))
            finish()
        }, 1700)
    }
}
