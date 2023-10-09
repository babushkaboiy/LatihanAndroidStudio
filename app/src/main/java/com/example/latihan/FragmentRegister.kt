package com.example.latihan

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class FragmentRegister : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button: Button = view.findViewById(R.id.btn_login)
        button.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn_login -> {
                val username = view?.findViewById<EditText>(R.id.edt_username)
                val password = view?.findViewById<EditText>(R.id.edt_password)
                val confirmPassword = view?.findViewById<EditText>(R.id.edt_confirm_password)

                if (password?.text.toString() != confirmPassword?.text.toString()) {
                    confirmPassword?.error = "Pasword Tidak Sama"
                } else {
                    val intent = Intent(requireActivity(), MainActivity::class.java)
                    intent.putExtra(MainActivity.USERNAME, username?.text.toString())
                    intent.putExtra(MainActivity.PASSWORD, password?.text.toString())
                    startActivity(intent)
                }
            }
        }
    }
}