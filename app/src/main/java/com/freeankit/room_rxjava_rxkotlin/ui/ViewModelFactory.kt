package com.freeankit.room_rxjava_rxkotlin.ui

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.freeankit.room_rxjava_rxkotlin.persistence.UserDao

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com) on 22/12/2017 (MM/DD/YYYY )
 */
class ViewModelFactory(private val dataSource: UserDao) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserViewModel::class.java)) {
            return UserViewModel(dataSource) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}