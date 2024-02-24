package dev.diprojectin.esystem.ui.approval_page.staff

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.diprojectin.esystem.R
import dev.diprojectin.esystem.databinding.ActivityApprovalCeoBinding
import dev.diprojectin.esystem.databinding.ActivityApprovalStaffBinding

class ApprovalStaffActivity : AppCompatActivity() {
    private lateinit var binding: ActivityApprovalStaffBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApprovalStaffBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.header.firstTitle.text = "Approval"
        binding.header.secondTitle.text = "Login ID"

        binding.header.back.setOnClickListener {
            finish()
        }
    }
}