package com.example.sanayiforum

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar?.setTitle("Profil")
    }

    fun editprofile(v: View?){
        val dialogBuilder = AlertDialog.Builder(this)

        // set message of alert dialog
        dialogBuilder.setMessage("Profil Fotoğrafını Değiştirmek İstiyor Musunuz?")
                // if the dialog is cancelable
                .setCancelable(false)
                // positive button text and action
                .setPositiveButton("Değiştir", DialogInterface.OnClickListener {
                    dialog, id ->
                    Toast.makeText(this,"Profil Fotoğrafı Değiştildi",Toast.LENGTH_SHORT).show()
                })
                // negative button text and action
                .setNegativeButton("Vazgeç", DialogInterface.OnClickListener {
                    dialog, id ->
                    Toast.makeText(this,"Profil Fotoğrafı Değiştilimekten Vazgeçildi",Toast.LENGTH_SHORT).show()
                })

        // create dialog box
        val alert = dialogBuilder.create()
        // set title for alert dialog box
        alert.setTitle("AlertDialogExample")
        // show alert dialog
        alert.show()
    }


    fun edituser(v: View?){
        val dialogBuilder = AlertDialog.Builder(this)

        // set message of alert dialog
        dialogBuilder.setMessage("Bilgileri Değiştirmek İstiyor Musunuz?")
                // if the dialog is cancelable
                .setCancelable(false)
                // positive button text and action
                .setPositiveButton("Değiştir", DialogInterface.OnClickListener {
                    dialog, id ->
                    Toast.makeText(this,"Bilgiler Değiştirildi",Toast.LENGTH_SHORT).show()
                    Toast.makeText(this,"Değiştirilen İl-İlçe Bazında Filtreleme Yapıldı",Toast.LENGTH_SHORT).show()
                })
                // negative button text and action
                .setNegativeButton("Vazgeç", DialogInterface.OnClickListener {
                    dialog, id ->
                    Toast.makeText(this,"Bilgiler Değiştilimekten Vazgeçildi",Toast.LENGTH_SHORT).show()
                })

        // create dialog box
        val alert = dialogBuilder.create()
        // set title for alert dialog box
        alert.setTitle("AlertDialogExample")
        // show alert dialog
        alert.show()
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