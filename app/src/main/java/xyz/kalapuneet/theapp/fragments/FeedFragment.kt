package xyz.kalapuneet.theapp.fragments

import xyz.kalapuneet.theapp.R
import xyz.kalapuneet.theapp.base.BaseFragment

class FeedFragment: BaseFragment() {
    override val layoutId: Int = R.layout.fragment_feed

    override fun initUi() {
    }

    companion object {
        fun newInstance(): FeedFragment {
            return FeedFragment()
        }
    }
}