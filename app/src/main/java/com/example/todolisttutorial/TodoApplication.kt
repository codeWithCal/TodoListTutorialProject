package com.example.todolisttutorial

import android.app.Application

class TodoApplication : Application()
{
    private val database by lazy { TaskItemDatabase.getDatabase(this) }
    val repository by lazy { TaskItemRepository(database.taskItemDao()) }
}