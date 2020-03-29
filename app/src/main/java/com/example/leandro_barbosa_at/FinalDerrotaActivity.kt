package com.example.leandro_barbosa_at

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.leandro_barbosa_at.ui.home.HomeFragment
import kotlinx.android.synthetic.main.activity_final_derrota.*

class FinalDerrotaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_derrota)
        var fazeEscolha = intent.getIntExtra("fazeEscolha", 0)

        if (fazeEscolha == 5){
            textViewEvento.text ="Apos seu ultimo pulo voce em seu desespero taca o escudo para a outra direção de uma forma que a criatura fique de costas para voce" +
                    "  e bem pensado ela cai na armadilha e corre em direção ao escudo assim que cai no chão mas nunca é ser confiante ingenuo e confiante como um novo aventureiro" +
                    " voce corre para as costas da besta sem perceber o seu terreno pisa em um pedaço de graveto atiçando a atenção da criatura em sua direção voce, tenta" +
                    " freiar mas e tarde suas garras ja tinham atravessado seu peito voce olha com dor para a aberração é com odio por não conseguir salvar seu povo morre" +
                    " servindo de alimento para uma besta"

        }else if (fazeEscolha == 7){
            textViewEvento.text = "Colocando sua outra mão no cabo da espada de forma veloz voce tenta cortar o pescoço da criatura, porem ao fazer força" +
                    " seu braço não estava em 100% devido a defesa inesperada que teve que fazer lhe fazendo sentir uma certa dor e quando voce percebe ja é tarde" +
                    " as garras afiadas da criatura atravessam seu peito saindo pelas suas costas, o tempo para, ali voce percebeu o quão cruel é o mundo" +
                    " contudo ao menos morre com um sorriso no rosto de alguem que ao menos morreu lutando pelo seu povo"

        }else if(fazeEscolha == 9){
            textViewEvento.text = "Assim entao a criatura se aproxima rapidamente e voce se prepara e disferece seu golpe lateral contudo, esquece que esta num corredor" +
                    " de árvores e sua espada bate na árvore e fica presa com seu braço esticado deixando sua guarda bem aberta, a besta então ao escutar esse barulho" +
                    " ataque seu braço com suas garras e corta seu braço fora voce cai de joelhos gritando de dor, a besta se aproxima de seu rosto e corta seu pescoço fazendo" +
                    " sua cabeça rolar"


        }else {
            textViewEvento.text = "nenhum final encontrado para essa opção"
        }
        btnRecomecar.setOnClickListener {

            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }


    }

}
