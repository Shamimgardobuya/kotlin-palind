package dev.shamy.palindromeactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ActionActivity : AppCompatActivity() {
    lateinit var etWord1:EditText
    lateinit var etWord2:EditText               //declare variable
    lateinit var btnAnswer:Button
    lateinit var tvAnswer:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action)
        etWord1=findViewById(R.id.etWord1)      //find it
        etWord2=findViewById(R.id.etWord2)
        btnAnswer=findViewById(R.id.btnAnswer)
        tvAnswer=findViewById(R.id.tvAnswer)

         btnAnswer.setOnClickListener {
             comparing()
         }
        tvAnswer.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
    fun comparing(){
        var word=etWord1.text.toString()     //for the text   .to String   c
        var word2=etWord2.text.toString()   //create variable for input
        var ans=tvAnswer                      //we dodnt even need to create variable
        if (word.first()==word2.last() && word.length==word2.length){   //create condition to check 1st and last character
                                                                        //combine condition with the lenghs which are to be equal
            ans.text="Yay you have found palindrome"                  //display answer in text view
        }
        else{
            ans.text="try again"   //for answer to show in text view
        }
    }
}