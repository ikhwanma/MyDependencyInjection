package ikhwan.binar.mydependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var student: Student

    @Inject
    lateinit var teacherName: String



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_add.setOnClickListener {
            val result = student.hitungJumlah(
                et_angka1.text.toString().toInt(),
                et_angka2.text.toString().toInt()
            ).toString()

            tv_name.text = "Nilai : $result"
        }
    }
}