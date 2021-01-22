package com.example.bonus

import android.os.Bundle
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var name: String
    private lateinit var age: String
    private lateinit var url: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        name = view.findViewById(R.id.nameText)
        age = view.findViewById(R.id.ageText)
        url = view.findViewById(R.id.imageView)

        val savedTextName: String? = sharedPref.getString("Name", "")
        val savedTextAge: String? = sharedPref.getString("Age", "")
        val savedTextUrl: String? = sharedPref.getString("Url", "")

        name = savedTextName.toString()
        age = savedTextAge.toString()
        url = savedTextUrl.toString()





    }

}