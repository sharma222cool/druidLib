package www.appbundlesample.core

import android.content.Context
import android.util.Log
import android.widget.Toast

/**
 * @author mohit.sharma
 */
class LibFile {
    fun display(context: Context) {
        Log.d("okhttp", "Jitpack Library ${BuildConfig.BUILD_TYPE}")

        Toast.makeText(context, R.string.core_app_name, Toast.LENGTH_LONG).show()
    }
}