package com.example.modelandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var buttonTranslate: Button
    private lateinit var buttonRotate: Button
    private lateinit var buttonScale: Button
    private lateinit var buttonAlpha: Button
    private lateinit var buttonSet: Button

    private lateinit var imageAnimation: ImageView

    private lateinit var animTranslate: Animation
    private lateinit var animRotate: Animation
    private lateinit var animScale: Animation
    private lateinit var animAlpha: Animation
    private lateinit var animSet: Animation



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonTranslate = findViewById(R.id.button_translate)
        buttonRotate = findViewById(R.id.button_rotate)
        buttonScale = findViewById(R.id.button_scale)
        buttonAlpha = findViewById(R.id.button_alpha)
        buttonSet = findViewById(R.id.button_set)

        imageAnimation = findViewById(R.id.image_animation)

        buttonTranslate.setOnClickListener(this)
        buttonRotate.setOnClickListener(this)
        buttonScale.setOnClickListener(this)
        buttonAlpha.setOnClickListener(this)
        buttonSet.setOnClickListener(this)


        animTranslate =AnimationUtils.loadAnimation(this,R.anim.translate)
        animRotate=AnimationUtils.loadAnimation(this,R.anim.rotate)
        animScale=AnimationUtils.loadAnimation(this,R.anim.scale)
        animAlpha=AnimationUtils.loadAnimation(this,R.anim.alpha)
        animSet=AnimationUtils.loadAnimation(this,R.anim.set)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button_translate -> {
                imageAnimation.startAnimation(animTranslate)
            }
            R.id.button_rotate -> {
                imageAnimation.startAnimation(animRotate)
            }
            R.id.button_scale -> {
                imageAnimation.startAnimation(animScale)
            }
            R.id.button_alpha -> {
                imageAnimation.startAnimation(animAlpha)
            }
            R.id.button_set -> {
                imageAnimation.startAnimation(animSet)
            }
        }
    }
}
