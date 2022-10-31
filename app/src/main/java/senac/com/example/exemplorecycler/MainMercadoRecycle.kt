package senac.com.example.exemplorecycler
/*
modelo app mercado para discutirmos a questão do objeto RECYCLEVIEWER que é uma ferramenta
do jetpack muito utilizada em projetos
* */


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView

import java.math.BigDecimal

class MainMercadoRecycle : AppCompatActivity() {
    val TAG="Ciclo de Vida:===>"
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, ":ON-CREATE")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.telamercadorecycle)
        val listavisualizadora = findViewById<RecyclerView>(R.id.reciclador)
        listavisualizadora.adapter = ListaProdutosAdapter(this, produtos = listOf(
            Produto(nome="Cesta Vale Nigth",
                    descricao = "Vinho, paes queijos e etc",
                    valor = BigDecimal("121.12")
        ),
            Produto(nome="Cesta Vale Nigth2",
                descricao = "Vinho e agua",
                valor = BigDecimal("34.02")
        ),
                Produto(nome="Cesta Vale Nigth3",
            descricao = "Vinho, agua , sal grosso e limão",
            valor = BigDecimal("98.02")
        ),
            Produto(nome="Cesta Vale Nigth13",
                descricao = "Vinho, agua , sal grosso e limão",
                valor = BigDecimal("98.02")
            ),
                    Produto(nome="Cesta Vale Nigth23",
            descricao = "Vinho, agua , sal grosso e limão",
            valor = BigDecimal("98.02")
        ),
            Produto(nome="Cesta Vale Nigth123",
            descricao = "Vinho, agua , sal grosso e limão",
            valor = BigDecimal("98.02")
        )
        )
        )}
    }
