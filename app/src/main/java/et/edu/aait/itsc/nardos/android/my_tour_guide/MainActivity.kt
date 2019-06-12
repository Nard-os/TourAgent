package et.edu.aait.itsc.nardos.android.my_tour_guide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import et.edu.aait.itsc.nardos.android.my_tour_guide.Dao.ProfileDao
import et.edu.aait.itsc.nardos.android.my_tour_guide.Database.ProfileDatabase
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_login.*

class MainActivity : AppCompatActivity() {

    private lateinit var profileDatabase: ProfileDatabase
    private lateinit var profileDao: ProfileDao

    private lateinit var loginButton: Button
    private lateinit var signupButton: Button

    private lateinit var countryEditText: EditText
    private lateinit var unameEditText: EditText
    private lateinit var editText5EditText: EditText
    private lateinit var emaileditEditText: EditText




    private val onNavigationItemSelectedListner = BottomNavigationView.OnNavigationItemSelectedListener{item ->
        when(item.itemId){
            R.id.home -> {
                println("home pressed")
                replaceFragment(CountryFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.destination_map -> {
                println("map pressed")
                replaceFragment(InfoFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.cart -> {
                println("cart pressed")
                replaceFragment(LoginFragment())
                return@OnNavigationItemSelectedListener true
            }
        }
false
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton = login_button
        signupButton = signup_button

        countryEditText=country_edit
        unameEditText=uname_edit
        editText5EditText=password_edit
        emaileditEditText=email_edit


        signupButton.setOnClickListener{}
        loginButton.setOnClickListener{}



        bottomNavigation.setOnNavigationItemSelectedListener (onNavigationItemSelectedListner)


    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.home_fragment, fragment)
        fragmentTransaction.commit()

    }


}
