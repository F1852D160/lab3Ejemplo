package com.example.lab3ejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AbsListView
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val personasList = mutableListOf<Persona>(
            Persona("JOSE", "MORALES", "2313526"),
            Persona("MARIA", "FERNANDEZ", "2343551"),
            Persona("ELENA", "PEÑA", "2343559"),
            Persona("ADOLFO", "CHOQUE", "2343557"),
            Persona("RENE", "PEREZ", "2343554"),
            Persona("WENDY", "JIMENEZ", "2343552"),
            Persona("JHONNY", "COLQUE", "2341556")
        )
        val listView = findViewById<ListView>(R.id.listView)
        listView.choiceMode = AbsListView.CHOICE_MODE_MULTIPLE
//        val arrayAdapter = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_multiple_choice, personasList)
//        listView.adapter = arrayAdapter

        val personasAdapter = PersonasAdapter(applicationContext,personasList)
        listView.adapter = personasAdapter






//        listView.setOnItemClickListener { parent, view, position, id ->
//            val p = arrayAdapter.getItem(position)
//            Toast.makeText(applicationContext, "PERSONA SELECCIONADA: ${p?.nombre}", Toast.LENGTH_SHORT).show()
//        }

//        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
//            val seleccionados = listView.checkedItemPositions
//            for (i in 0 until seleccionados.size()) {
//                val checked = seleccionados.valueAt(i)
//                if (checked) {
//                    val positionSel = seleccionados.keyAt(i)
//                    val item = arrayAdapter.getItem(positionSel)
//                    Log.i("SELECCIONADOS" ," | ${item?.nombre} | ")
//
//                }
//            }
//        }

    }
}