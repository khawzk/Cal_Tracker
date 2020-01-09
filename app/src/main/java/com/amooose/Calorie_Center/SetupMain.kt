package com.amooose.Calorie_Center

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction

import kotlinx.android.synthetic.main.activity_setup.*

import android.content.Intent
import com.amooose.Calorie_Center.fragments.setupFragment1
import com.amooose.Calorie_Center.fragments.setupFragment2
import com.amooose.Calorie_Center.fragments.setupFragment3


class SetupMain : AppCompatActivity() {
    lateinit var ft : FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setup)
        setSupportActionBar(toolbar)
        ft = getSupportFragmentManager().beginTransaction()
        ft.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_to_left,R.anim.enter_from_left,R.anim.exit_to_right)
        ft.replace(R.id.setupFragContainer, setupFragment1(),"f1").commit()

    }

    fun activityLevelOpen(){
        ft = getSupportFragmentManager().beginTransaction();
        ft.addToBackStack("f1")
        ft.setCustomAnimations(R.anim.enter_from_right,R.anim.exit_to_left,R.anim.enter_from_left,R.anim.exit_to_right)
        ft.replace(R.id.setupFragContainer, setupFragment2(),"f2").commit()
    }

    fun activityLevelNext(){
        ft = getSupportFragmentManager().beginTransaction();
        ft.addToBackStack("f2")
        ft.setCustomAnimations(R.anim.enter_from_right,R.anim.exit_to_left,R.anim.enter_from_left,R.anim.exit_to_right)
        ft.replace(R.id.setupFragContainer, setupFragment3(),"f3").commit()
    }

    fun closeSetupMain(){
        val refresh = Intent(this, CaloriesTracker::class.java)
        startActivity(refresh)
        finish()
    }

    override fun onBackPressed() {
       if(!(getSupportFragmentManager().backStackEntryCount == 0)){
           super.onBackPressed()
       }
    }





}
