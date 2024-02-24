package dev.diprojectin.esystem.ui.approval_page.ceo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.diprojectin.esystem.databinding.ActivityApprovalCeoBinding

class ApprovalCeoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityApprovalCeoBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApprovalCeoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.header.firstTitle.text = "Approval"
        binding.header.secondTitle.text = "Login ID"

        binding.header.back.setOnClickListener {
            finish()
        }
    }
}