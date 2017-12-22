package com.freeankit.room_rxjava_rxkotlin.persistence

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

/**
 * @author Ankit Kumar (ankitdroiddeveloper@gmail.com) on 22/12/2017 (MM/DD/YYYY )
 */
@Entity(tableName = "users")
data class User(@PrimaryKey
                @ColumnInfo(name = "userid")
                val id: String = UUID.randomUUID().toString(),
                @ColumnInfo(name = "username")
                val userName: String)