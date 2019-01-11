package appdesign.example.com.appdesign

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.widget.ImageView
import appdesign.example.com.appdesign.settings.SettingsActivity

class DashboardActivity : AppCompatActivity() {

    private val CLICKABLES = intArrayOf(R.id.play_button, R.id.wallet_button, R.id.achievements_button, R.id.leaderboard_button,
            R.id.settings_button, R.id.logout_button)

    private lateinit var settings : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)




        for (id in CLICKABLES){
            findViewById<CardView>(id).setOnClickListener{ v->
                when(v.id){
                    R.id.play_button ->{
                        val intent = Intent(this, PlayActivity::class.java)
                        startActivity(intent)
                    }
                    R.id.logout_button ->{

                    }
                    R.id.wallet_button ->{
                        val intent = Intent(this, WalletActivity::class.java)
                        startActivity(intent)
                    }
                    R.id.achievements_button ->{

                    }
                    R.id.leaderboard_button ->{

                    }
                    R.id.settings_button ->{
                        val intent = Intent(this, SettingsActivity::class.java)
                        startActivity(intent)
                    }
                }


            }
        }
    }

}
