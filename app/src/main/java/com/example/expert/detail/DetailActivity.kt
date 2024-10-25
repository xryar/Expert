package com.example.expert.detail

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.IntentCompat.getParcelableExtra
import com.bumptech.glide.Glide
import com.example.core.domain.model.Tourism
import com.example.expert.R
import com.example.expert.databinding.ActivityDetailBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DetailActivity : AppCompatActivity() {

    private val detailTourismViewModel: DetailViewModel by viewModel()
    private var _binding: ActivityDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityDetailBinding.inflate(layoutInflater)
        val root: View = binding.root
        setContentView(root)
        setSupportActionBar(binding.toolbar)

        val detailTourism = getParcelableExtra(intent, EXTRA_DATA, Tourism::class.java)
        showDetailTourism(detailTourism)
    }

    private fun showDetailTourism(detailTourism: Tourism?) {
        detailTourism?.let {
            supportActionBar?.title = detailTourism.name
            binding.contentDetailTourism.tvDetailDescription.text = detailTourism.description
            Glide.with(this@DetailActivity)
                .load(detailTourism.image)
                .into(binding.ivDetailImage)

            var statusFavorite = detailTourism.isFavorite
            setStatusFavorite(statusFavorite)
            binding.fab.setOnClickListener {
                statusFavorite = !statusFavorite
                detailTourismViewModel.setFavoriteTourism(detailTourism, statusFavorite)
                setStatusFavorite(statusFavorite)
            }
        }
    }

    private fun setStatusFavorite(statusFavorite: Boolean) {
        binding.fab.setImageDrawable(
            ContextCompat.getDrawable(
                this,
                if (statusFavorite) {
                    R.drawable.ic_favorite_white
                } else {
                    R.drawable.ic_not_favorite_white
                }
            )
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {
        const val EXTRA_DATA = "extra_data"
    }
}