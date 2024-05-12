package br.edu.satc.todolistbase

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.room.Room
import br.edu.satc.todolistbase.roomdatabase.AppDatabase
import br.edu.satc.todolistbase.roomdatabase.ToDoItem

private lateinit var db: AppDatabase

class CreateUpdateToDoItemActivity : AppCompatActivity() {

    private lateinit var taskTitle: EditText
    private lateinit var taskDescription: EditText
    private lateinit var btSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create_update_to_do_item)

        initDatabase()

        taskTitle = findViewById(R.id.task_title)
        taskDescription = findViewById(R.id.task_description)
        btSave = findViewById(R.id.bt_save)


        btSave.setOnClickListener {
            save()
        }
    }

    private fun save(){
        val toDoItem = ToDoItem(
            null,
            taskDescription.text.toString(),
            taskTitle.text.toString(),
            false
        )

        db.toDoItemDao().insertAll(toDoItem)

        Toast.makeText(this, "Task criada com sucesso", Toast.LENGTH_SHORT).show()

        finish()
    }

    private fun initDatabase() {
        // Inicializar nosso banco de dados Android Room Persistence com SQLITE
        db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-todolist"
        )
            .allowMainThreadQueries()
            .build()

    }

}