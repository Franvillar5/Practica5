package com.mexiti.foodcal.ui.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mexiti.foodcal.R
import com.mexiti.foodcal.ui.theme.FoodAppTheme


@Composable
fun ShowImage(
    @DrawableRes imageRes:Int,
    modifier: Modifier = Modifier
){
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = null,
        modifier = modifier
            .width(300.dp)
            .height(200.dp)
            .border(BorderStroke(1.dp, MaterialTheme.colorScheme.onBackground)),
        contentScale = ContentScale.Inside
    )

}

@Composable
fun DayTitle(
    @StringRes day: Int,
    @StringRes title: Int,
    modifier: Modifier = Modifier
){
    Column(modifier.width(300.dp)) {
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
        style = MaterialTheme.typography.bodyMedium,
        modifier = modifier.width(300.dp)
    )

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

