package mobarak.cou.cse.com.messageshareapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class SecondActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val m=intent.extras["name"]
        Toast.makeText(this,"welcome "+m+" to the second activity",Toast.LENGTH_LONG).show()
    }

}