package com.metapp.core.injection

import android.content.Context
import com.metapp.MyApplication
import com.metapp.cache.injection.CacheBindsModule
import com.metapp.cache.injection.CacheModule
import com.metapp.core.injection.module.ApplicationModule
import com.metapp.core.injection.module.ApplicationModuleBinds
import com.metapp.core.injection.module.DaoModule
import com.metapp.data.injection.DataModule
import com.metapp.dependencyInjection.MetappUIModule
import com.metapp.dependencyInjection.ViewModelModule
import com.metapp.remote.injection.RemoteModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        ApplicationModuleBinds::class,
        DaoModule::class,
        AndroidInjectionModule::class,
        ViewModelModule::class,
        MetappUIModule::class,
        CacheModule::class,
        CacheBindsModule::class,
        DataModule::class,
        RemoteModule::class

    ]
)
interface AppComponent : AndroidInjector<MyApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }
}