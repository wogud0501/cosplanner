package com.develop.cosplanner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 버튼 클릭 이벤트 설정
        findViewById<Button>(R.id.button_ilpe).setOnClickListener {
            navigateToForm(ILPEActivity::class.java)
        }
        findViewById<Button>(R.id.button_cocofe).setOnClickListener {
            navigateToForm(COCFEActivity::class.java)
        }
        findViewById<Button>(R.id.button_secco).setOnClickListener {
            navigateToForm(SECCOActivity::class.java)
        }
        findViewById<Button>(R.id.button_buko).setOnClickListener {
            navigateToForm(BUKOActivity::class.java)
        }
        findViewById<Button>(R.id.button_edga).setOnClickListener {
            navigateToForm(EDGAActivity::class.java)
        }
        findViewById<Button>(R.id.button_schedule).setOnClickListener {
            navigateToForm(ScheduleActivity::class.java)
        }
    }

    private fun navigateToForm(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }
}

