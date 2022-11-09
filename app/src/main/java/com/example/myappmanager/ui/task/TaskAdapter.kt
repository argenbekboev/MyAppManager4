package com.example.myappmanager.ui.task

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myappmanager.data.TaskModel
import com.example.myappmanager.databinding.ItemTaskBinding

class TaskAdapter : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    private var tasks = arrayListOf<TaskModel>()

    inner class TaskViewHolder(private val binding: ItemTaskBinding) :
            RecyclerView.ViewHolder(binding.root) {
                fun bind(){
                    val item = tasks[adapterPosition]
                    binding.etTitle.text = item.title
                    binding.etDescription.text = item.description
                }

            }
    fun addTask(task:TaskModel){
        tasks.add(0,task)
        notifyItemChanged(0)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(ItemTaskBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind()
        if (position % 2 == 0) {
            holder.itemView.setBackgroundColor(Color.GRAY)
        } else {
            holder.itemView.setBackgroundColor(Color.WHITE)
        }
    }
    override fun getItemCount(): Int = tasks.size
}

