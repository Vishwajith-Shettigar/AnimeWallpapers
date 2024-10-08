package lyka.anime.animewallpapers.Viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import lyka.anime.animewallpapers.Entity.FavouriteEntity
import lyka.anime.animewallpapers.Repository.FavouriteRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class FavouriteViewmodel(
    private val favouriteRepository: FavouriteRepository

) : ViewModel()  {

    private val _favwallpapers = MutableStateFlow<MutableList<FavouriteEntity>>(mutableListOf())
    val favwallpapers: StateFlow<MutableList<FavouriteEntity>> get() = _favwallpapers

    init {

        getAllFavourites()
    }

     fun getAllFavourites() {
        viewModelScope.launch {
            val datalist=favouriteRepository.getAllFavourites()
            _favwallpapers.value=datalist
        }

    }


}