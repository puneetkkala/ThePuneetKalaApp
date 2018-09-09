package xyz.kalapuneet.theapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import xyz.kalapuneet.theapp.base.BaseFragment

class ViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    private val fragments = arrayListOf<BaseFragment>()

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getCount(): Int = fragments.size

    fun addFragment(frag: BaseFragment) = fragments.add(frag)
}