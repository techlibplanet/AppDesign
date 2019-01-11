package appdesign.example.com.appdesign.profile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.widget.ImageButton
import appdesign.example.com.appdesign.R
import org.jetbrains.anko.toast

class ProfileActivity : AppCompatActivity() {

    private lateinit var toolBar: Toolbar
    private lateinit var editProfileImage : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        editProfileImage = findViewById(R.id.editProfileImage)

        editProfileImage.setOnClickListener {
            toast("Edit profile clicked")
        }

        toolBar = findViewById(R.id.toolbar)
        setSupportActionBar(toolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
