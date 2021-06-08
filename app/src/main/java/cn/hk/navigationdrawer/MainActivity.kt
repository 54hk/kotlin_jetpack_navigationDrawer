package cn.hk.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_layout.*

class MainActivity : AppCompatActivity() {
    private lateinit var controller: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        controller =
            (supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment).navController
//        appBarConfiguration = AppBarConfiguration(controller.graph, drawer)
        val set = setOf(R.id.textFragment, R.id.listFragment, R.id.pagerFragment)
        appBarConfiguration = AppBarConfiguration(set,drawer)
        setupActionBarWithNavController(controller, appBarConfiguration)
        navigationView.setupWithNavController(controller)
    }

    override fun onSupportNavigateUp(): Boolean {
        return controller.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}