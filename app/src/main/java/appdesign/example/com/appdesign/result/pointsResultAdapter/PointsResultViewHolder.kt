package appdesign.example.com.appdesign.result.pointsResultAdapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import appdesign.example.com.appdesign.R

class PointsResultViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindView(context : Context, pointsResultModel: PointsResultModel){

        val playerName = itemView.findViewById<TextView>(R.id.player_name)
        val totalPoints = itemView.findViewById<TextView>(R.id.total_points)
        val bidPoints = itemView.findViewById<TextView>(R.id.bid_points)
        val loosePoints = itemView.findViewById<TextView>(R.id.loose_points)
        val winPoints = itemView.findViewById<TextView>(R.id.win_points)
        val playerImage = itemView.findViewById<ImageView>(R.id.player_image)

        playerName.text = pointsResultModel.playerName
        totalPoints.text = pointsResultModel.totalPoints.toString()
        bidPoints.text = pointsResultModel.bidPoints.toString()
        loosePoints.text = pointsResultModel.loosePoints.toString()
        winPoints.text = pointsResultModel.winPoints.toString()
        playerImage.setImageURI(pointsResultModel.playerImage)
    }
}