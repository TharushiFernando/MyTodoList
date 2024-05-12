package br.edu.satc.todolistbase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lbr/edu/satc/todolistbase/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "db", "Lbr/edu/satc/todolistbase/roomdatabase/AppDatabase;", "toDoItemAdapter", "Lbr/edu/satc/todolistbase/data/ToDoItemAdapter;", "toDoItemList", "Ljava/util/ArrayList;", "Lbr/edu/satc/todolistbase/roomdatabase/ToDoItem;", "Lkotlin/collections/ArrayList;", "initDatabase", "", "initRecyclerViewAdapter", "loadData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull
    private java.lang.String TAG = "MainActivity";
    private br.edu.satc.todolistbase.roomdatabase.AppDatabase db;
    private java.util.ArrayList<br.edu.satc.todolistbase.roomdatabase.ToDoItem> toDoItemList;
    private br.edu.satc.todolistbase.data.ToDoItemAdapter toDoItemAdapter;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    /**
     * Inicializa o banco de dados.
     * Instancia AppDatabase passando o nome do banco que queremos abrir.
     * É importante lembrarmos que abrir e fechar um banco de dados é algo custoso.
     * Portanto deixamos esse banco aberto enquanto queremos usar para insert, update, read, delete.
     *
     * Com o database iniciado temos acesso a interface DAO que disponibilza os metodos de
     * interação com o banco de dados para ler, inserir ou atualizar dados.
     */
    private final void initDatabase() {
    }
    
    /**
     * Aqui iniciamos a nossa lista de itens que irá aparecer em tela.
     * Pegamos a referência da RecyclerView em nosso arquivo de layout
     * Criamos o adapter
     * Inicializamos a lista de items (ArrayList)
     * Atribuímos a lista ao adapter e o adapter ao nosso RecyclerView
     */
    private final void initRecyclerViewAdapter() {
    }
    
    private final void loadData() {
    }
}