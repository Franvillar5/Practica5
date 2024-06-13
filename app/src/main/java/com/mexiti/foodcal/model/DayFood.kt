package com.mexiti.foodcal.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.mexiti.foodcal.R

data class DayFood(
    @StringRes val day:Int,
    @StringRes val title:Int,
    @StringRes val description:Int,
    @DrawableRes val imageRes:Int
)

object DayRepository {
    val days = listOf(
        DayFood(
            R.string.day1,
            R.string.foodBrocoli1,
            R.string.description1,
            R.drawable.brocoli_quiche
        ),
        DayFood(
            R.string.day2,
            R.string.foodCaldito2,
            R.string.description2,
            R.drawable.caldito
        ),
        DayFood(
            R.string.day3,
            R.string.foodFresa3,
            R.string.description3,
            R.drawable.fresa_snack
        ),
        DayFood(
            R.string.day4,
            R.string.foodGalletas4,
            R.string.description4,
            R.drawable.fruit_cookie
        ),
        DayFood(
            R.string.day5,
            R.string.foodEnsalada5,
            R.string.description5,
            R.drawable.salad_fruid
        ),
        DayFood(
            R.string.day6,
            R.string.foodSandwich6,
            R.string.description6,
            R.drawable.sandwich_fresas
        )

    )
}
