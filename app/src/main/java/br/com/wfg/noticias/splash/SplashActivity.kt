package br.com.wfg.noticias.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import br.com.wfg.noticias.R
import org.koin.android.viewmodel.ext.android.viewModel

class SplashActivity : AppCompatActivity(R.layout.activity_splash) {

    private val viewModel by viewModel<SplashViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupObservers()
        viewModel.init()
    }

    private fun setupObservers() {
        viewModel.command.observe(this, Observer {
            when (it) {
                is SplashCommand.OpenHome -> openHome()
            }
        })
    }

    private fun openHome() {

    }

}
