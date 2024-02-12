package dev.diprojectin.esystem.ui.absensi_page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.diprojectin.esystem.R
import dev.diprojectin.esystem.databinding.ActivityAbsensiBinding
import dev.diprojectin.esystem.ui.absensi_page.employee_absensi_page.EmployeeAbsensiActivity

class AbsensiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAbsensiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAbsensiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            cvAbsensi.setOnClickListener {
                startActivity(Intent(this@AbsensiActivity, EmployeeAbsensiActivity::class.java))
            }
        }
    }
}