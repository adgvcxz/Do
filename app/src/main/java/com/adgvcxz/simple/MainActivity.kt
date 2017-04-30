package com.adgvcxz.simple

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.adgvcxz.adgdo.then

/**
 * zhaowei
 * Created by zhaowei on 2017/4/30.
 */

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = LinearLayout(this).then {
            it.setBackgroundColor(Color.RED)
            it.orientation = LinearLayout.HORIZONTAL
            it.gravity = Gravity.CENTER
        }
        val view = TextView(this).then {
            it.text = getString(R.string.app_name)
            it.setTextColor(Color.WHITE)
            it.layoutParams = ViewGroup.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT)
        }
        layout.addView(view)
        setContentView(layout)

    }
}