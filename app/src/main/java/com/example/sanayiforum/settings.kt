package com.example.sanayiforum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        supportActionBar?.setTitle("Ayarlar")
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
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