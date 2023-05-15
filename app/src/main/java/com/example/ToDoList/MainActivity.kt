package com.example.ToDoList
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.loyaltyy.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
// entity - table
// dao - queries
// database
class MainActivity : AppCompatActivity() {
    private lateinit var database: myDatabase
    lateinit var btnAddTask:Button
    lateinit var btnDelete:Button
    lateinit var recycler_view:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        database = Room.databaseBuilder(
            applicationContext,myDatabase::class.java,"To_Do"
        ).build()
        btnAddTask = findViewById(R.id.mBtnAddTask)
        btnDelete = findViewById(R.id.mBtnDeleteAll)
        recycler_view = findViewById(R.id.recycler_view)

        btnAddTask.setOnClickListener {
            val intent=Intent(this,AddTaskActivity::class.java)
            startActivity(intent)
        }
        btnDelete.setOnClickListener {
            DataObject.deleteAll()
            GlobalScope.launch {
                database.dao().deleteAll()
            }
            setRecycler()
        }

        setRecycler()

    }
    fun setRecycler(){
        recycler_view.adapter=Adapter(DataObject.getAllData())
        recycler_view.layoutManager=LinearLayoutManager(this)
    }
}