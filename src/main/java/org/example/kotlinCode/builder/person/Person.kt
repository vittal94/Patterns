package org.example.kotlinCode.builder.person

class Person private constructor(
    val fname: String,
    val sname: String,
    val gender:String,
    val phone: String?
) {
    var phoneCode: String? = null
        private set
    var date: String? = null
        private set
    var language: String? = null
        private set
    var accessCode: String? = null
        private set



    class Builder internal constructor(
        val fname: String,
        val sname: String,
        val gender:String,
        val phone: String?
    ) {
        private var personToBuild: Person? = null

        init {
            personToBuild = Person(fname,sname,gender, phone)
        }

        internal fun build(): Person? {
            val buildPerson = personToBuild
            return buildPerson
        }
        fun buildPhoneCode(code: String): Builder {
            personToBuild!!.phoneCode = code
            return this
        }

        fun buildLanguage(lang: String): Builder {
            personToBuild!!.language = lang
            return this
        }

        fun buildDate(date: String): Builder {
            personToBuild!!.date = date
            return this
        }

        fun buildAccessCode(code: String): Builder {
            personToBuild!!.accessCode = code
            return this
        }
    }

    override fun toString(): String {
        return "Person(fname='$fname', sname='$sname', gender='$gender', phone=$phone, phoneCode=$phoneCode, date=$date, language=$language, accessCode=$accessCode)"
    }
}

fun testPerson() {
    val person = Person.Builder("d","s","f","37553654879")
        .buildDate("7")
        .buildAccessCode("9")
        .build()
    println(person)

}