package com.tirexmurina.marketplaceviewxml.utils

import androidx.fragment.app.Fragment
import com.tirexmurina.marketplaceviewxml.MainActivity

val Fragment.mainActivity: MainActivity
    get() = requireActivity() as MainActivity