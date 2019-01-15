package appdesign.example.com.appdesign.result.quizResultAdapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import appdesign.example.com.appdesign.R
import kotlinx.android.synthetic.main.quiz_result_row.view.*

class QuizResultViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindView(context : Context, quizResultModel: QuizResultModel){

        val playerName = itemView.findViewById<TextView>(R.id.player_name)
        val totalQues = itemView.findViewById<TextView>(R.id.total_questions)
        val dropQues = itemView.findViewById<TextView>(R.id.drop_questions)
        val falseQues = itemView.findViewById<TextView>(R.id.false_questions)
        val trueQues = itemView.findViewById<TextView>(R.id.true_questions)
//        val totalPoints = itemView.findViewById<TextView>(R.id.total_points)
//        val bidPoints = itemView.findViewById<TextView>(R.id.bid_points)
//        val loosePoints = itemView.findViewById<TextView>(R.id.loose_points)
//        val winPoints = itemView.findViewById<TextView>(R.id.win_points)
        val playerImage = itemView.findViewById<ImageView>(R.id.player_image)

        playerName.text = quizResultModel.playerName
        totalQues.text = quizResultModel.totalQuestion.toString()
        dropQues.text = quizResultModel.dropQuestion.toString()
        falseQues.text = quizResultModel.falseQuestion.toString()
        trueQues.text = quizResultModel.trueQuestion.toString()
//        totalPoints.text = quizResultModel.totalPoints.toString()
//        bidPoints.text = quizResultModel.bidPoints.toString()
//        loosePoints.text = quizResultModel.loosePoints.toString()
//        winPoints.text = quizResultModel.winPoints.toString()
        playerImage.setImageURI(quizResultModel.playerImage)
    }
}