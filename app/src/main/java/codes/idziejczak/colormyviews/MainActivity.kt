package codes.idziejczak.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

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
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText, rootConstraintLayout)
        clickableViews.forEach {item ->
            item.setOnClickListener { makeColored(it) }
        }
    }
}