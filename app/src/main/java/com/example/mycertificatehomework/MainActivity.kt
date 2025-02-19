package com.example.mycertificatehomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycertificatehomework.ui.theme.MyCertificateHomeWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyCertificateHomeWorkTheme {
                Scaffold (modifier = Modifier.fillMaxSize()){
                        innerPadding -> CertificatingCourse(
                    nombre = "Carlos Haniel Soriano Martínez",
                    departamento = "División de Ingeniería Mecatrónica",
                    horas = 2,
                    curso = "Curso de desarrollo móvil",
                    ponente1 = "Juanito Hernandéz Rosas ",
                    ponente2 = "Juanita López Soto",
                    modifier = Modifier.padding(innerPadding)
                )
                }
            }
        }
    }
}

@Composable
fun CertificatingCourse(nombre: String,
                        departamento:String,
                        horas:Int,
                        curso:String,
                        ponente1:String,
                        ponente2:String,
                        modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Primer Renglón
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.escudounam_negro),
                contentDescription = "Escudo superior izquierdo",
                modifier = Modifier.size(50.dp, 50.dp)
            )
            Text(
                text = departamento,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.CenterVertically)//Esto alinea verticalmente del renglón
            )
            Image(
                painter = painterResource(id = R.drawable.escudofi_negro),
                contentDescription = "Escudo superior derecho",
                modifier = Modifier.size(50.dp, 50.dp)
            )
        }
        //Segundo Renglón
        Text(
            text = "This certificate is presented to",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.fillMaxWidth()
        )
        //Tercer Renglón
        Box(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.images),
                contentDescription = "Imagen de fondo",
                modifier = Modifier.fillMaxWidth(),
                alpha = 0.3F
            )
            Text(
                text = nombre,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(8.dp)
            )
        }
        //Cuarto Renglón
        Text(
            text = "has completed a $horas hours course on",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(12.dp))
        //Quinto Renglón
        Text(
            text = curso,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(12.dp))
        //Sexto Renglón
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ){
            Column(horizontalAlignment = Alignment.CenterHorizontally){
                Image(
                    painter = painterResource(id = R.drawable.firma_1),
                    contentDescription = "firma1",
                    modifier = Modifier.size(120.dp,120.dp),
                    alpha = 0.7F
                )
                Divider(//Nuevo!!!
                    modifier = Modifier
                        .width(120.dp)
                        .padding(top = 4.dp),
                    thickness = 1.dp,
                    color = Color.Gray
                )
                Text(text = "Firma", fontSize = 12.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = ponente1, fontSize = 14.sp, fontWeight = FontWeight.Bold)
            }
            Column(horizontalAlignment =  Alignment.CenterHorizontally){
                Image(
                    painter = painterResource(id = R.drawable.firma_2),
                    contentDescription = "firma2",
                    modifier = Modifier.size(120.dp,120.dp),
                    alpha = 0.7F
                )
                Divider(
                    modifier = Modifier
                        .width(120.dp)
                        .padding(top = 4.dp),
                    thickness = 1.dp,
                    color = Color.Gray
                )
                Text(text = "Firma", fontSize = 12.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = ponente2, fontSize = 14.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CertificatingCoursePreview(){
    CertificatingCourse(
        nombre = "Carlos Haniel Soriano Martínez",
        departamento = "División de Ingeniería Mecatrónica",
        horas = 2,
        curso = "Curso de desarrollo móvil",
        ponente1 = "Juanito Hernandéz Rosas ",
        ponente2 = "Juanita López Soto",
    )
}
