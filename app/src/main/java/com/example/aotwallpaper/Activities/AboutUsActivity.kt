package com.example.aotwallpaper.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import com.example.aotwallpaper.R
import com.example.aotwallpaper.databinding.ActivityAboutUsBinding

class AboutUsActivity : AppCompatActivity() {
    lateinit var binding:ActivityAboutUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_about_us)

        binding.tvAboutUsContent.text=
            HtmlCompat.fromHtml(getString(R.string.about_us_content), HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}