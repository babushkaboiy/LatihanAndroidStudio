package com.example.latihan

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class LoginFragment : Fragment(), View.OnClickListener {

    private lateinit var edtPassword: EditText
    private lateinit var edtUsername: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        edtUsername = view.findViewById<EditText>(R.id.edt_username_login)
        edtPassword = view.findViewById<EditText>(R.id.edt_username_login)
        val btnLogin = view.findViewById<Button>(R.id.btn_login)

        btnLogin.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btn_login -> {
                val username = edtUsername.text.toString()
                val password = edtPassword.text.toString()

                val intent = Intent(requireActivity(), MainActivity::class.java)
                intent.putExtra(MainActivity.USERNAME, username)
                intent.putExtra(MainActivity.PASSWORD, password)
                startActivity(intent)
            }
        }
    }
}