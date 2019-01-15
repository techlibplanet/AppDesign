package appdesign.example.com.appdesign

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.jetbrains.anko.startActivity

class MultiplayerQuizMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplayer_quiz_menu)

        findViewById<Button>(R.id.leave_room).setOnClickListener{
            startActivity<QuizActivity>()
        }
    }
}
