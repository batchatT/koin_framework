package com.example.koin_framework.data

class APIImpl: API {
    override fun getDataFromNetwork(): String {
        return "Data from Network" + "\nAPI: $this"
    }
}