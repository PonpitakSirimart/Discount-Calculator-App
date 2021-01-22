package th.ac.su.ict.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var priceInput = findViewById<EditText>(R.id.EditPrice)
        var percentInput = findViewById<EditText>(R.id.EditPercent)
        var checkTAX = findViewById<CheckBox>(R.id.CheckBoxTAX)
        var calculateBut = findViewById<Button>(R.id.calculateButton)
        var showPrice = findViewById<TextView>(R.id.showPrice)


        calculateBut.setOnClickListener() {

            var price: Double = priceInput.text.toString().toDouble()
            var percent: Double = percentInput.text.toString().toDouble()

            if (checkTAX.isChecked){
                var sum = (price * percent)/100;
                var sumCom = price - sum;

                var plusVat = (sumCom * 7)/100;
                var plusSumAll = sumCom + plusVat;

                showPrice.text = plusSumAll.toString()

            } else {
                var sum = (price * percent)/100;
                var sumCom = price - sum;

                showPrice.text = sumCom.toString()
            }

        }
    }

}
