package com.example.plombier

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logo.startAnimation(AnimationUtils.loadAnimation(this,R.anim.splash_in))
        Handler().postDelayed({
            logo.startAnimation(AnimationUtils.loadAnimation(this,R.anim.splach_out))
            Handler().postDelayed({
                logo.visibility = View.GONE
                startActivity(Intent(this, Dashboard::class.java))
                finish()
            },500)
        },1500)

        /*add.setOnClickListener{
            val dir = getFilesDir().toString()
            val JSON_FILE = dir + "/plombiers.json"
            var nom = name.text.toString()
            var typeI = type.text.toString()
            var date = Date()
            var intervention = Intervention(1,date,nom,typeI)
            var gson = Gson()
            var jsonString:String = gson.toJson(intervention)
            val file= File(JSON_FILE)
            val fileOutputStream = FileOutputStream(file)
            fileOutputStream.write(jsonString.toByteArray())
            fileOutputStream.flush()
            fileOutputStream.close()


            val bufferedReader: BufferedReader = File(JSON_FILE).bufferedReader()
            val inputString = bufferedReader.use { it.readText() }
            var post = gson.fromJson(inputString, Intervention::class.java)
            i.text = post.plombier +"  "+ post.type
        }
*/

    }
}


