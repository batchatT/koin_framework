package com.example.koin_framework.data

class DBImpl: DB {
    override fun getDataFromDB(): String {
        return "Data from DB" + "\nDB: $this"
    }
}