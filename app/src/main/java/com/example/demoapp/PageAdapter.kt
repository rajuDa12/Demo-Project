package com.teamokcodex.numbersystem.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fm:FragmentManager): FragmentPagerAdapter(fm)
{

    private var mfragmentlist=ArrayList<Fragment>()

    private var list=ArrayList<String>()


    override fun getItem(position: Int): Fragment {
         return mfragmentlist[position]
    }


    override fun getCount(): Int {

        return mfragmentlist.size

    }

    override fun getPageTitle(position: Int): CharSequence?
    {
        return list[position]
    }

    fun addFragment(fragment: Fragment,title:String)
    {
        mfragmentlist.add(fragment)
        list.add(title)

    }

}