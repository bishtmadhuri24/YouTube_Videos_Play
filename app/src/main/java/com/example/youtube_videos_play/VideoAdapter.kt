package com.example.youtube_videos_play

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView

class VideoAdapter(val videolist:List<YoutubeData>):
    RecyclerView.Adapter<VideoAdapter.VideoHolder>() {

    class VideoHolder(itemview: View):RecyclerView.ViewHolder(itemview){
        val webVideo:WebView=itemview.findViewById(R.id.webVideo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoHolder {
     val view=LayoutInflater.from(parent.context).inflate(R.layout.youtube_videos,parent,false)
        return VideoHolder(view)
    }

    override fun onBindViewHolder(holder: VideoHolder, position: Int) {
     val data=videolist[position]
        holder.webVideo.loadData(data.videoUrl,"text/html","utf-8")
        holder.webVideo.settings.javaScriptEnabled=true

    }

    override fun getItemCount()=videolist.size
}