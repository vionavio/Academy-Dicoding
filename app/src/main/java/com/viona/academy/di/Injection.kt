package com.viona.academy.di

import android.content.Context
import com.viona.academy.data.source.AcademyRepository
import com.viona.academy.data.source.remote.response.RemoteDataSource
import com.viona.academy.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return AcademyRepository.getInstance(remoteDataSource)
    }
}