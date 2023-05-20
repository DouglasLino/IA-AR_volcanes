
package org.volcan

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.volcan.databinding.ActivityMainBinding

// Punto de entrada de la app, el funcionamiento se realiza en los fragments
class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
    }

    override fun onBackPressed() {
        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.Q) {
            finishAfterTransition()
        } else {
            super.onBackPressed()
        }
    }
}
