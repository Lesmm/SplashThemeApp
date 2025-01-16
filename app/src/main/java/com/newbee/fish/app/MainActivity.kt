package com.newbee.fish.app

import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import ccom.tencent.qqmusic.R

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // sleep 5s to simulate the time-consuming initialization, let the splash screen show longer
        try {
            Thread.sleep(5000)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        findViewById<TextView>(R.id.sample_text).text = stringFromJNI()
    }

    /**
     * A native method that is implemented by the 'app' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'app' library on application startup.
        init {
            System.loadLibrary("app")
        }
    }
}