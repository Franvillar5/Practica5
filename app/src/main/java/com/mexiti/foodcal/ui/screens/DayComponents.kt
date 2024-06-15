package com.mexiti.foodcal.ui.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mexiti.foodcal.R
import com.mexiti.foodcal.model.DayFood
import com.mexiti.foodcal.model.DayRepository
import com.mexiti.foodcal.ui.theme.FoodAppTheme


@Composable
fun CardDayInfo(
    dayFood: DayFood,
    modifier: Modifier = Modifier
){
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp,

        ),
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column {
            DayTitle(day = dayFood.day, title =dayFood.title )
            Spacer(modifier = modifier.height(dimensionResource(id = R.dimen.space_component)))
            ShowImage(imageRes = dayFood.imageRes)
            Spacer(modifier = modifier.height(dimensionResource(id = R.dimen.space_component)))
            BodyContent(body = dayFood.description)
        }

    }

}



@Composable
fun ShowImage(
    @DrawableRes imageRes:Int,
    modifier: Modifier = Modifier
){
    Box(modifier =
    modifier
        .width(dimensionResource(id = R.dimen.width_size))
        .height(dimensionResource(id = R.dimen.height_size))
        .padding(dimensionResource(id = R.dimen.padding_component))
        .border(BorderStroke(1.dp, MaterialTheme.colorScheme.onBackground)),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = modifier.fillMaxWidth()
        )
    }
}

@Composable
fun DayTitle(
    @StringRes day: Int,
    @StringRes title: Int,
    modifier: Modifier = Modifier
){
    Column(
        modifier
            .width(dimensionResource(id = R.dimen.width_size))
            .padding(dimensionResource(id = R.dimen.padding_component))
    ) {
        Text(
            text = stringResource(id = day),
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = stringResource(id = title),
            style = MaterialTheme.typography.headlineSmall,
        )
    }
}

@Composable
fun BodyContent(
    @StringRes body: Int,
    modifier: Modifier = Modifier
){
    Text(
        text = stringResource(id = body),
        style = MaterialTheme.typography.bodyLarge,
        modifier = modifier
            .width(dimensionResource(id = R.dimen.width_size))
            .padding(
                dimensionResource(id = R.dimen.padding_component)
            )
    )

}



@Preview(showBackground = true)
@Composable
fun CardDayInfoPreview(){
    FoodAppTheme {
        CardDayInfo(dayFood = DayRepository.days[0] )
    }
}

@Preview(showBackground = true)
@Composable
fun DayTitlePreview(){
    DayTitle(day = R.string.day1,
        title = R.string.foodBrocoli1)
}


@Preview(showBackground = true)
@Composable
fun ShowImagePreview(){
    FoodAppTheme {
        ShowImage(imageRes = R.drawable.sandwich_fresas)
    }

}

@Preview(showBackground = true)
@Composable
fun BodyContentPreview(){
    FoodAppTheme {
        BodyContent(
            R.string.description1
        )
    }

}

