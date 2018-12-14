package org.jg.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import org.jg.swoosh.Model.Player
import org.jg.swoosh.R
import org.jg.swoosh.Utilities.EXTRA_PLAYER


class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)


        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you... "
    }
}
