package xyz.kalapuneet.theapp.fragments

import xyz.kalapuneet.theapp.R
import xyz.kalapuneet.theapp.base.BaseFragment

class AboutFragment: BaseFragment() {

    override val layoutId: Int = R.layout.fragment_about

    override fun initUi() {
    }

    companion object {
        fun newInstance(): AboutFragment {
            return AboutFragment()
        }
    }
}