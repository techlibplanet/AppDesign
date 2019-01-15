package appdesign.example.com.appdesign.result.quizResultAdapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import appdesign.example.com.appdesign.R

class QuizResultAdapter: RecyclerView.Adapter<QuizResultViewHolder>() {
    var items: List<QuizResultModel> = emptyList()
    lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizResultViewHolder {
        context = parent.context
        val v = LayoutInflater.from(context).inflate(R.layout.quiz_result_row, parent, false)
        return QuizResultViewHolder(v)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: QuizResultViewHolder, position: Int) {
        holder.bindView(context,items[position])
    }
}