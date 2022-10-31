package com.example.koin_framework.data

interface Repository {

    fun getDataFromDB(): String

    fun getDataFromNetwork(): String
}