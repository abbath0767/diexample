package com.example.diexample.feature_2.data

import com.example.diexample.analytics.Adjust
import javax.inject.Inject

internal class FeatureSecondRepositoryImpl @Inject constructor(
    private val adjust: Adjust
): FeatureSecondRepository {
    override fun getData() = "lolkek: ${adjust.hashCode()}"
}