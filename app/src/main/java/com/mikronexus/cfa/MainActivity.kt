package com.mikronexus.cfa

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val packageNameTextView = findViewById<TextView>(R.id.pakage_name)
        val packageName = packageName
        packageNameTextView.text = packageName

        val proceedBtn = findViewById<MaterialButton>(R.id.proceedButton)
        proceedBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("app2://open"))
            startActivity(intent)
        }
    }
}