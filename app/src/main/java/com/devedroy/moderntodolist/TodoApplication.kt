package com.devedroy.moderntodolist

import android.app.Application
import com.devedroy.moderntodolist.data.local.TodoRepository
import com.devedroy.moderntodolist.data.local.TodoRoomDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class TodoApplication : Application() {
    private val applicationScope = CoroutineScope(SupervisorJob())
    private val database by lazy { TodoRoomDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { TodoRepository(database.todoDao()) }
}