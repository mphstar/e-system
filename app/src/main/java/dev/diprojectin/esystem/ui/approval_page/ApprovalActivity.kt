package dev.diprojectin.esystem.ui.approval_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.diprojectin.esystem.R
import dev.diprojectin.esystem.databinding.ActivityApprovalBinding


class ApprovalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityApprovalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApprovalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            finish()
        }


    }
}