package com.example.expert.detail

import androidx.lifecycle.ViewModel
import com.example.core.domain.model.Tourism
import com.example.core.domain.usecase.TourismUseCase

class DetailViewModel(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus:Boolean) =
        tourismUseCase.setFavoriteTourism(tourism, newStatus)
}