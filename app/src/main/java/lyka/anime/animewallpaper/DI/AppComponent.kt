package lyka.anime.animewallpaper.DI

import android.app.Application
import lyka.anime.animewallpaper.Activities.*
import lyka.anime.animewallpaper.Adapters.CategoryAdapter
import lyka.anime.animewallpaper.Adapters.FavouriteAdapter
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [Appmodule::class,ViewmodelModule::class,DatabaseModule::class])
interface AppComponent {
    fun injectHomeActivity(homeActivity: HomeActivity)

    fun injectCategoryActivity(categoryActivity: CategoryActivity)

    fun injectCategoryAdapter(categoryAdapter: CategoryAdapter)

    fun injectWallpaperActivity(wallpaperActivity: WallpaperActivity)

    fun injectFavouriteActivity(favouriteActivity: FavouriteActivity)

    fun injectFavouriteAdapter(favouriteAdapter: FavouriteAdapter)

    fun injectSplashScreenActivity(splashscreenActivity: SplashscreenActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun applicationContext(context: Application): Builder // Provide the Context instance

        fun build(): AppComponent
    }
}