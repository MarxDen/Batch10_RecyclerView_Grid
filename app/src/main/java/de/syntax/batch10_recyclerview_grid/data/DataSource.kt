package de.syntax.batch10_recyclerview_grid.data

import de.syntax.batch10_recyclerview_grid.R
import de.syntax.batch10_recyclerview_grid.data.model.Vacation

class DataSource {
    fun loadVacations(): List<Vacation>{
        return listOf(
            Vacation(R.string.preis1, R.drawable.urlaub1),
            Vacation(R.string.preis2, R.drawable.urlaub2),
            Vacation(R.string.preis3, R.drawable.urlaub3),
            Vacation(R.string.preis4, R.drawable.urlaub4),
            Vacation(R.string.preis1, R.drawable.urlaub5),
            Vacation(R.string.preis2, R.drawable.urlaub6),
            Vacation(R.string.preis3, R.drawable.urlaub7),
            Vacation(R.string.preis4, R.drawable.urlaub8),
            Vacation(R.string.preis1, R.drawable.urlaub9),
            Vacation(R.string.preis2, R.drawable.urlaub10),
            Vacation(R.string.preis3, R.drawable.urlaub11),
            Vacation(R.string.preis4, R.drawable.urlaub12),
            Vacation(R.string.preis4, R.drawable.urlaub1),
            Vacation(R.string.preis3, R.drawable.urlaub2),
            Vacation(R.string.preis2, R.drawable.urlaub3),
        )
    }
}