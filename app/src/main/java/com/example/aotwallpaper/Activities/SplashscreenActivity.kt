package com.example.aotwallpaper.Activities

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.aotwallpaper.Adapters.SplashSliderAdapter
import com.example.aotwallpaper.Fragments.Splash1Fragment
import com.example.aotwallpaper.Fragments.Splash2Fragment
import com.example.aotwallpaper.Fragments.Splash3Fragment
import com.example.aotwallpaper.R
import com.example.aotwallpaper.databinding.SplashScreenActivityBinding

class SplashscreenActivity : AppCompatActivity() {
    private lateinit var binding: SplashScreenActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        binding = DataBindingUtil.setContentView(this, R.layout.splash_screen_activity)
        val fragmentList: MutableList<Fragment> = ArrayList()
        fragmentList.add(Splash1Fragment())
        fragmentList.add(Splash2Fragment())
        fragmentList.add(Splash3Fragment())

        val sliderAdapter = SplashSliderAdapter(supportFragmentManager, lifecycle, fragmentList)
        binding.splashscreenviewpager.adapter = sliderAdapter

        binding.splashscreenviewpager.registerOnPageChangeCallback(object :
            ViewPager2.OnPageChangeCallback() {

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)

                binding.dotone.setBackgroundResource(R.drawable.dotsfragback)
                binding.dottwo.setBackgroundResource(R.drawable.dotsfragback)
                binding.dotthree.setBackgroundResource(R.drawable.dotsfragback)


                if (position == 0)
                    binding.dotone.setBackgroundResource(R.drawable.dotsfragactive)
                else if (position == 1)
                    binding.dottwo.setBackgroundResource(
                        R.drawable.dotsfragactive
                    )
                else if (position == 2)
                    binding.dotthree.setBackgroundResource(R.drawable.dotsfragactive)

            }
        })


    }
}