package com.example.mr_potato

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get check box data
        val _hat = findViewById<CheckBox>(R.id.hat)
        val _glasses = findViewById<CheckBox>(R.id.glasses)
        val _nose = findViewById<CheckBox>(R.id.nose)
        val _mouth = findViewById<CheckBox>(R.id.mouth)
        val _mustache = findViewById<CheckBox>(R.id.mustache)
        val _ears = findViewById<CheckBox>(R.id.ears)
        val _arms = findViewById<CheckBox>(R.id.arms)
        val _shoes = findViewById<CheckBox>(R.id.shoes)
        val _eyebrows = findViewById<CheckBox>(R.id.eyebrows)
        val _eyes = findViewById<CheckBox>(R.id.eyes)

        // image view data
        val _hat_image = findViewById<ImageView>(R.id.hat_)
        val _glasses_image = findViewById<ImageView>(R.id.glasses_)
        val _nose_image = findViewById<ImageView>(R.id.nose_)
        val _mouth_image = findViewById<ImageView>(R.id.mouth_)
        val _mustache_image = findViewById<ImageView>(R.id.mustache_)
        val _ears_image = findViewById<ImageView>(R.id.ears_)
        val _arms_image = findViewById<ImageView>(R.id.arms_)
        val _shoes_image = findViewById<ImageView>(R.id.shoes_)
        val _eyebrows_image = findViewById<ImageView>(R.id.eyebrows_)
        val _eyes_image = findViewById<ImageView>(R.id.eyes_)

        // set check box data
        _hat.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                _hat_image.visibility = ImageView.VISIBLE
            } else {
                _hat_image.visibility = ImageView.INVISIBLE
            }
        }

        _glasses.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                _glasses_image.visibility = ImageView.VISIBLE
            } else {
                _glasses_image.visibility = ImageView.INVISIBLE
            }
        }

        _nose.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                _nose_image.visibility = ImageView.VISIBLE
            } else {
                _nose_image.visibility = ImageView.INVISIBLE
            }
        }

        _mouth.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                _mouth_image.visibility = ImageView.VISIBLE
            } else {
                _mouth_image.visibility = ImageView.INVISIBLE
            }
        }

        _mustache.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                _mustache_image.visibility = ImageView.VISIBLE
            } else {
                _mustache_image.visibility = ImageView.INVISIBLE
            }
        }

        _ears.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                _ears_image.visibility = ImageView.VISIBLE
            } else {
                _ears_image.visibility = ImageView.INVISIBLE
            }
        }

        _arms.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                _arms_image.visibility = ImageView.VISIBLE
            } else {
                _arms_image.visibility = ImageView.INVISIBLE
            }
        }

        _shoes.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                _shoes_image.visibility = ImageView.VISIBLE
            } else {
                _shoes_image.visibility = ImageView.INVISIBLE
            }
        }

        _eyebrows.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                _eyebrows_image.visibility = ImageView.VISIBLE
            } else {
                _eyebrows_image.visibility = ImageView.INVISIBLE
            }
        }

        _eyes.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                _eyes_image.visibility = ImageView.VISIBLE
            } else {
                _eyes_image.visibility = ImageView.INVISIBLE
            }
        }




    }
}