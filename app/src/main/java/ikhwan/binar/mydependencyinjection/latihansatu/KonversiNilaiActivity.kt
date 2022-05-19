package ikhwan.binar.mydependencyinjection.latihansatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import ikhwan.binar.mydependencyinjection.R
import kotlinx.android.synthetic.main.activity_konversi_nilai.*
import javax.inject.Inject


@AndroidEntryPoint
class KonversiNilaiActivity : AppCompatActivity() {

    @Inject
    lateinit var nilai : Nilai

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_nilai)

        btn_konversi.setOnClickListener {
            val res = nilai.convertToString(et_nilai.text.toString().toInt())

            tv_result.text = "Nilai : $res"
        }
    }
}