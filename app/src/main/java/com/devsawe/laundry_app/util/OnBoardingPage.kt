package com.devsawe.laundry_app.util

import androidx.annotation.DrawableRes
import com.devsawe.laundry_app.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
){
    object First : OnBoardingPage(
        image = R.drawable.laundry,
        title = "Meeting",
        description = "Lorem ipdfghjk"
    )
    object Second: OnBoardingPage(
        image = R.drawable.laundry,
        title = "Meeting",
        description = "Lorem ipdfghjk"
    )
    object Third: OnBoardingPage(
        image = R.drawable.laundry,
        title = "Meeting",
        description = "Lorem ipdfghjk"
    )

}


