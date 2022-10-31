package com.example.koin_framework.data

class RepositoryImpl(
    private val db: DB,
    private val api: API
): Repository {

    override fun getDataFromDB(): String {
        return db.getDataFromDB() + "\nrepo: $this"
    }

    override fun getDataFromNetwork(): String {
        return api.getDataFromNetwork() + "\nrepo: $this"
    }
}