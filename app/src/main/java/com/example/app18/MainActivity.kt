package com.example.app18

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    companion object{
        lateinit var typeVent: String
        lateinit var typePatient: String
    }

    private lateinit var btnAdult: TextView
    private lateinit var btnPediatric: TextView
    private lateinit var btnCMV: TextView
    private lateinit var btnSIMV: TextView
    private lateinit var btnNext: Button

    var Volumen = 500
    var FlujoPico = 10
    var FrecuenciaRespiratoria = 5
    var Peep = 0
    var Plateu = 0
    var Fio2 = 21
    var PerfilFlujo = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdult = findViewById(R.id.btAdult)
        btnPediatric = findViewById(R.id.btPediatric)
        btnCMV = findViewById(R.id.btCMV)
        btnSIMV = findViewById(R.id.btSIMV)


    }

    fun chooseAdult(view: View) {
        btnPediatric.setBackgroundColor(resources.getColor(R.color.blue_dark))
        btnAdult.setBackgroundColor(resources.getColor(R.color.blue_light))
        //Toast.makeText(this,"Presionaste adulto", Toast.LENGTH_SHORT).show()

        typePatient = "Adult"
    }

    fun choosePediatric(view: View) {
        btnPediatric.setBackgroundColor(resources.getColor(R.color.blue_light))
        btnAdult.setBackgroundColor(resources.getColor(R.color.blue_dark))
        //Toast.makeText(this,"Presionaste Pediatrico", Toast.LENGTH_SHORT).show()

        typePatient = "Pediatric"
    }

    fun chooseCMV(view: View) {
        btnCMV.setBackgroundColor(resources.getColor(R.color.blue_light))
        btnSIMV.setBackgroundColor(resources.getColor(R.color.blue_dark))
        typeVent = "CMV"
    }
    fun chooseSIMV(view: View) {
        btnSIMV.setBackgroundColor(resources.getColor(R.color.blue_light))
        btnCMV.setBackgroundColor(resources.getColor(R.color.blue_dark))
        typeVent = "SIMV"
    }

    fun callNext(view: View) {
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

    fun plusVolume(view: View) {
        val tvVolumen: TextView = findViewById(R.id.tvVolumeValue)
        Volumen += 100

        if (Volumen > 2000){
            Volumen = 2000
        }
        tvVolumen.text = Volumen.toString()
    }
    fun minusVolume(view: View) {
        val tvVolumen: TextView = findViewById(R.id.tvVolumeValue)
        Volumen -= 100

        if (Volumen < 100){
            Volumen = 100
        }
        tvVolumen.text = Volumen.toString()
    }
    fun plusFlow(view: View) {
        val tvFlow: TextView = findViewById(R.id.tvFlowValue)
        FlujoPico += 5

        if (FlujoPico > 60){
            FlujoPico = 60
        }

        tvFlow.text = FlujoPico.toString()
    }
    fun minusFlow(view: View) {
        val tvFlow: TextView = findViewById(R.id.tvFlowValue)
        FlujoPico -= 5

        if (FlujoPico < 10){
            FlujoPico = 10
        }

        tvFlow.text = FlujoPico.toString()
    }
    fun plusFrequency(view: View) {
        val tvFrequency: TextView = findViewById(R.id.tvFrequencyValue)
        FrecuenciaRespiratoria +=5

        if (FrecuenciaRespiratoria > 60){
            FrecuenciaRespiratoria = 60
        }
        tvFrequency.text = FrecuenciaRespiratoria.toString()
    }
    fun minusFrequency(view: View) {
        val tvFrequency: TextView = findViewById(R.id.tvFrequencyValue)
        FrecuenciaRespiratoria -=5

        if (FrecuenciaRespiratoria < 5){
            FrecuenciaRespiratoria = 5
        }
        tvFrequency.text = FrecuenciaRespiratoria.toString()
    }
    fun plusPeep(view: View) {}
    fun minusPeep(view: View) {}
    fun plusPlateu(view: View) {}
    fun minusPlateu(view: View) {}
    fun plusFio2(view: View) {}
    fun minusFio2(view: View) {}
    fun plusPerfil(view: View) {}
    fun minusPerfil(view: View) {}
}