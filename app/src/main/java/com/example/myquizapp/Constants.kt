package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUSTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )

        questionsList.add(que1)

        val que2 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Austrialia",
            "Armenia",
            "Austria",
            2
        )

        questionsList.add(que2)

        val que3 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina",
            "Austrialia",
            "Belgium",
            "Austria",
            3
        )

        questionsList.add(que3)

        val que4 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina",
            "Belgium",
            "Armenia",
            "Brazil",
            4
        )

        questionsList.add(que4)

        val que5 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina",
            "Denmark",
            "Armenia",
            "Austria",
            2
        )

        questionsList.add(que5)

        val que6 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Argentina",
            "Austrialia",
            "Fiji",
            "Austria",
            3
        )

        questionsList.add(que6)

        val que7 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany",
            "Belgium",
            "Armenia",
            "Fiji",
            1
        )

        questionsList.add(que7)

        val que8 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Argentina",
            "India",
            "Belgium",
            "Austria",
            2
        )

        questionsList.add(que8)

        val que9 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "new_zealand",
            "Austrialia",
            "Armenia",
            "Austria",
            1
        )

        questionsList.add(que9)


        return questionsList
    }
}