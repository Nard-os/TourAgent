package et.edu.aait.itsc.nardos.android.my_tour_guide.Database

import et.edu.aait.itsc.nardos.android.my_tour_guide.Dao.ProfileDao
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import et.edu.aait.itsc.nardos.android.my_tour_guide.data.Profile


class ProfileDatabase {
    @Database(entities = arrayOf(Profile::class),version = 1)
    abstract class ProfileDatabase:RoomDatabase() {
        abstract fun profileDao(): ProfileDao
        abstract fun ProfileDao(): ProfileDao
    }
    companion object {
        @Volatile
        private var INSTANCE: Database.ProfileDatabase.ProfileDatabase? = null

        fun getDatabase(context: Context): Database.ProfileDatabase.ProfileDatabase {
            val tempInstance = Database.ProfileDatabase.Companion.INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance =
                    Room.databaseBuilder(context.applicationContext, Database.ProfileDatabase.ProfileDatabase::class.java, "profile_database")
                        .build()

                Database.ProfileDatabase.Companion.INSTANCE = instance
                return instance
            }
        }
    }}