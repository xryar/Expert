package com.example.expert.di


import com.example.core.domain.usecase.TourismInteractor
import com.example.core.domain.usecase.TourismUseCase
import com.example.expert.detail.DetailViewModel
import com.example.expert.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<TourismUseCase> { TourismInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}