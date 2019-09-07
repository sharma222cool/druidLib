package www.appbundlesample.article

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * @author mohit.sharma
 */
class ArticleActivity : AppCompatActivity() {

    val myString = "My String variable"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Article activity $myString ${BuildConfig.BUILD_TYPE}", Toast.LENGTH_LONG).show()
    }
}