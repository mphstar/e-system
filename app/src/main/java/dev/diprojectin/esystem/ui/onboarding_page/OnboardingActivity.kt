package dev.diprojectin.esystem.ui.onboarding_page

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.datastore.preferences.preferencesDataStore
import androidx.lifecycle.lifecycleScope
import com.google.android.material.tabs.TabLayoutMediator
import dev.diprojectin.esystem.data.local.data_store.PreferencesDataStoreHelper
import dev.diprojectin.esystem.data.local.data_store.PreiferencesDataStoreConstant.IS_ONBOARDING
import dev.diprojectin.esystem.databinding.ActivityOnboardingBinding
import dev.diprojectin.esystem.ui.sign_in.SignInActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class OnboardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingBinding
    private lateinit var preferencesDataStoreHelper: PreferencesDataStoreHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        preferencesDataStoreHelper = PreferencesDataStoreHelper(this)

        with(binding){
            val adapter = OnboardingAdapter(this@OnboardingActivity)
            viewPager.adapter = adapter

            TabLayoutMediator(tabLayout, viewPager) { _, _ -> }.attach()

            ivSkip.setOnClickListener {
                goToSignIn()
            }
        }
    }

    private fun goToSignIn() {
        lifecycleScope.launch{
            preferencesDataStoreHelper.putPreference(IS_ONBOARDING,true)

            startActivity(Intent(this@OnboardingActivity, SignInActivity::class.java))
            finish()
        }
    }
}