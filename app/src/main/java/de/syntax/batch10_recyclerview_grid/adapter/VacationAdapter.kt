package de.syntax.batch10_recyclerview_grid.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import de.syntax.batch10_recyclerview_grid.data.model.Vacation
import de.syntax.batch10_recyclerview_grid.databinding.VacationItemBinding

class VacationAdapter(private val context: Context,private val dataSet : List<Vacation>) : RecyclerView.Adapter<VacationAdapter.VacationViewHolder>() {

    class VacationViewHolder(val binding: VacationItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VacationViewHolder {
        val binding = VacationItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return VacationViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: VacationViewHolder, position: Int) {
        val vacation = dataSet[position]
        holder.binding.imgVacation.setImageResource(vacation.drawable)
        holder.binding.tvVacation.text = context.resources.getString(vacation.stringResource)

        holder.binding.itemVacation.setOnClickListener {
            holder.binding.tvVacation.text = "Geklickt"
        }
    }
}