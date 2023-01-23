package com.metapp.data.injection

import com.metapp.data.metapp.MetappRepoImpl
import com.metapp.domain.metapp.MetappRepository
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindMetappRepository(metappRepoImpl: MetappRepoImpl): MetappRepository
}