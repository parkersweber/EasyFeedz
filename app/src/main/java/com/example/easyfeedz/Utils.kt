package com.example.easyfeedz

import androidx.appcompat.app.AppCompatActivity
import com.example.easyfeedz.di.AppInjector

fun AppCompatActivity.injector(): AppInjector
{
    return (application as BaseApplication).injector
}