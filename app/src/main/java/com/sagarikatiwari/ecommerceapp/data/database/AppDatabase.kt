package com.sagarikatiwari.ecommerceapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sagarikatiwari.ecommerceapp.data.database.dao.WishListDAO
import com.sagarikatiwari.ecommerceapp.data.entities.FavoriteProductEntity

@Database(entities = [FavoriteProductEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun wishListDao(): WishListDAO
}