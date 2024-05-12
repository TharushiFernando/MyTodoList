package br.edu.satc.todolistbase.roomdatabase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\'J!\u0010\u000b\u001a\u00020\u00032\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\r\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005H\'\u00a8\u0006\u0011"}, d2 = {"Lbr/edu/satc/todolistbase/roomdatabase/ToDoItemDao;", "", "delete", "", "item", "Lbr/edu/satc/todolistbase/roomdatabase/ToDoItem;", "getAll", "", "getToDoItem", "uid", "", "insertAll", "items", "", "([Lbr/edu/satc/todolistbase/roomdatabase/ToDoItem;)V", "updateToDoItems", "vararg", "app_debug"})
@androidx.room.Dao
public abstract interface ToDoItemDao {
    
    /**
     * Esta interface define os métodos de comunicação com o banco de dados usando SQL
     * Crie métodos de insert, update e delete conforme as regras de negócio da App
     *
     * Monte a lógica SQL usando a declaração @Query e utilize parâmetros conforme os exemplos
     */
    @androidx.room.Query(value = "SELECT * FROM todoitens WHERE uid = :uid")
    @org.jetbrains.annotations.NotNull
    public abstract br.edu.satc.todolistbase.roomdatabase.ToDoItem getToDoItem(@org.jetbrains.annotations.NotNull
    java.lang.String uid);
    
    @androidx.room.Query(value = "SELECT * FROM todoitens")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<br.edu.satc.todolistbase.roomdatabase.ToDoItem> getAll();
    
    @androidx.room.Insert
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    br.edu.satc.todolistbase.roomdatabase.ToDoItem... items);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    br.edu.satc.todolistbase.roomdatabase.ToDoItem item);
    
    @androidx.room.Update
    public abstract void updateToDoItems(@org.jetbrains.annotations.NotNull
    br.edu.satc.todolistbase.roomdatabase.ToDoItem vararg);
}