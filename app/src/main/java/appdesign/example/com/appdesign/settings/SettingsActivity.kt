package appdesign.example.com.appdesign.settings

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import appdesign.example.com.appdesign.R
import com.example.mayank.kwizzapp.settings.menusettings.SettingMenuAdapter

class SettingsActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    val adapter: SettingMenuAdapter by lazy { SettingMenuAdapter() }
    lateinit var modelList: MutableList<SettingVm.SettingMenuVm>
    private lateinit var toolBar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        toolBar = findViewById(R.id.toolbar)
        setSupportActionBar(toolBar)

        recyclerView = findViewById(R.id.menu_setting_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
        recyclerView.adapter = adapter
        modelList = mutableListOf<SettingVm.SettingMenuVm>()
        setSettingsItem()
    }

    private fun setSettingsItem() {
        modelList.clear()
        modelList.add(SettingVm.SettingMenuVm(R.drawable.ic_profile, "Profile"))
        modelList.add(SettingVm.SettingMenuVm(R.drawable.ic_policies, "Policies"))
        setRecyclerViewAdapter(modelList)
    }


    private fun setRecyclerViewAdapter(list: List<SettingVm.SettingMenuVm>) {
        adapter.items = list
        adapter.notifyDataSetChanged()
    }
}
