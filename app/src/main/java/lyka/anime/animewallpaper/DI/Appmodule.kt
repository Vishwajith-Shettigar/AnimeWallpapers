package lyka.anime.animewallpaper.DI

import android.app.Application
import lyka.anime.animewallpaper.Util.SharedPreferencesManager
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class Appmodule {

    @Singleton
    @Provides
    fun getFiebaseFirestore():FirebaseFirestore
    {
        return FirebaseFirestore.getInstance()
    }

    @Singleton
    @Provides
    fun getSharedPreferenceManager(context: Application):SharedPreferencesManager
    {
        return SharedPreferencesManager(context)
    }
}