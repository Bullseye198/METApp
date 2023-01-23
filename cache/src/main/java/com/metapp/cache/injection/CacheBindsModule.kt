package com.metapp.cache.injection

import com.metapp.cache.metapp.MetappCacheImpl
import com.metapp.data.metapp.MetappCache
import dagger.Binds
import dagger.Module

@Module
interface CacheBindsModule {

    @Binds
    fun bindMetappCached(metappCacheImpl: MetappCacheImpl): MetappCache
}