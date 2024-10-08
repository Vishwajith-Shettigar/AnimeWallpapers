package lyka.anime.animewallpapers.Viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import lyka.anime.animewallpapers.Repository.WallpaperRepository
import lyka.anime.animewallpapers.Util.SharedPreferencesManager
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class CategoryViewmodelFactory @Inject constructor(
    private val firestore: FirebaseFirestore,
    private val wallpaperRepository: WallpaperRepository,


    ) : ViewModelProvider.Factory {
    lateinit var cat_name: String
     var cat_id: Int=0
    fun setCatName(catName: String, catId: Int) {
        this.cat_name = catName
        this.cat_id = catId
    }

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CategoryViewmodel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return CategoryViewmodel(firestore,wallpaperRepository, cat_name,cat_id) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}