package com.cheongmin.voicereader.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cheongmin.voicereader.R
import com.cheongmin.voicereader.model.response.Answer
import com.cheongmin.voicereader.model.response.User
import com.cheongmin.voicereader.utils.DateUtils
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.layout_answer.view.*
import java.util.*

class AnswerAdapter(
  private val profileClickListener: (user: User) -> Unit
) : BaseAdapter<Answer, AnswerAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val inflater = LayoutInflater.from(parent.context)
    return ViewHolder(inflater.inflate(R.layout.layout_answer, parent, false))
  }

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val item = getItem(position)
    holder.bind(item!!, profileClickListener)
  }

  class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(answer: Answer, profileClickListener: (user: User) -> Unit) = with(itemView) {
      tv_answer_user_name.text = answer.writer.displayName
      tv_answer_location.text = answer.writer.location

      tv_answer_content.text = answer.contents
      tv_answer_date.text = DateUtils.getDateString(answer.createdDate)

      iv_answer_user_profile.setOnClickListener {
        profileClickListener(answer.writer)
      }

      if(answer.writer.profileUri.isNotBlank()) {
        Picasso.get().load(answer.writer.profileUri).into(iv_answer_user_profile)
      }
    }
  }
}