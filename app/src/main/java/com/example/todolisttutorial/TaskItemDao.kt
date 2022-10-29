package com.example.todolisttutorial

import androidx.room.*
import kotlinx.coroutines.flow.Flow


@Dao
interface TaskItemDao
{
    @Query("SELECT * FROM task_item_table ORDER BY id ASC")
    fun allTaskItems(): Flow<List<TaskItem>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTaskItem(taskItem: TaskItem)

    @Update
    suspend fun updateTaskItem(taskItem: TaskItem)

    @Delete
    suspend fun deleteTaskItem(taskItem: TaskItem)
}