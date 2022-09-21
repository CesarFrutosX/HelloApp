package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener, View.OnClickListener {
    private lateinit var textView:EditText
    private lateinit var btn:Button
    var tts:TextToSpeech? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.editText)
        btn = findViewById(R.id.btnPlay)
        var message = textView.text.toString();
        Log.i("message",message)
        tts = TextToSpeech(applicationContext,this)
        btn.setOnClickListener(this)

    }

    fun speak(){
        var message: String = textView.text.toString()
        if (message.isEmpty()){
            tts!!.speak("Texto vacío, interrogante ? ¿ ? ",TextToSpeech.QUEUE_FLUSH,null,"")
        }
        else{
            tts!!.speak(message,TextToSpeech.QUEUE_FLUSH,null,"")
        }
    }
    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS){
            /*
            textView.text = "Listo!"
            */
            tts!!.language = (Locale("ES"))
        }
        else{
            /*
            textView.text = "No disponible!"
            */

        }
    }

    override fun onClick(view: View?) {
        if (view!!.equals(btn)){
            speak()

        }
    }

    override fun onDestroy() {
        if (tts != null) {
            tts!!.stop()
            tts!!.shutdown()
        }
        super.onDestroy()
    }
}