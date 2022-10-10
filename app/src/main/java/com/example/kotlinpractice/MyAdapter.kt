package com.example.kotlinpractice

import android.content.Context
import android.content.Intent
import android.view.Display.Mode
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

 class MyAdapter(var context:Context, var list :  List<Model>) : RecyclerView.Adapter<MyAdapter.MyView>() {



    //    lateinit var list: List<Model>
//    lateinit var context: Context




    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyView, position: Int) {


        holder.txt1.setText(list.get(position).name)
        /*holder.txt1.setOnClickListener {

            Toast.makeText(context,""+position,Toast.LENGTH_LONG).show()

        }*/

        holder.itemView.setOnClickListener(View.OnClickListener {

                /*var intent  = Intent(context,MainActivity2::class.java)
                context.startActivity(intent)*/
            Toast.makeText(context,""+position,Toast.LENGTH_LONG).show()


        })





    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {
        var layoutInflater=LayoutInflater.from(context)
        var view : View = layoutInflater.inflate(R.layout.design,parent,false)

        return MyView(view)
    }


    inner class MyView(itemView: View) :RecyclerView.ViewHolder(itemView)
    {
        var txt1 = itemView.findViewById<TextView>(R.id.textView)

    }


}