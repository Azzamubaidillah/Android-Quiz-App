package com.example.quizapp

object  Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTION: String = "total_question"
    const val CORRECT_ANSWER: String = "correct_answer"

    fun getQuestions(): ArrayList<Question>{
        val questionslist = ArrayList<Question>()

        val que1 = Question(
                1,
                "What this word mean?",
                R.drawable.nomor1,
                "What",
                "Who",
                "Where",
                "Why",
                4
                )
        questionslist.add(que1)

        val que2 = Question(
                2,
                "What this word mean?",
                R.drawable.nomor2,
                "Sasa",
                "Kasa",
                "Mikasa",
                "Janeta",
                2
        )
        questionslist.add(que2)


        val que3 = Question(
                3,
                "What this word mean?",
                R.drawable.nomor3,
                "Kadomatsu",
                "Kadokadoan",
                "Obento",
                "Naruto",
                1
        )
        questionslist.add(que3)


        val que4 = Question(
                4,
                "What this word mean?",
                R.drawable.nomor4,
                "Inu",
                "Neko",
                "Nezumi",
                "Tora",
                1
        )
        questionslist.add(que4)

        val que5 = Question(
                5,
                "What this word mean?",
                R.drawable.nomor5,
                "Chicken",
                "Goat",
                "Cow",
                "Pig",
                3
        )
        questionslist.add(que5)

        val que6 = Question(
                6,
                "What this word mean?",
                R.drawable.nomor6,
                "School",
                "Ibaraki",
                "Kindergarten",
                "College",
                4
        )
        questionslist.add(que6)

        val que7 = Question(
                7,
                "What this word mean?",
                R.drawable.nomor7,
                "Tomodachi",
                "Kazoku",
                "Teki",
                "Sensei",
                1
        )
        questionslist.add(que7)

        val que8 = Question(
                8,
                "What this sentence mean?",
                R.drawable.nomor8,
                "Tanjoubi Omedetou",
                "Arigatou Gozaimasu",
                "Watashi ga saisho ni ikimasu",
                "Anata no subarashi",
                4
        )
        questionslist.add(que8)

        val que9 = Question(
                9,
                "What this sentence mean?",
                R.drawable.nomor9,
                "Kenkōde shiawase o otaku",
                "Kenkōde shiawase o tamotsu",
                "Kenkōde kanashi o otaku",
                "Kenkōde kanashi o tamotsu",
                2
        )
        questionslist.add(que9)

        val que10 = Question(
                10,
                "Apakah orang di foto ini ganteng??",
                R.drawable.nomor10,
                "Benar",
                "Right",
                "Tadashi",
                "Semua benar",
                4
        )
        questionslist.add(que10)


        return questionslist
    }

}