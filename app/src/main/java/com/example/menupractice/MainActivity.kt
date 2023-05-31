package com.example.menupractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var selectedoption=""
         when(item?.itemId){
             R.id.about_us -> selectedoption ="about us"
             R.id.Help -> selectedoption ="Help"
             R.id.Item_1 -> selectedoption ="Item 1"
             R.id.Item_2 -> selectedoption ="Item_2"
             R.id.Item_3 -> selectedoption ="Item_3"
         }
        Toast.makeText(this,"option:"+selectedoption,Toast.LENGTH_SHORT).show()
        return super.onOptionsItemSelected(item)
    }
}