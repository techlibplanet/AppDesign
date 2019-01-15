package appdesign.example.com.appdesign.result.pointsResultAdapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import appdesign.example.com.appdesign.R

class PointsResultAdapter: RecyclerView.Adapter<PointsResultViewHolder>() {
    var items: List<PointsResultModel> = emptyList()
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PointsResultViewHolder {
        context = parent.context
        val v = LayoutInflater.from(context).inflate(R.layout.points_result_row, parent, false)
        return PointsResultViewHolder(v)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: PointsResultViewHolder, position: Int) {
        holder.bindView(context,items[position])
    }
}