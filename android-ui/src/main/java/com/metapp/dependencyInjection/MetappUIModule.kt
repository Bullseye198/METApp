package com.metapp.dependencyInjection

import com.metapp.ui.main.MetappListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MetappUIModule {

    @ContributesAndroidInjector
    fun contributesMetappListFragment(): MetappListFragment
}