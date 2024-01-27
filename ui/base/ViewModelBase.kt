package com.intelli.ui.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.intelli.tools.livedata.LiveDataEvent

/**
 * Created by Jalaj on 20-11-2022.
 */
abstract class ViewModelBase : ViewModel() {
    private val mSnackBarText = MutableLiveData<LiveDataEvent<String>>()
    val snackBarText: LiveData<LiveDataEvent<String>> = mSnackBarText
}