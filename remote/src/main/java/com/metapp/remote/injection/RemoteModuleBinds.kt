package com.metapp.remote.injection

import com.metapp.data.metapp.MetappRemote
import com.metapp.remote.metapp.MetappRemoteImpl
import dagger.Binds
import dagger.Module

@Module
interface RemoteModuleBinds {

    @Binds
    fun bindMetappRemote(metappRemoteImpl: MetappRemoteImpl): MetappRemote
}