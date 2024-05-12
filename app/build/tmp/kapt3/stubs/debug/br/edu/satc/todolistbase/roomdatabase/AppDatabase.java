package br.edu.satc.todolistbase.roomdatabase;

/**
 * O código abaixo define uma classe AppDatabase para armazenar o banco de dados.
 * A classe AppDatabase define a configuração do banco de dados e serve como o ponto de acesso
 * principal do app aos dados persistidos.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lbr/edu/satc/todolistbase/roomdatabase/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "toDoItemDao", "Lbr/edu/satc/todolistbase/roomdatabase/ToDoItemDao;", "app_debug"})
@androidx.room.Database(entities = {br.edu.satc.todolistbase.roomdatabase.ToDoItem.class}, version = 1)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract br.edu.satc.todolistbase.roomdatabase.ToDoItemDao toDoItemDao();
}