package com.amooose.Calorie_Center.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import android.graphics.Color
import android.graphics.DashPathEffect
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineDataSet
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import android.content.Context
import android.graphics.Canvas
import android.util.DisplayMetrics
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import com.amooose.Calorie_Center.*
import com.amooose.Calorie_Center.helpers.DateValueFormatter
import com.amooose.Calorie_Center.helpers.GraphHelper
import com.amooose.Calorie_Center.model.SharedViewModel
import com.github.mikephil.charting.components.MarkerView
import com.github.mikephil.charting.highlight.Highlight
import org.json.JSONObject


/**
 * A simple [Fragment] subclass.
 */
class Track : Fragment() {
    private lateinit var viewModel: SharedViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(
            R.layout.fragment_track,
            container, false
        )


        return view
    }}




