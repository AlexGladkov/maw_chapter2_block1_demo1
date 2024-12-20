package tech.mobiledeveloper.user_impl

import tech.mobiledeveloper.user_api.UserProfile
import tech.mobiledeveloper.user_api.UserRepository

class UserRepositoryImpl : UserRepository {
    
    override suspend fun getUserShort(): UserProfile {
        TODO("Not yet implemented")
    }

    override suspend fun updateUsername(name: String): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun updateUserPic(url: String): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun updateEmail(email: String): Boolean {
        TODO("Not yet implemented")
    }
}