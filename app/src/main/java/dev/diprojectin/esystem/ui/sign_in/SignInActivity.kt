package dev.diprojectin.esystem.ui.sign_in

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import dev.diprojectin.esystem.R
import dev.diprojectin.esystem.data.local.data_store.PreferencesDataStoreHelper
import dev.diprojectin.esystem.data.local.data_store.PreiferencesDataStoreConstant
import dev.diprojectin.esystem.databinding.ActivitySignInBinding
import dev.diprojectin.esystem.ui.main_pages.MainActivity
import kotlinx.coroutines.launch

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    private lateinit var preferencesDataStoreHelper: PreferencesDataStoreHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        preferencesDataStoreHelper = PreferencesDataStoreHelper(this)
        setContentView(binding.root)

        with(binding){
            btnSignIn.setOnClickListener{
                goToMainPages()
            }
        }
    }

    private fun goToMainPages() {
        lifecycleScope.launch {
            preferencesDataStoreHelper.putPreference(PreiferencesDataStoreConstant.IS_LOGGED_IN,true)
            startActivity(Intent(this@SignInActivity,MainActivity::class.java))
            finish()
        }
    }
}