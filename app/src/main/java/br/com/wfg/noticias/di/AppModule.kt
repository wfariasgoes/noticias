package br.com.wfg.noticias.di

import br.com.wfg.noticias.splash.SplashViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { SplashViewModel() }
}