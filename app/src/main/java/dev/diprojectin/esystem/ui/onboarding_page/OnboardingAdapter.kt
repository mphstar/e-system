package dev.diprojectin.esystem.ui.onboarding_page

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import dev.diprojectin.esystem.ui.onboarding_page.pages.PageOneFragment
import dev.diprojectin.esystem.ui.onboarding_page.pages.PageTwoFragment

class OnboardingAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PageOneFragment()
            1 -> PageTwoFragment()
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}