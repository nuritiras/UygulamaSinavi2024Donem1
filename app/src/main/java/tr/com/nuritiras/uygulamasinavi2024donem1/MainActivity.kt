package tr.com.nuritiras.uygulamasinavi2024donem1

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val computerPrice = ArrayList<Double>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textAdet = findViewById<TextView>(R.id.textCount)
        val switchKdv = findViewById<Switch>(R.id.switchKdv)
        val buttonEkle = findViewById<Button>(R.id.buttonAdd)

        buttonEkle.setOnClickListener {

            try {
                val cpu = findViewById<EditText>(R.id.editTextCpu).text.toString()
                val ram = findViewById<EditText>(R.id.numberRam).text.toString().toInt()
                val price = findViewById<EditText>(R.id.decimalPrice).text.toString().toDouble()
                val computer = Computer(cpu, ram, price)

                if (switchKdv.isChecked) computer.calculateKdv()

                computerPrice.add(computer.price)
                textAdet.setText("Adet: ${computerPrice.size}")
            }
            catch (e: Exception) {
                Log.e("Hata", e.toString())
                Toast.makeText(this, "Lütfen bilgileri eksiksiz olarak giriniz.", Toast.LENGTH_SHORT).show()
            }

        }

    }

    fun onClickCalculate(view: View) {

        var total = 0.0
        val editTextToplamTl = findViewById<EditText>(R.id.totalTl)
        val editTextToplamDolar = findViewById<EditText>(R.id.totalDolar)

        for (price in computerPrice) {
            total += price
        }

        editTextToplamDolar.setText(total.toString())
        editTextToplamTl.setText((convertTl(total)).toString())

    }

    fun convertTl(price: Double): Double {
        return price * 35.22
    }

}