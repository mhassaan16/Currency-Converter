package com.app.currencyconverter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.currencyconverter.adapters.ConvertedCurrenciesAdapter
import com.app.currencyconverter.databinding.ActivityHomeBinding
import com.app.currencyconverter.models.CurrencyConverter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    @Inject
    lateinit var convertedCurrenciesAdapter: ConvertedCurrenciesAdapter
    private var currencyValueList: MutableList<CurrencyConverter> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setClickListeners()
        setRecyclerView()
    }

    private fun setClickListeners() {
        binding.cardSelectedCurrency.setOnClickListener {
            startActivity(Intent(this, SelectCurrencyActivity::class.java))
        }
    }

    private fun setRecyclerView() {
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        currencyValueList.add(CurrencyConverter("🇵🇰", "PKR", 226.5))
        binding.rvConvertedCurrencies.also {
            convertedCurrenciesAdapter = ConvertedCurrenciesAdapter()
            it.adapter = convertedCurrenciesAdapter
            convertedCurrenciesAdapter.setList(currencyValueList)
            it.addItemDecoration(
                GridSpacingItemDecoration(
                    3,
                    100,
                    true
                )
            )
        }
    }
}