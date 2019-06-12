package et.edu.aait.itsc.nardos.android.my_tour_guide.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profiles")

data class Profile(
    @PrimaryKey @ColumnInfo(name = "Profile_username") val username:String ,
    @ColumnInfo(name = "Profile_email") val email:Char ,
    @ColumnInfo(name = "Profile_password") val password: Char,
    @ColumnInfo(name = "Profile_country") val country: String
)


