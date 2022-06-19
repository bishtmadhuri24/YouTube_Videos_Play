package com.example.youtube_videos_play

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyler:RecyclerView
    lateinit var videoAdapter: VideoAdapter
    val videolist= mutableListOf<YoutubeData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyler=findViewById(R.id.recycler)
        recyler.layoutManager=LinearLayoutManager(this)
        recyler.setHasFixedSize(true)

        videolist.add(YoutubeData("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/1Oess10z6ik\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
        videolist.add(YoutubeData("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ED9wUhCd-5U\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
        videolist.add(YoutubeData("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/l0Vc2cBacXU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
        videolist.add(YoutubeData("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/J0FQ8_deIJ4\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
        videolist.add(YoutubeData("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/s_1m3yNbHKY\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
        videolist.add(YoutubeData("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/s_1m3yNbHKY\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
        videolist.add(YoutubeData("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/s_1m3yNbHKY\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
        videolist.add(YoutubeData("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/s_1m3yNbHKY\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
        videolist.add(YoutubeData("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/s_1m3yNbHKY\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
        videolist.add(YoutubeData("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/6qBTWBd7TGM\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
        videolist.add(YoutubeData("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/6qBTWBd7TGM\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
        videolist.add(YoutubeData("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/6qBTWBd7TGM\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
        videoAdapter= VideoAdapter(videolist)
        recyler.adapter=videoAdapter
    }
}