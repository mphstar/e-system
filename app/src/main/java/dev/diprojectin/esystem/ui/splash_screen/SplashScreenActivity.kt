package dev.diprojectin.esystem.ui.splash_screen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.lifecycleScope
import dev.diprojectin.esystem.data.local.data_store.PreferencesDataStoreHelper
import dev.diprojectin.esystem.data.local.data_store.PreiferencesDataStoreConstant.IS_ONBOARDING
import dev.diprojectin.esystem.databinding.ActivitySplashScreenBinding
import dev.diprojectin.esystem.ui.onboarding_page.OnboardingActivity
import dev.diprojectin.esystem.ui.sign_in.SignInActivity
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    private lateinit var preferencesDataStoreHelper: PreferencesDataStoreHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        preferencesDataStoreHelper = PreferencesDataStoreHelper(this)

        Handler(Looper.getMainLooper()).postDelayed({
            lifecycleScope.launch {
                preferencesDataStoreHelper.getPreference(IS_ONBOARDING,false).collect { isOnboarding ->
                    if (isOnboarding){
                        startActivity(Intent(this@SplashScreenActivity,SignInActivity::class.java))
                        finish()
                    }else{
                        startActivity(Intent(this@SplashScreenActivity,OnboardingActivity::class.java))
                        finish()
                    }
                }
            }
        },2000)
    }
}