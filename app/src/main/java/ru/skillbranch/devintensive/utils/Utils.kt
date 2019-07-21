package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?>{
        //TODO FIX ME
        val parts : List<String>? = fullName?.split(" ")

        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return firstName to lastName
    }

    fun transliteration(payload: String, divider: String = " "): String {
        TODO("not implemented")
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        //TODO("not implemented")
        var initials: String? = ""
        if(firstName.isNullOrBlank() && lastName.isNullOrBlank()){
            initials  = null
        }else{
            initials += "${if(firstName.isNullOrBlank()) "" else firstName?.first()?.toUpperCase()}"
            initials += "${if(lastName.isNullOrBlank()) "" else lastName?.first()?.toUpperCase()}"
            //initials += lastName?.first()?.toUpperCase()
        }

        return initials
    }
}