package dev.diprojectin.esystem.ui.approval_page

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.diprojectin.esystem.R
import dev.diprojectin.esystem.databinding.ActivityApprovalBinding
import dev.diprojectin.esystem.ui.absensi_page.employee_absensi_page.EmployeeAbsensiActivity
import dev.diprojectin.esystem.ui.approval_page.ceo.ApprovalCeoActivity
import dev.diprojectin.esystem.ui.approval_page.staff.ApprovalStaffActivity


class ApprovalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityApprovalBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApprovalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.header.firstTitle.text = "Howdy,"
        binding.header.secondTitle.text = "Ndaru Samboja"


        binding.header.back.setOnClickListener {
            finish()
        }

        binding.ceoMenu.setOnClickListener {
            startActivity(Intent(this@ApprovalActivity, ApprovalCeoActivity::class.java))
        }

        binding.staffMenu.setOnClickListener {
            startActivity(Intent(this@ApprovalActivity, ApprovalStaffActivity::class.java))
        }


    }
}