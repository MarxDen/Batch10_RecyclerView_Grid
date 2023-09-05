package de.syntax.batch10_recyclerview_grid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.syntax.batch10_recyclerview_grid.adapter.VacationAdapter
import de.syntax.batch10_recyclerview_grid.data.DataSource
import de.syntax.batch10_recyclerview_grid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val vacations = DataSource().loadVacations()
        val recView = binding.recVacation

        recView.adapter = VacationAdapter(this, vacations)
        recView.setHasFixedSize(true)


    }
}