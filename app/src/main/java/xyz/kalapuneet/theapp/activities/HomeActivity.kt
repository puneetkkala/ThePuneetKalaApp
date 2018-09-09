package xyz.kalapuneet.theapp.activities

import android.content.Context
import android.content.Intent
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_home.*
import xyz.kalapuneet.theapp.PageChangeWatcher
import xyz.kalapuneet.theapp.R
import xyz.kalapuneet.theapp.ViewPagerAdapter
import xyz.kalapuneet.theapp.base.BaseActivity
import xyz.kalapuneet.theapp.fragments.*

class HomeActivity: BaseActivity() {

    override val layoutId: Int = R.layout.activity_home

    override fun initUi() {
        setupViewPager()
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.about, R.id.experience, R.id.feed, R.id.skills, R.id.info -> Any()
            }
            return@setOnNavigationItemSelectedListener false
        }
        viewPager.addOnPageChangeListener(object: PageChangeWatcher() {

            lateinit var prevMenuItem: MenuItem

            override fun onPageSelected(position: Int) {
                if (::prevMenuItem.isInitialized) {
                    prevMenuItem.isChecked = false
                } else {
                    bottomNavigationView.menu.getItem(0).isChecked = false
                }
                prevMenuItem = bottomNavigationView.menu.getItem(position)
                prevMenuItem.isChecked = true
            }
        })
    }

    private fun setupViewPager() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(AboutFragment.newInstance())
        adapter.addFragment(ExperienceFragment.newInstance())
        adapter.addFragment(FeedFragment.newInstance())
        adapter.addFragment(SkillsFragment.newInstance())
        adapter.addFragment(InfoFragment.newInstance())
        viewPager.adapter = adapter
    }

    companion object {
        fun getIntent(context: Context): Intent {
            return Intent(context, HomeActivity::class.java)
        }
    }
}