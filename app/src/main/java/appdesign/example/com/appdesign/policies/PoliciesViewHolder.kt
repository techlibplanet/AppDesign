package com.example.mayank.kwizzapp.policies

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import appdesign.example.com.appdesign.R

class PoliciesViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    fun bindView(context: Context, policiesVm: PoliciesVm, position: Int){
        val textLabel = itemView.findViewById<TextView>(R.id.policies_label)
        val imageIcon = itemView.findViewById<ImageView>(R.id.policies_icon)

        textLabel.text = policiesVm.textLabel
        imageIcon.setImageResource(policiesVm.policiesIcon)

        itemView.setOnClickListener{
            when(position){
                0 ->{
                    toast(context,"Coming soon...")
                }
                1 ->{
                    toast(context,"Coming soon...")
                }
                2 ->{
                    toast(context,"Coming soon...")
                }
                3 ->{
                    toast(context,"Coming soon...")
                }
            }
        }
    }

    private fun toast(context: Context, message : String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}