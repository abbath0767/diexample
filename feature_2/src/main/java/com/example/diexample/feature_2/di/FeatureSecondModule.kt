package com.example.diexample.feature_2.di

import com.example.diexample.di.PerFragment
import com.example.diexample.feature_2.data.FeatureSecondRepository
import com.example.diexample.feature_2.data.FeatureSecondRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module(includes = [FeatureSecondModule.Binding::class])
class FeatureSecondModule {

//    @Provides
//    @PerFragment
//    fun bindFeatureSecondRepo(): FeatureSecondRepository {
//        return FeatureSecondRepositoryImpl()
//    }

    @Module
    abstract class Binding {

        @Binds
        @PerFragment
        @PublishedApi
        internal abstract fun bindSecondRepo(repo: FeatureSecondRepositoryImpl): FeatureSecondRepository
    }
}