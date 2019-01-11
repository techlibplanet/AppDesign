package appdesign.example.com.appdesign.policies

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import appdesign.example.com.appdesign.R
import com.example.mayank.kwizzapp.policies.PoliciesAdapter
import com.example.mayank.kwizzapp.policies.PoliciesVm

class PoliciesActivity : AppCompatActivity() {

    private lateinit var toolBar: Toolbar

    private lateinit var recyclerView: RecyclerView
    val adapter: PoliciesAdapter by lazy { PoliciesAdapter() }
    lateinit var modelList: MutableList<PoliciesVm>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_policies)

        toolBar = findViewById(R.id.toolbar)
        setSupportActionBar(toolBar)

        recyclerView = findViewById(R.id.policies_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.addItemDecoration(DividerItemDecoration(this,0))
        recyclerView.adapter = adapter
        modelList = mutableListOf<PoliciesVm>()
        setPoliciesItem()
    }

    private fun setPoliciesItem() {
        modelList.clear()
        modelList.add(PoliciesVm(R.drawable.ic_about, "About KwizzApp"))
        modelList.add(PoliciesVm(R.drawable.ic_privacy_policy, "Privacy Policy"))
        modelList.add(PoliciesVm(R.drawable.ic_terms_n_condition, "Terms & Conditions"))
        modelList.add(PoliciesVm(R.drawable.ic_open_source, "Open Source Licenses"))
        setRecyclerViewAdapter(modelList)
    }

    private fun setRecyclerViewAdapter(list: List<PoliciesVm>) {
        adapter.items = list
        adapter.notifyDataSetChanged()
    }
}
