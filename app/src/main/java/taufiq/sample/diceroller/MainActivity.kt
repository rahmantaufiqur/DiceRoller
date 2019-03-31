package taufiq.sample.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceimage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButton: Button =findViewById(R.id.button_roll)
        rollButton.setOnClickListener {
           rolldice()    }
        diceimage=findViewById(R.id.imageviewRoll)
    }

    private fun rolldice() {
        var randomInt=Random.nextInt(6)+1
        var drawable=when(randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceimage.setImageResource(drawable)

    }
}
