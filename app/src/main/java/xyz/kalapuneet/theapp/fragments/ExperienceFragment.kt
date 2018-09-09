package xyz.kalapuneet.theapp.fragments

import xyz.kalapuneet.theapp.R
import xyz.kalapuneet.theapp.base.BaseFragment

class ExperienceFragment: BaseFragment() {
    override val layoutId: Int = R.layout.fragment_experience

    override fun initUi() {
    }

    companion object {
        fun newInstance(): ExperienceFragment {
            return ExperienceFragment()
        }
    }
}