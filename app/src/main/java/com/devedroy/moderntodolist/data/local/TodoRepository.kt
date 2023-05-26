package com.devedroy.moderntodolist.data.local

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class TodoRepository(
    private val todoDao: TodoDao
) {
    val allTodos: Flow<List<Todo>> = todoDao.getTodos()

    @WorkerThread
    suspend fun insert(todo: Todo) {
        todoDao.insert(todo)
    }
}