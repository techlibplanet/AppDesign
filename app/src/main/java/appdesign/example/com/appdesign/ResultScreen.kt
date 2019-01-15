package appdesign.example.com.appdesign

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import appdesign.example.com.appdesign.result.quizResultAdapter.QuizResultAdapter
import appdesign.example.com.appdesign.result.quizResultAdapter.QuizResultModel

class ResultScreen : AppCompatActivity() {

    private lateinit var quizResultRecyclerView: RecyclerView
    val adapterQuizResult: QuizResultAdapter by lazy { QuizResultAdapter() }
    private var modelListQuesResult= mutableListOf<QuizResultModel>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_screen)

        quizResultRecyclerView = findViewById(R.id.quiz_result_recycler_view)

        quizResultRecyclerView.layoutManager = LinearLayoutManager(this)
        quizResultRecyclerView.setHasFixedSize(true)
        quizResultRecyclerView.addItemDecoration(DividerItemDecoration(this, 0))
        quizResultRecyclerView.adapter = adapterQuizResult

        setQuizResultItem()

    }


    private fun setQuizResultItem() {
        modelListQuesResult.clear()

        for (i in 1..10){
            val quizResultModel = QuizResultModel()
            quizResultModel.playerName = "Mayank Sharma"
            quizResultModel.dropQuestion = 2
            quizResultModel.falseQuestion = 5
            quizResultModel.trueQuestion = 3
            quizResultModel.totalQuestion = 10
//            quizResultModel.bidPoints = 10
//            quizResultModel.loosePoints = 0
//            quizResultModel.winPoints = 16
//            quizResultModel.totalPoints = 2016
            modelListQuesResult.add(quizResultModel)
        }
        setQuizResultRecyclerViewAdapter(modelListQuesResult)
    }

    private fun setQuizResultRecyclerViewAdapter(list: List<QuizResultModel>) {
        adapterQuizResult.items = list
        adapterQuizResult.notifyDataSetChanged()


    }
}
