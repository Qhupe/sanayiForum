package com.example.sanayiforum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast

class blog_details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog_details)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var anasayfa = Intent(this, MainActivity::class.java)
        var prifle = Intent(this, profile::class.java)
        var settingspage = Intent(this,settings::class.java)
        when (item.itemId){
            R.id.homepage ->{
                startActivity(anasayfa)
                finish()
            }
            R.id.profile ->{
                this.finish()
                startActivity(prifle)
            }
            R.id.settings -> {
                this.finish()
                startActivity(settingspage)
            }
            R.id.newTitle ->{
                Toast.makeText(this,"Demo Sürümde Başlık Ekelenemez!", Toast.LENGTH_SHORT).show()
            }

            R.id.exit ->{
                Toast.makeText(this,"Çıkış Yapıldı", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}