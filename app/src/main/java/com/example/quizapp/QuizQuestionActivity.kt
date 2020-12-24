package com.example.quizapp

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuizQuestionActivity : AppCompatActivity(),View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        mQuestionList = Constants.getQuestions()

        setQuestion()
        findViewById<TextView>(R.id.tv_option_one).setOnClickListener(this)
        findViewById<TextView>(R.id.tv_option_two).setOnClickListener(this)
        findViewById<TextView>(R.id.tv_option_three).setOnClickListener(this)
        findViewById<TextView>(R.id.tv_option_four).setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option_one ->{
                selectedOptionView(findViewById(R.id.tv_option_one), 1)
            }
            R.id.tv_option_two ->{
                selectedOptionView(findViewById(R.id.tv_option_two), 2)
            }
            R.id.tv_option_three ->{
                selectedOptionView(findViewById(R.id.tv_option_three), 3)
            }
            R.id.tv_option_four ->{
                selectedOptionView(findViewById(R.id.tv_option_four), 4)
            }
        }


    }

    private fun setQuestion(){

        mCurrentPosition = 1
        val question = mQuestionList!!.get(mCurrentPosition-1)


        findViewById<ProgressBar>(R.id.progressBar).progress = mCurrentPosition
        findViewById<TextView>(R.id.tv_progress).text = "$mCurrentPosition" + "/" + findViewById<ProgressBar>(R.id.progressBar).max

        findViewById<TextView>(R.id.tv_question).text = question.question
        findViewById<ImageView>(R.id.iv_image).setImageResource(question.image)
        findViewById<TextView>(R.id.tv_option_one).text = question.optionOne
        findViewById<TextView>(R.id.tv_option_two).text = question.optionTwo
        findViewById<TextView>(R.id.tv_option_three).text = question.optionThree
        findViewById<TextView>(R.id.tv_option_four).text = question.optionFour

    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        defaultOptiosView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.typeface = Typeface.DEFAULT
        tv.background = ContextCompat.getDrawable(
                this@QuizQuestionActivity,
                R.drawable.selected_option_border_bg
        )
    }

    private fun defaultOptiosView(){
        val options = ArrayList<TextView>()
        options.add(0, findViewById(R.id.tv_option_one))
        options.add(1, findViewById(R.id.tv_option_two))
        options.add(2, findViewById(R.id.tv_option_three))
        options.add(3, findViewById(R.id.tv_option_four))

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                    this,
                    R.drawable.default_option_border_bg
            )
        }

    }





}