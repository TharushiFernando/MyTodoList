package br.edu.satc.todolistbase.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018Be\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\b\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\tH\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lbr/edu/satc/todolistbase/data/ToDoItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lbr/edu/satc/todolistbase/data/ToDoItemAdapter$ViewHolder;", "dataSet", "Ljava/util/ArrayList;", "Lbr/edu/satc/todolistbase/roomdatabase/ToDoItem;", "Lkotlin/collections/ArrayList;", "itemOnClick", "Lkotlin/Function2;", "", "", "itemOnChecked", "", "itemOnDelete", "Lkotlin/Function1;", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ToDoItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<br.edu.satc.todolistbase.data.ToDoItemAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<br.edu.satc.todolistbase.roomdatabase.ToDoItem> dataSet = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<java.lang.Integer, br.edu.satc.todolistbase.roomdatabase.ToDoItem, kotlin.Unit> itemOnClick = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function2<java.lang.Boolean, br.edu.satc.todolistbase.roomdatabase.ToDoItem, kotlin.Unit> itemOnChecked = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<br.edu.satc.todolistbase.roomdatabase.ToDoItem, kotlin.Unit> itemOnDelete = null;
    
    public ToDoItemAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<br.edu.satc.todolistbase.roomdatabase.ToDoItem> dataSet, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super br.edu.satc.todolistbase.roomdatabase.ToDoItem, kotlin.Unit> itemOnClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super br.edu.satc.todolistbase.roomdatabase.ToDoItem, kotlin.Unit> itemOnChecked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super br.edu.satc.todolistbase.roomdatabase.ToDoItem, kotlin.Unit> itemOnDelete) {
        super();
    }
    
    /**
     * Nosso Adapter irá criar alguns view holders para exibir os dados dos itens em nossa lista.
     * Para cada view que ele criar na tela em formato de lista ele passará aqui.
     * Precisamos informar para ele qual é o layout que precisa ser criado na tela.
     */
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public br.edu.satc.todolistbase.data.ToDoItemAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup viewGroup, int viewType) {
        return null;
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
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    br.edu.satc.todolistbase.data.ToDoItemAdapter.ViewHolder holder, int position) {
    }
    
    /**
     * em getItemCount precisamos informar ao nosso RecyclerView.Adapter (classe pai) quantos
     * items existem em nossa lista
     */
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    /**
     * RecyclerView.ViewHolder responsável por "guardar" as referências das views
     * de cada item de nossa lista. Assim podemos usar essas referências para
     * preencher com dados quando a lista está sendo carregada.
     *
     * Aqui devemos usar findViewById para referenciar os itens em rv_item.xml
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Lbr/edu/satc/todolistbase/data/ToDoItemAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "btnDelete", "Landroid/widget/Button;", "getBtnDelete", "()Landroid/widget/Button;", "setBtnDelete", "(Landroid/widget/Button;)V", "cbComplete", "Landroid/widget/CheckBox;", "getCbComplete", "()Landroid/widget/CheckBox;", "setCbComplete", "(Landroid/widget/CheckBox;)V", "rvDescription", "Landroid/widget/TextView;", "getRvDescription", "()Landroid/widget/TextView;", "setRvDescription", "(Landroid/widget/TextView;)V", "rvTitle", "getRvTitle", "setRvTitle", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView rvDescription;
        @org.jetbrains.annotations.NotNull
        private android.widget.TextView rvTitle;
        @org.jetbrains.annotations.NotNull
        private android.widget.CheckBox cbComplete;
        @org.jetbrains.annotations.NotNull
        private android.widget.Button btnDelete;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getRvDescription() {
            return null;
        }
        
        public final void setRvDescription(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getRvTitle() {
            return null;
        }
        
        public final void setRvTitle(@org.jetbrains.annotations.NotNull
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.CheckBox getCbComplete() {
            return null;
        }
        
        public final void setCbComplete(@org.jetbrains.annotations.NotNull
        android.widget.CheckBox p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.Button getBtnDelete() {
            return null;
        }
        
        public final void setBtnDelete(@org.jetbrains.annotations.NotNull
        android.widget.Button p0) {
        }
    }
}