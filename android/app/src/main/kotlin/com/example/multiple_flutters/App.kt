package com.example.multiple_flutters

import android.app.Application
import io.flutter.FlutterInjector
import io.flutter.embedding.engine.FlutterEngineGroup
import io.flutter.embedding.engine.loader.FlutterLoader

/**
 * Application class for this app.
 *
 * This holds onto our engine group.
 */
class App : Application() {
    lateinit var engines: FlutterEngineGroup

    override fun onCreate() {
        super.onCreate()
        val settings = FlutterLoader.Settings()
        settings.disableLeakVM()
        FlutterInjector.instance().flutterLoader().startInitialization(applicationContext, settings)
        engines = FlutterEngineGroup(this)
    }
}
