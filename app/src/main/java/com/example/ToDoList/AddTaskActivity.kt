package com.example.ToDoList

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.room.Room
import com.example.loyaltyy.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class AddTaskActivity : AppCompatActivity() {
    private lateinit var database: myDatabase
    lateinit var btnSave:Button
    lateinit var edtAddTask:EditText
    lateinit var edtTaskPriority:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)
        database = Room.databaseBuilder(
            applicationContext,myDatabase::class.java,"To_Do"
        ).build()
        btnSave = findViewById(R.id.mBtnSaveTask)
        edtAddTask = findViewById(R.id.mEdtTaskTitle)
        edtTaskPriority = findViewById(R.id.mEdtTaskPriority)

        btnSave.setOnClickListener {
            if (edtAddTask.text.toString().trim{it<=' '}.isNotEmpty()
                && edtTaskPriority.text.toString().trim{it<=' '}.isNotEmpty())
            {
                var title=edtAddTask.getText().toString()
                var priority=edtTaskPriority.getText().toString()
                DataObject.setData(title,priority)
                GlobalScope.launch {
                   database.dao().insertTask(Entity(0,title,priority))
                   Log.i("harsh",database.dao().getTasks().toString())
                }
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        }

    }
}