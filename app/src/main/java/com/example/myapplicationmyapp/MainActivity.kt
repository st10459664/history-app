package com.example.myapplicationmyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button2 = findViewById<Button>(R.id.button2)
        val edittext2 = findViewById<TextView>(R.id.edittext2)
        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val textview2 = findViewById<TextView>(R.id.textView2)

        textview2.text = "Welcome to the Age Configuration"           // code for app when it runs
        textView.text = ""                                   //^

        button?.setOnClickListener {                //code for clear button
            textView.text = ""
            edittext2.text = ""
        }

        button?.setOnClickListener {                      //code for clear button

            if (edittext2.text.toString()
                    .toInt() <= 20
            ) {   // code to determine what message will display
                textView.text =
                    " There are not historical figures in the 20's year old range try again"

            } else {
                if (edittext2.text.toString().toInt() <= 56) {
                    textView.text =
                        "Adolf Hitler., born on april 20 1889, chancellor and dictator of Nazi Germany from 1933 to 1945" +
                                ", commited suicide via a gunshot to the head on april 30 1945"

                } else {
                    if (35 >= edittext2.text.toString().toInt()) {
                        textView.text =
                            "Vincent Willem van Gogh was a Dutch Post-Impressionist painter who is among the most famous and influential" +
                                    " figures in the history of Western art. In just over a decade" +
                                    ", he created approximately 2100 artworks, including around 860 oil paintings, most of them in the last two years of his life"

                    }
                    if (40 >= edittext2.text.toString().toInt()) {
                        textView.text = "Beyoncé Giselle Knowles-Carter is an American singer," +
                                " rapper, songwriter, record producer, actress, and businesswoman."

                    } else {
                        if (50 >= edittext2.text.toString().toInt()) {
                            textView.text =
                                "William Shakespeare (between 26 April 1564 and 23 April 1564 – 23 April 1616)" +
                                        " was an English dramatist, poet, and theatre actor. He wrote plays such as Hamlet and Romeo and Juliet"


                        } else {
                            if (55 >= edittext2.text.toString().toInt()) {
                                textView.text =
                                    "Abraham Lincoln was an American lawyer, politician, and statesman, who served as the 16th" +
                                            " president of the United States, from 1861 until his assassination in 1865."

                            }
                            if (60 >= edittext2.text.toString().toInt()) {
                                textView.text =
                                    "Timothy Donald Cook is an American business executive who has been the chief" +
                                            " executive officer of Apple Inc. Cook had previously been the company's chief operating " +
                                            "officer under its co-founder Steve Jobs."
                            } else {
                                if (65 >= edittext2.text.toString().toInt()) {
                                    textView.text =
                                        "Leonardo di ser Piero da Vinci was an Italian polymath of the High Renaissance who was active as a painter," +
                                                " draughtsman, engineer, scientist, theorist, sculptor, and architect"

                                } else {
                                    if (70 >= edittext2.text.toString().toInt()) {
                                        textView.text =
                                            "Albert Einstein was a German-born theoretical physicist who is widely" +
                                                    " held to be one of the greatest and most influential scientists of all time."
                                    } else {
                                        if (80 >= edittext2.text.toString().toInt()) {
                                            textView.text =
                                                "Carlos Ray \"Chuck\" Norris is an American martial artist and actor." +
                                                        " He is a black belt in Tang Soo Do, Brazilian jiu jitsu and judo. After serving" +
                                                        " in the United States Air Force, Norris won many martial arts championships and later" +
                                                        " founded his own discipline, Chun Kuk Do."
                                        } else {
                                            if (95 == edittext2.text.toString().toInt()) {

                                                textView.text =
                                                    "Nelson Mandela was a South African anti-apartheid activist," +
                                                            " politician, and statesman who served as the first president of South Africa from 1994 to 1999." +
                                                            " He was the country's first black head of state and the first elected in a fully representative " +
                                                            "democratic election."


                                            } else {
                                                if (100 >= edittext2.text.toString().toInt()) {
                                                    textView.text =
                                                        "number out of age range enter a different number"
                                                }                                       // will display if out of range
                                            }
                                        }

                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
    }}