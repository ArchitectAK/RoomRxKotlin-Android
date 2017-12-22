package com.freeankit.room_rxjava_rxkotlin

import android.content.Context
import com.freeankit.room_rxjava_rxkotlin.persistence.UserDao
import com.freeankit.room_rxjava_rxkotlin.persistence.UsersDatabase
import com.freeankit.room_rxjava_rxkotlin.ui.ViewModelFactory

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com) on 22/12/2017 (MM/DD/YYYY )
 */
object Injection {
    fun provideUserDataSource(context: Context): UserDao {
        val database = UsersDatabase.getInstance(context)
        return database.userDao()
    }

    fun provideViewModelFactory(context: Context): ViewModelFactory {
        val dataSource = provideUserDataSource(context)
        return ViewModelFactory(dataSource)
    }
}