package com.example.easyfeedz

import android.app.Application
import com.example.easyfeedz.di.AppInjector
import com.example.easyfeedz.di.AppModule
import com.example.easyfeedz.di.DaggerAppInjector

class BaseApplication: Application()
{

    lateinit var injector: AppInjector
        private set

    override fun onCreate()
    {
        super.onCreate()

        injector = DaggerAppInjector.builder()
            .appModule( AppModule(applicationContext) )
            .build()
    }
}