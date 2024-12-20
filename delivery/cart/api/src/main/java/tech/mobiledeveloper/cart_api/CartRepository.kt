package tech.mobiledeveloper.cart_api

interface CartRepository {
    suspend fun fetchLocalCart(): List<String>
    suspend fun isItemInCart(): Boolean
    suspend fun addItemToCart(itemId: String): Boolean
    suspend fun getCartCount(): Int
}