package com.example.quizapp

object  Constants{

    fun getQuestions(): ArrayList<Question>{
        val questionslist = ArrayList<Question>()

        val que1 = Question(
                1,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_argentina,
                "Argentina",
                "Austria",
                "Armenia",
                "Bangladesh",
                1
                )
        questionslist.add(que1)

        val que2 = Question(
                2,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_australia,
                "Argentina",
                "Austria",
                "Australia",
                "Bangladesh",
                3
        )
        questionslist.add(que2)


        val que3 = Question(
                3,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_belgium,
                "Argentina",
                "Belgium",
                "Chine",
                "Japan",
                2
        )
        questionslist.add(que3)


        val que4 = Question(
                4,
                "What country does this flag belong to?",
                R.drawable.ic_flag_of_brazil,
                "Argentina",
                "Belgium",
                "Brazil",
                "Japan",
                3
        )
        questionslist.add(que4)


        return questionslist
    }

}