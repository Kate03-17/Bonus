package com.example.bonus

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class EditProfileFragment : Fragment(R.layout.fragment_edit_profile) {


    private lateinit var editTextName: EditText
    private lateinit var editTextAge: EditText
    private lateinit var editTextUrl: EditText

    private lateinit var saveButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        editTextName = view.findViewById(R.id.editTextName)
        editTextAge = view.findViewById(R.id.editTextAge)
        editTextUrl = view.findViewById(R.id.editTextUrl)

        saveButton = view.findViewById(R.id.saveButton)


        val sharedPref: SharedPreferences = getSharedPreferences("MyNote", Context.MODE_PRIVATE)
//        val savedTextName: String? = sharedPref.getString("Name", "")
//        val savedTextAge: String? = sharedPref.getString("Age", "")
//        val savedTextUrl: String? = sharedPref.getString("Url", "")

        saveButton.setOnClickListener {

            if (!editTextName.toString().isEmpty()){

                val textName: String = editTextName.text.toString()
                sharedPref.edit().putString("Name", textName).apply()

                editTextName.setText("")

            }

            if (!editTextAge.toString().isEmpty()){

                val textAge: String = editTextAge.text.toString()
                sharedPref.edit().putString("Age", textAge).apply()

                editTextAge.setText("")

            }
            if (!editTextUrl.toString().isEmpty()) {

                val textUrl: String = editTextUrl.text.toString()
                sharedPref.edit().putString("Url", textUrl).apply()

                editTextUrl.setText("")
            }


        }



    }
}