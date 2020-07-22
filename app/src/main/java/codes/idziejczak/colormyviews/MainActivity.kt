package codes.idziejczak.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.ic_baseline_accessibility_new_24)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.ic_baseline_add_box_24)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.ic_baseline_check_24)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.ic_baseline_desktop_windows_24)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.ic_baseline_done_all_24)
            R.id.box_six_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_seven_text -> view.setBackgroundColor(Color.RED)
            R.id.box_eight_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_nine_text -> view.setBackgroundColor(Color.DKGRAY)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)
        val boxEightText = findViewById<TextView>(R.id.box_eight_text)
        val boxNineText = findViewById<TextView>(R.id.box_nine_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, boxSixText, boxSevenText, boxEightText, boxNineText, rootConstraintLayout)
        clickableViews.forEach {item ->
            item.setOnClickListener { makeColored(it) }
        }
    }
}