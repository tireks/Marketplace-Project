package com.tirexmurina.marketplaceviewxml.presentation.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.lifecycle.Lifecycle
import com.tirexmurina.marketplaceviewxml.R
import com.tirexmurina.marketplaceviewxml.databinding.FragmentTestFragBinding
import com.tirexmurina.marketplaceviewxml.presentation.BaseFragment
import com.tirexmurina.marketplaceviewxml.utils.mainActivity

class test_frag : BaseFragment<FragmentTestFragBinding>() {

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentTestFragBinding {
        return FragmentTestFragBinding.inflate(inflater, container, false)
    }

    override fun onResume() {
        super.onResume()
    }

}