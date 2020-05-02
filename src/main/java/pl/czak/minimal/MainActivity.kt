package com.lazy.dolphin

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.widget.EditText
import android.view.View

class MainActivity : Activity() {
	lateinit var gtv: TextView
	lateinit var et: EditText
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		setContentView(R.layout.main_activity)
	}

	fun updateGreeting(view: View) {
		gtv = findViewById(R.id.greeting_tv)
		et = findViewById(R.id.name_input)
		gtv.setText("Hello, " + et.getText().toString() + "!")
	}
}
