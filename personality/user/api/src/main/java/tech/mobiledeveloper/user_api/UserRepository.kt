package tech.mobiledeveloper.user_api

import tech.mobiledeveloper.user_api.UserProfile

interface UserRepository {
    suspend fun getUserShort(): UserProfile
    suspend fun updateUsername(name: String): Boolean
    suspend fun updateUserPic(url: String): Boolean
    suspend fun updateEmail(email: String): Boolean
}