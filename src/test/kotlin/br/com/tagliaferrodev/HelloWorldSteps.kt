package br.com.tagliaferrodev

import io.cucumber.java8.Pt
import junit.framework.Assert.assertEquals

class HelloWorldSteps : Pt {
    init {
        loadSteps()
    }

    private fun loadSteps(){
        Dado("que eu insira meu {string}") { cpf: String ->
            loadDado(cpf)
        }
        E("clique no botao enviar") {
            loadE()
        }
        Entao("meu {string} sera exibido") { cpf: String ->
            loadEntao(cpf)
        }
    }

    private fun loadDado(cpf: String){
        println(cpf)
    }

    private fun loadE(){
        println("Enviando")
    }

    private fun loadEntao(cpf: String){
        println(cpf)
        assertEquals("12345678910", cpf)
    }
}