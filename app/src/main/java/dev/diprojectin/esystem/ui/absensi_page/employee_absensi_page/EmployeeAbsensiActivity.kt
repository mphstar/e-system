package dev.diprojectin.esystem.ui.absensi_page.employee_absensi_page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.diprojectin.esystem.databinding.ActivityEmployeeAbsensiBinding
import dev.diprojectin.esystem.ui.absensi_page.sign_in_absensi_page.SignInAbsensiActivity

class EmployeeAbsensiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEmployeeAbsensiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmployeeAbsensiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            cvSignIn.setOnClickListener {
                startActivity(Intent(this@EmployeeAbsensiActivity,
                    SignInAbsensiActivity::class.java))
            }
        }

    }
}