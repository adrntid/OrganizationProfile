package com.example.trishmuk.organizationprofile

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory
import android.view.KeyEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bit = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val round = RoundedBitmapDrawableFactory.create(resources,bit)
        round.cornerRadius = 20f
        OrgLogo.setImageDrawable(round)

    }


}
