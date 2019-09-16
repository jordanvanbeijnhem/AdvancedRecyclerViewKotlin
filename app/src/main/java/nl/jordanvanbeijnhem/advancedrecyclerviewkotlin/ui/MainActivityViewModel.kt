package nl.jordanvanbeijnhem.advancedrecyclerviewkotlin.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import nl.jordanvanbeijnhem.advancedrecyclerviewkotlin.model.ColorItem
import nl.jordanvanbeijnhem.advancedrecyclerviewkotlin.repository.ColorRepository

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val colorRepository = ColorRepository()

    val colorItems = MutableLiveData<List<ColorItem>>().apply {
        value = colorRepository.getColorItems()
    }
}