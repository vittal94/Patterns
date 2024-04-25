package org.example.kotlinCode.facade.complexSystemStore

class ComplexSystemStore(private val filePath: String) {
    private val cash: HashMap<String,String>

    init {
        println("Reading data from the file: $filePath")
        cash = HashMap()
    }
    fun store(key: String,value: String) {
        cash[key] = value
    }
    fun read(key: String) = cash[key] ?: ""

    fun commit() = println("Storing cashed data to file $filePath")
}

data class User(val login: String)

//Facade
class UserRepository {
    private val systemPreferences = ComplexSystemStore("/data/default.prefs")

    fun save(user: User) {
        systemPreferences.store("user_key",user.login)
        systemPreferences.commit()
    }

    fun findFirst(): User = User(systemPreferences.read("user_key"))
}

class TestFacade {
    companion object {
        fun run() {
            val userRepo = UserRepository()
            val user = User("john")
            userRepo.save(user)

            val retrievedUser = userRepo.findFirst()

            println(retrievedUser.login)
        }
    }
}