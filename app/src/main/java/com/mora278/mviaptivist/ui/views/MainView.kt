package com.mora278.mviaptivist.ui.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import coil.compose.AsyncImage
import com.mora278.mviaptivist.R

@Composable
fun MainView(

){
    Column(
        modifier = Modifier
            .padding(dimensionResource(id = R.dimen.common_regular_padding))
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        AsyncImage(model = "https://coffee.alexflipnote.dev/JEpD1bV2wAM_coffee.jpg", contentDescription = "coffee image")
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Reload")
        }
    }

}