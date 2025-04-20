package com.billcoreatech.health0419.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val exampleString: String
) : ViewModel() {
    fun getMessage(): String = exampleString
}