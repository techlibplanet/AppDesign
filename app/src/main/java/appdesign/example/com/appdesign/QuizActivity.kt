package appdesign.example.com.appdesign

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.support.v7.widget.Toolbar
import org.jetbrains.anko.startActivity

class QuizActivity : AppCompatActivity() {

    private lateinit var toolBar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        toolBar = findViewById(R.id.toolbar)
        setSupportActionBar(toolBar)

        findViewById<CardView>(R.id.option_a).setOnClickListener{
            startActivity<ResultScreen>()
        }
    }
}
