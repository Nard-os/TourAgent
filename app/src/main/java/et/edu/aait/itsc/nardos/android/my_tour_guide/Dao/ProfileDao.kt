package et.edu.aait.itsc.nardos.android.my_tour_guide.Dao

import androidx.room.*
import et.edu.aait.itsc.nardos.android.my_tour_guide.data.Profile

@Dao
interface ProfileDao {
    @Query("SELECT * FROM profiles WHERE Profile_username = :username LIMIT 1")
    fun getProfileByUsername(username:String): Profile

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProfile(profile: Profile):Long


}