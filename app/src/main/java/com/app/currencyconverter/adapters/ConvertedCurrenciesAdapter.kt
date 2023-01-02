package com.app.currencyconverter.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.currencyconverter.databinding.ItemConvertedCurrencyBinding
import com.app.currencyconverter.models.CurrencyConverter
import javax.inject.Inject


class ConvertedCurrenciesAdapter @Inject constructor(

) : RecyclerView.Adapter<ConvertedCurrenciesAdapter.CovidViewHolder>() {

    private var userGroupsList: MutableList<CurrencyConverter> = mutableListOf()

    class CovidViewHolder private constructor(private val binding: ItemConvertedCurrencyBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            position: Int,
            holder: CovidViewHolder,
            item: CurrencyConverter,
        ) {

            binding.tvFlagCode.text = item.flagCode
            binding.tvCurrencyCode.text = item.currencyCode
            binding.tvCurrencyValue.text = item.currencyValue.toString()

        }

        companion object {
            fun from(parent: ViewGroup): CovidViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = ItemConvertedCurrencyBinding.inflate(layoutInflater, parent, false)
                return CovidViewHolder(binding)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CovidViewHolder {
        return CovidViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: CovidViewHolder, position: Int) {
        holder.setIsRecyclable(false)
        val item = userGroupsList[position]
        item.let { holder.bind(position, holder, item) }
    }

    override fun getItemCount(): Int {
        return userGroupsList.size
    }


    fun setList(
        list: MutableList<CurrencyConverter>
    ) {
        this.userGroupsList = list
        notifyDataSetChanged()
    }
}