package appdesign.example.com.appdesign

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.CardView
import android.view.View
import org.jetbrains.anko.startActivity

class PlayActivity : AppCompatActivity(), View.OnClickListener {


    private val CLICKABLES = intArrayOf(R.id.single_player, R.id.quick_play, R.id.multiplayer, R.id.invitations)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        for (id in CLICKABLES){
            findViewById<CardView>(id).setOnClickListener(this)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.single_player ->{
                startActivity<MultiplayerQuizMenu>()
            }
            R.id.multiplayer ->{
                startActivity<MultiplayerQuizMenu>()
            }
            R.id.quick_play ->{
                startActivity<MultiplayerQuizMenu>()
            }
            R.id.invitations ->{
                startActivity<MultiplayerQuizMenu>()
            }
        }
    }
}
