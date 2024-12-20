package tech.mobiledeveloper.cart_impl

import tech.mobiledeveloper.cart_api.CartRepository

class CartRepositoryImpl : CartRepository {

    override suspend fun fetchLocalCart(): List<String> {
        TODO("Not yet implemented")
    }

    override suspend fun isItemInCart(): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun addItemToCart(itemId: String): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun getCartCount(): Int {
        TODO("Not yet implemented")
    }
}