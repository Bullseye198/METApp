package com.metapp.core.injection.module

import com.metapp.dependencyInjection.MetappUIModule
import com.metapp.features.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ApplicationModuleBinds {

    @ContributesAndroidInjector(
        modules = [MetappUIModule::class]
    )
    fun contributeMainActivity(): MainActivity
}