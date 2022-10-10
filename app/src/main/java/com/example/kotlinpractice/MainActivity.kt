package com.example.kotlinpractice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display.Mode
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    lateinit var btn : Button
    lateinit var recylerview :RecyclerView
    lateinit var list : MutableList<Model>

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //hemal ramani @mr_ramani7
        btn = findViewById(R.id.button)
        recylerview = findViewById(R.id.recylerview)
        list = ArrayList<Model>() as MutableList<Model>




            list.add(Model("Jatin"))
            list.add(Model("Hemal"))
            list.add(Model("Navdeep"))
            list.add(Model("Trushil"))
            list.add(Model("Hemang"))

       var rc: RecyclerView.LayoutManager = LinearLayoutManager(this)
        recylerview.layoutManager = rc

        val adapter = MyAdapter(applicationContext,list)

        recylerview.adapter = adapter
        //var model = Model("Hemal")

        btn.setOnClickListener {

            Toast.makeText(this,"OKAY",Toast.LENGTH_LONG).show()

        }
    }
}