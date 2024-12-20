package tech.mobiledeveloper.cart_impl

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import tech.mobiledeveloper.cart_api.CartRepository
import tech.mobiledeveloper.core.Injector
import tech.mobiledeveloper.user_api.UserRepository

class CartViewModel {

    private val cartRepository: CartRepository = CartRepositoryImpl()
    private val userRepository: UserRepository = Injector.getDependency(Injector.user)

    private fun initScreen() {
        GlobalScope.launch {
            val user = userRepository.getUserShort()
        }
    }
}