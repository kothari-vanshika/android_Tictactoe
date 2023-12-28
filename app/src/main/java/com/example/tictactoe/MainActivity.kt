package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import android.graphics.Color
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var turnX=true
    private var f=9
    private var flag=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1:Button=findViewById(R.id.button1)
        val button2:Button=findViewById(R.id.button2)
        val button3:Button=findViewById(R.id.button3)
        val button4:Button=findViewById(R.id.button4)
        val button5:Button=findViewById(R.id.button5)
        val button6:Button=findViewById(R.id.button6)
        val button7:Button=findViewById(R.id.button7)
        val button8:Button=findViewById(R.id.button8)
        val button9:Button=findViewById(R.id.button9)
        val button10:Button=findViewById(R.id.button10)
        val buttons=arrayOf(button1,button2,button3,button4,button5,button6,button7,button8,button9)
        for (i in buttons) {
            i.setOnClickListener {
                if (turnX) {
                    i.text = "X"
                    f--
                    i.setTextColor(Color.parseColor("#1134A6"))
                    turnX = false
                } else {
                    i.text = "O"
                    f--
                    i.setTextColor(Color.parseColor("#532915"))
                    turnX = true
                }
                i.setEnabled(false)
                checkwinner()
                if (f == 0 && flag == 0)
                    Toast.makeText(applicationContext, "It's a draw", Toast.LENGTH_SHORT).show()

            }
        }
        button10.setOnClickListener {
            newgame()
        }
    }
      private fun checkwinner()
    {
       val array= arrayOf(
           arrayOf(0,1,2),
           arrayOf(3,4,5),
           arrayOf(6,7,8),
           arrayOf(0,3,6),
           arrayOf(1,4,7),
           arrayOf(2,5,8),
           arrayOf(0,4,8),
           arrayOf(2,4,6),
           )
        val button1:Button=findViewById(R.id.button1)
        val button2:Button=findViewById(R.id.button2)
        val button3:Button=findViewById(R.id.button3)
        val button4:Button=findViewById(R.id.button4)
        val button5:Button=findViewById(R.id.button5)
        val button6:Button=findViewById(R.id.button6)
        val button7:Button=findViewById(R.id.button7)
        val button8:Button=findViewById(R.id.button8)
        val button9:Button=findViewById(R.id.button9)
        val buttons=arrayOf(button1,button2,button3,button4,button5,button6,button7,button8,button9)
       for(i in array) {
           val pos1:String="${buttons[i[0]].text}"
           val pos2:String="${buttons[i[1]].text}"
           val pos3:String="${buttons[i[2]].text}"
           if(pos1!="" && pos2!="" && pos3!="") {
               if (pos1 == pos2 && pos2 == pos3) {
                   show_winner(pos1)
                   flag = 1
               }
           }

       }
    }
    private fun disabled(){
        val button1:Button=findViewById(R.id.button1)
        val button2:Button=findViewById(R.id.button2)
        val button3:Button=findViewById(R.id.button3)
        val button4:Button=findViewById(R.id.button4)
        val button5:Button=findViewById(R.id.button5)
        val button6:Button=findViewById(R.id.button6)
        val button7:Button=findViewById(R.id.button7)
        val button8:Button=findViewById(R.id.button8)
        val button9:Button=findViewById(R.id.button9)
        val buttons=arrayOf(button1,button2,button3,button4,button5,button6,button7,button8,button9)
        for(button in buttons)
        {
            button.setEnabled(false)
        }
    }
    private fun enable(){
        val button1:Button=findViewById(R.id.button1)
        val button2:Button=findViewById(R.id.button2)
        val button3:Button=findViewById(R.id.button3)
        val button4:Button=findViewById(R.id.button4)
        val button5:Button=findViewById(R.id.button5)
        val button6:Button=findViewById(R.id.button6)
        val button7:Button=findViewById(R.id.button7)
        val button8:Button=findViewById(R.id.button8)
        val button9:Button=findViewById(R.id.button9)
        val buttons=arrayOf(button1,button2,button3,button4,button5,button6,button7,button8,button9)
        for(button in buttons)
        {
            button.setEnabled(true)
            button.text=""
        }
    }
private fun newgame(){
     turnX=true;
    enable()
}
    private fun show_winner(s:String)
    {
     Toast.makeText(applicationContext,"Congratulations!Winner is ${s}",Toast.LENGTH_SHORT).show()
        disabled()

    }
    }
