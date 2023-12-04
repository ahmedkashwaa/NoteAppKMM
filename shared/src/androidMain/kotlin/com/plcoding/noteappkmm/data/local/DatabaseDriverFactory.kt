package com.plcoding.noteappkmm.data.local

import android.content.Context
import com.plcoding.noteappkmm.database.NoteDataBase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory(private val context:Context) {
    actual fun createDriver():SqlDriver{
        return AndroidSqliteDriver(NoteDataBase.Schema,context,"note.db")
    }

}