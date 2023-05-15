package com.example.ToDoList

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.room.Room
import com.example.loyaltyy.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class UpdateTaskActivity : AppCompatActivity() {
    private lateinit var database: myDatabase
    lateinit var edtUpdateTask:EditText
    lateinit var edtTaskPriority:EditText
    lateinit var btnDelete:Button
    lateinit var btnUpdateTask:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        database = Room.databaseBuilder(
            applicationContext,myDatabase::class.java,"To_Do"
        ).build()
        edtUpdateTask = findViewById(R.id.mEdtUpdateTaskDetails)
        edtTaskPriority = findViewById(R.id.mEdtUpdateTaskPriority)
        btnDelete = findViewById(R.id.mBtnDeleteTask)
        btnUpdateTask = findViewById(R.id.mBtnUpdateTask)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_task)
        val pos=intent.getIntExtra("id",-1)
        if(pos!=-1)
        {
            val title=DataObject.getData(pos).title
            val priority=DataObject.getData(pos).priority
            edtUpdateTask.setText(title)
            edtTaskPriority.setText(priority)

            btnDelete.setOnClickListener {
                DataObject.deleteData(pos)
                GlobalScope.launch {
                    database.dao().deleteTask(
                        Entity(pos+1,edtUpdateTask.text.toString(),edtTaskPriority.text.toString())
                    )
                }
                myIntent()
            }

            btnUpdateTask.setOnClickListener {
                DataObject.updateData(
                    pos,
                    edtUpdateTask.text.toString(),
                    edtTaskPriority.text.toString()
                )
                GlobalScope.launch {
                    database.dao().updateTask(
                        Entity(
                            pos+1,edtUpdateTask.text.toString(),
                            edtTaskPriority.text.toString()
                        )
                    )
                }
                myIntent()
            }
        }
    }
    fun myIntent(){
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}