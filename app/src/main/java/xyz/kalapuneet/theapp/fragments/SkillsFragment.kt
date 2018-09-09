package xyz.kalapuneet.theapp.fragments

import xyz.kalapuneet.theapp.R
import xyz.kalapuneet.theapp.base.BaseFragment

class SkillsFragment: BaseFragment() {

    override val layoutId: Int = R.layout.fragment_skills

    override fun initUi() {
    }

    companion object {
        fun newInstance(): SkillsFragment {
            return SkillsFragment()
        }
    }
}