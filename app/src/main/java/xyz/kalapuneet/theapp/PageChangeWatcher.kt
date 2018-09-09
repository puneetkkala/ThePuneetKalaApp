package xyz.kalapuneet.theapp

import androidx.viewpager.widget.ViewPager

abstract class PageChangeWatcher: ViewPager.OnPageChangeListener {
    override fun onPageScrollStateChanged(state: Int) {
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
    }

    abstract override fun onPageSelected(position: Int)
}