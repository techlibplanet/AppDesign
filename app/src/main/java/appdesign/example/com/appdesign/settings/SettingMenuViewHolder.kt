package com.example.mayank.kwizzapp.settings.menusettings

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import appdesign.example.com.appdesign.R
import appdesign.example.com.appdesign.policies.PoliciesActivity
import appdesign.example.com.appdesign.profile.ProfileActivity
import appdesign.example.com.appdesign.settings.SettingVm

class SettingMenuViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {

    fun bindView(context: Context, settingMenuVm: SettingVm.SettingMenuVm, position: Int){
        val textTitle = itemView.findViewById<TextView>(R.id.setting_header_name)
        val imageIcon = itemView.findViewById<ImageView>(R.id.setting_icon)

        textTitle.text = settingMenuVm.title
        imageIcon.setImageResource(settingMenuVm.imageSource)

        itemView.setOnClickListener{
            when(position){
                0 ->{
                    toast(context, "Profile Clicked")
                    val intent = Intent(context, ProfileActivity::class.java)
                    context.startActivity(intent)
                }
                1 ->{
                    toast(context, "Policies Clicked")
                    val intent = Intent(context, PoliciesActivity::class.java)
                    context.startActivity(intent)
                }
                2 ->{

                }
            }
        }
    }

    private fun toast(context: Context, message : String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}