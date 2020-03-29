package com.example.leandro_barbosa_at

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        var fazeEscolha = intent.getIntExtra("fazeEscolha", 0)

        if (fazeEscolha == 6){
            textViewEvento.text = "Ao bater com sua espada no escudo o corpo da besta se distorçe com o barulho e ela grita de dor colocando suas maos em sua cabeça proximo" +
                    " de onde deveriam ser aparentemente seus ouvidos voce aproveita a deixa e taca a espada como uma lança em seus olhos ficando metade da espada no local" +
                    " a criatura grita mais ainda de dor  balancando sua cabeça para os lados fazendo um enorme barulho de doer os ouvidos contudo voce não perde a oportunidade" +
                    " segura firme seu escudo coloco o outro braço atras para dar mais rigidez e corre em direção da mesma gritando para a criatura designar seu olho a voce" +
                    " então então voce pula para frente e bate com o escudo no cabo da fazendo ela entrar por inteiro atravessando-a, a criatura cai morta e voce retira sua espada" +
                    " com aquele sangue de cor esverdiada e corta sua cabeça para levar em direção a escola, voce sobrevive o restos das noites evitando conflitos e finalmente chega" +
                    " a tão esperada escola os raios de sol iluminam seu caminho e os fracos ventos gelados refrescam seu corpo cansado, dali começa uma nova jornada com novos desafios"
        }else if (fazeEscolha == 8){
            textViewEvento.text = "Seu braço esta machucado não seria bom depender dele, então lhe resta apenas uma escolha, voce puxa sua espada para tras cortando" +
                    " mais ainda o pescoço da criatando fazendo um tipo de serra, voce usa toda sua forma e tudo que lhe sobrou naquele instante era tudo ou nada, entao..." +
                    " apos o ato as garras da criatura param bem na frente de seu peito apenas alguns pequenos centrimos quem sabe o teria acontecido se voce esperasse mais" +
                    " alguns pequneos milesimos, logo a criatura chega finalmente ao seu duvido lugar, no inferno a criatura cai morta e voce retira sua espada" +
                    " com aquele sangue de cor esverdiada e corta sua cabeça para levar em direção a escola, voce sobrevive o restos das noites evitando conflitos e finalmente chega" +
                    " a tão esperada escola os raios de sol iluminam seu caminho e os fracos ventos gelados refrescam seu corpo cansado, dali começa nova jornada com novos desafios"
        }else if (fazeEscolha == 10){
            textViewEvento.text = "No momento certo voce desfere sua estocada para a criatura...sua espada atravessa seu enorme olho e para ter certeza que ela morreu" +
                    " voce gira o cabo da sua espada para a direita com forca rotacionando sua espada dentro do olho a criatura cai morta e voce retira sua espada" +
                    " com aquele sangue de cor esverdiada e corta sua cabeça para levar em direção a escola, voce sobrevive o restos das noites evitando conflitos e finalmente chega" +
                    " a tão esperada escola os raios de sol iluminam seu caminho e os fracos ventos gelados refrescam seu corpo cansado, dali começa nova jornada com novos desafios"

        }else {
            textViewEvento.text = "nenhum final encontrado para essa opção"
        }

    }

}
