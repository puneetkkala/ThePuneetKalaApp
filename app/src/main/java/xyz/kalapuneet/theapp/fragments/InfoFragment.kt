package xyz.kalapuneet.theapp.fragments

import xyz.kalapuneet.theapp.R
import xyz.kalapuneet.theapp.base.BaseFragment

class InfoFragment : BaseFragment() {

    override val layoutId: Int = R.layout.fragment_info

    override fun initUi() {
    }

    companion object {
        fun newInstance(): InfoFragment {
            return InfoFragment()
        }
    }
}