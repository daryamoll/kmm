package com.example.kmmapp

import dev.icerock.moko.mvvm.livedata.LiveData
import dev.icerock.moko.mvvm.livedata.MutableLiveData
import dev.icerock.moko.mvvm.viewmodel.ViewModel

class SimpleViewModel : ViewModel() {

    private var i = 1

    private val _messageLiveData: MutableLiveData<HomeState>
            = MutableLiveData(HomeState(Greeting().greet()))

    val messageLiveData: LiveData<HomeState> = _messageLiveData

    fun next() {
        _messageLiveData.value = HomeState("Чудный код # ${i++}")
    }
}

data class HomeState(
    val text: String,
)