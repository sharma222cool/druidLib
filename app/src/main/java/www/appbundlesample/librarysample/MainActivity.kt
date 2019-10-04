package www.appbundlesample.librarysample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import www.appbundlesample.article.ArticleActivity
import www.appbundlesample.core.LibFile

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val libFile = LibFile()
        libFile.display(this)

        val intent = Intent(this, ArticleActivity::class.java)
        startActivity(intent)
    }
}
