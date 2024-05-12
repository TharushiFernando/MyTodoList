package br.edu.satc.todolistbase.data

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.satc.todolistbase.R
import br.edu.satc.todolistbase.roomdatabase.ToDoItem

class ToDoItemAdapter (
    private val dataSet: ArrayList<ToDoItem>,
    private val itemOnClick: (Int, ToDoItem) -> Unit,
    private val itemOnChecked: (Boolean, ToDoItem) -> Unit,
    private val itemOnDelete: (ToDoItem) -> Unit,
) : RecyclerView.Adapter<ToDoItemAdapter.ViewHolder>() {

    /**
     * Nosso Adapter irá criar alguns view holders para exibir os dados dos itens em nossa lista.
     * Para cada view que ele criar na tela em formato de lista ele passará aqui.
     * Precisamos informar para ele qual é o layout que precisa ser criado na tela.
     */
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.rv_item, viewGroup, false)
        return ViewHolder(view)
    }

    /**
     * onBindViewHolder será chamado sempre que nosso RecyclerView.Adapter estiver "carregando dados"
     * de nossa lista para uma posição do Recycler View que está na tela.
     * Lembrando do conceito de Recycler View, ele reaproveita as views na tela, apenas carregando
     * o conteúdo da view novamente, sem precisar recarregar toda a view.
     *
     * Sempre que é disparado ele fornece um position: Int para sabermos qual item está sendo carregado.
     * Também fornece o ViewHolder que conhece as referências das views para preenchermos com dados ou
     * ler informações, disparos de clicks, etc.
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        // Pegamos o item em nossa lista que deve ser "montado" nessa view
        var toDoItem: ToDoItem = dataSet[position]

        // Preenchemos os dados desse item na tela
        holder.rvTitle.text = toDoItem.title
        holder.cbComplete.isChecked = toDoItem.complete == true
        holder.rvDescription.text = toDoItem.description

        //Pega quando o checkBox tá checado
        holder.cbComplete.setOnCheckedChangeListener { _, isChecked ->
            itemOnChecked(isChecked, toDoItem)
        }

        // Declaramos um listener para pegarmos o evento de click na lista
        holder.itemView.setOnClickListener {
            /**
             * itemOnClick é uma var da class ToDoItemAdapter que precisamos instanciar e passar
             * durante a criação desta classe. Quando o click ocorre, chamaos o método itemOnClick.
             * Isso serve para que o click do item possa ser tratado na Classe Activity que criou
             * o nosso Adapter.
              */
            itemOnClick(position, toDoItem)
        }

        holder.btnDelete.setOnClickListener {
            val item = dataSet[position]
            itemOnDelete(item) // Chama a função de exclusão de itens
        }
    }

    /**
     * em getItemCount precisamos informar ao nosso RecyclerView.Adapter (classe pai) quantos
     * items existem em nossa lista
     */
    override fun getItemCount(): Int {
        return dataSet.size
    }

    /**
     * RecyclerView.ViewHolder responsável por "guardar" as referências das views
     * de cada item de nossa lista. Assim podemos usar essas referências para
     * preencher com dados quando a lista está sendo carregada.
     *
     * Aqui devemos usar findViewById para referenciar os itens em rv_item.xml
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var rvDescription: TextView
        var rvTitle: TextView
        var cbComplete: CheckBox
        var btnDelete: Button

        init {
            cbComplete = view.findViewById(R.id.cb_complete)
            rvTitle = view.findViewById(R.id.rv_title)
            rvDescription = view.findViewById(R.id.rv_description)
            btnDelete = view.findViewById(R.id.btnDelete)
        }
    }
}