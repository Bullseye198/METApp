package com.metapp.cache.injection

import dagger.Module

@Module(
    includes = [
        CacheBindsModule::class
    ]
)
object CacheModule {
}