package com.github.appintro.example.ui.mainTabs.intro

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.github.appintro.AppIntro2
import com.github.appintro.AppIntroFragment
import com.github.appintro.appintroexample.R
import com.github.appintro.model.SliderPage

class DefaultIntro2 : AppIntro2() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addSlide(AppIntroFragment.newInstance(
                "Welcome!",
                "This is a demo of the AppIntro library, using the second layout.",
                imageDrawable = R.drawable.ic_slide1,
                bgDrawable = R.drawable.back_slide1,
                titleTypefaceFontRes = R.font.lato,
                descTypefaceFontRes = R.font.lato
        ))

        addSlide(AppIntroFragment.newInstance(SliderPage(
                "Gradients!",
                "This text is written on a gradient background",
                imageDrawable =R.drawable.ic_slide2,
                bgDrawable = R.drawable.back_slide3,
                titleTypeface = "OpenSans-Light.ttf",
                descTypeface = "OpenSans-Light.ttf"
        )
        ))

        addSlide(AppIntroFragment.newInstance(
                "Simple, yet Customizable",
                "The library offers a lot of customization, while keeping it simple for those that like simple.",
                imageDrawable =R.drawable.ic_slide3,
                bgDrawable = R.drawable.back_slide4,
                titleTypefaceFontRes = R.font.opensans_regular,
                descTypefaceFontRes = R.font.opensans_regular
        ))

        addSlide(AppIntroFragment.newInstance(
                "Explore",
                "Feel free to explore the rest of the library demo!",
                imageDrawable =R.drawable.ic_slide4,
                bgDrawable = R.drawable.back_slide5
        ))

        setParallaxAnimation()
    }

    public override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        finish()
    }

    public override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        finish()
    }
}