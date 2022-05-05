package com.segundods.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.segundods.affirmations.data.Datasource


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val textView: TextView = findViewById(R.id.affirmationssize)
        textView.text = Datasource().loadAffirmations().size.toString()

    }
}