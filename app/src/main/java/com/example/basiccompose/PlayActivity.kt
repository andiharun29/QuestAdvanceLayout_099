package com.example.basiccompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity(modifier: Modifier = Modifier){
    Column (
        modifier = Modifier.fillMaxSize()){
        SectionHeader()
        Spacer(Modifier.padding(8.dp))
        Text(text = "Kepada Yth :",Modifier.padding(start = 15.dp))
        Text(text = "Andi Harun",Modifier.padding(start = 15.dp))
        Spacer(Modifier.padding(10.dp))
        MainSection(
            judulParam = "nama", isiparam = "ade kurniawan")
        MainSection(
            judulParam = "kelas", isiparam = "Ilmu pertanian")
        MainSection(
            judulParam = "NIM", isiparam = "20220130099")
        MainSection(
            judulParam = "keterangan", isiparam = "masih menjalini studi")

    }
}

@Composable
fun SectionHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.DarkGray)){
        Row {
            Box(contentAlignment = Alignment.BottomEnd){
                Image(painter = painterResource( id = R.drawable.dia),
                contentDescription = null,
                    Modifier.size(100.dp)//.clip(shape = CircleShape)
                )
                Icon(Icons.Filled.Check,
                    contentDescription = null,
                    Modifier.padding(end = 9.dp).size(25.dp),
                    tint = Color.Red,
                    )
            }
            Column(Modifier.padding(20.dp)) {
                Text(text = "Teknologi Informasi"
                    , color = Color.White)
                Spacer(Modifier.padding(3.dp))
                Text(text = "Universitas Muhammadiyah Yogyakarta"
                    , color = Color.White)
            }
        }
    }
}

@Composable
fun MainSection(judulParam:String, isiparam:String){
    Column(horizontalAlignment = Alignment.Start){

        Spacer(Modifier.padding(5.dp))
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(1.dp)
            .padding(start = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ){
            Text(text = judulParam,
                modifier = Modifier.weight(0.9f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = "$isiparam",
                modifier = Modifier.weight(2f))
        }
        /*Row (modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ){
            Text(text = "kelas",
                modifier = Modifier.weight(0.9f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = "Ilmu Pertanian",
                modifier = Modifier.weight(2f))
        }
        Row (modifier = Modifier.fillMaxWidth().padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ){
            Text(text = "NIM",
                modifier = Modifier.weight(0.9f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = "20220150926",
                modifier = Modifier.weight(2f))
        }
        Text(text ="Nama : Ade kurniawan")
        Text(text ="Nama : Ade kurniawan")
        Text(text ="Nama : Ade kurniawan")*/
    }
}