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

        val myData = MyData("Mohit Sharma")
        Toast.makeText(this, "Article activity $myString ${myData.name}", Toast.LENGTH_LONG).show()
    }
}