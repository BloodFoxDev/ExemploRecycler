package senac.com.example.exemplorecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class ListaProdutosAdapter(
    private val context: Context,
    private val produtos: List<Produto>
) : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun vincula(produto: Produto) {
            val nome =   itemView.findViewById<TextView>(R.id.nome)
            nome.text= produto.nome
            val itens =   itemView.findViewById<TextView>(R.id.itens)
            itens.text= produto.descricao
            val valor =   itemView.findViewById<TextView>(R.id.valor)
            valor.text= produto.valor.toFloat().toString()


        }
    }


    // esta implementação oncreate ele vai criar o Viewholder que é a view que será abraçada
    // ele que mantema a view funcionando
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflador =  LayoutInflater.from(context)
        val view = inflador.inflate(R.layout.produto,parent,false)
        return ViewHolder(view)
            }


    // metodo que controla a posição do viewholder(view)  associando também uma posição inteira para
    // referência, isto para fikcar compativel com listas e estrutura de dados
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = produtos[position]
        holder.vincula(produto)
    }

    //  quantos itens quer apresentar dentro do recycler
    override fun getItemCount(): Int = produtos.size
    }






