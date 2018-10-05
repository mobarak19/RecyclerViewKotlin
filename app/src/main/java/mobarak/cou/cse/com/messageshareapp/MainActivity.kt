package mobarak.cou.cse.com.messageshareapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast.setOnClickListener {


            Toast.makeText(this,"Hello mobarak",Toast.LENGTH_LONG).show()


        }


        sendAcitivy.setOnClickListener {
            val message=edit_txt.text.toString()


            val intend=Intent(this,SecondActivity::class.java)
            intend.putExtra("mame",message)
            startActivity(intend)

        }
    }
}
