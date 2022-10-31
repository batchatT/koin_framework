package com.example.koin_framework

import com.example.koin_framework.data.*
import com.example.koin_framework.first_fragment.FirstFragmentViewModel
import com.example.koin_framework.second_fragment.SecondFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    single<DB> {
        DBImpl()
    }

    factory<Repository> {
        RepositoryImpl(get(), get())
    }

    single<API> {
        APIImpl()
    }

    viewModel {
        FirstFragmentViewModel(get())
    }

    viewModel {
        SecondFragmentViewModel(get())
    }
}