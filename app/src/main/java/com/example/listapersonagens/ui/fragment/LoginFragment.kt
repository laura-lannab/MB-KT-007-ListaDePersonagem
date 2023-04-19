package com.example.listapersonagens.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.listapersonagens.R
import com.example.listapersonagens.databinding.FragmentLoginBinding
import com.example.listapersonagens.data.network.authentication.Authenticator
import com.example.listapersonagens.data.network.authentication.FirebaseAuthenticator


class LoginFragment : Fragment() {
    
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    //Princípio da inversão da dependência - O princípio da inversão da dependência declara que
    // nossas classes devem depender de interfaces ou de classes abstratas em vez de classes concretas e de funções.
    //A classe FirebaseAuthenticator foi substituída pela interface Authenticator, facilitando
    // futuras manutenções e diminuindo a propabilidade de erros. Caso exista outro authenticator
    // e seja necessário substituir aqui, ele será modificado somente na linha 29.
    private lateinit var authenticator: Authenticator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        authenticator = FirebaseAuthenticator
    }
    
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    private fun setupView() {
        with(binding) {
            btnLogin.setOnClickListener {
                val isLoggedIn = authenticator.login(tietEmail.text.toString(), tietPassword.text.toString())
                if (isLoggedIn)
                    findNavController().navigate(R.id.action_loginFragment_to_charactersFragment)
                else
                    Toast.makeText(requireContext(), "Usuário não encontrado.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}