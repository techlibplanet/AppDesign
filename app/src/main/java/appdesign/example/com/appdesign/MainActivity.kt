package appdesign.example.com.appdesign

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.shobhitpuri.custombuttons.GoogleSignInButton

class MainActivity : AppCompatActivity() {

    private lateinit var signInButton : GoogleSignInButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signInButton = findViewById(R.id.signInButton)

        signInButton.setOnClickListener{
            val intent = Intent(this, UserInfoActivity::class.java)
            startActivity(intent)
        }

    }
}
