package com.plcoding.noteappkmm.data.local

import com.plcoding.noteappkmm.database.NoteDataBase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

actual class DatabaseDriverFactory {
    actual fun createDriver():SqlDriver{
        return NativeSqliteDriver(NoteDataBase.Schema,"note.db")
    }

}