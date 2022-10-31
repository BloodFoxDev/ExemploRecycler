package senac.com.example.exemplorecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.math.BigDecimal

class FormularioProdutoActivity : AppCompatActivity(R.layout.activity_formulario_produto) {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
        val bs = findViewById<Button>(R.id.btnsalvar)
        bs.setOnClickListener{
            val cnome: EditText = findViewById<EditText>(R.id.descricao)
            val nome = cnome.text.toString()
            val citens = findViewById<EditText>(R.id.itens)
            val itens = citens.text.toString()
            val valoremtexto = findViewById<EditText>(R.id.valor).text.toString()
            val valor = if(valoremtexto.isBlank()){
                BigDecimal.ZERO
            } else {
                BigDecimal(valoremtexto)
            }
            val produtonovo= Produto(nome,itens,valor)
            Log.i("ola","ola $nome")

        }
        }

    }
