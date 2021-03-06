package com.cheongmin.voicereader.model.response
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Question(
  @SerializedName("_id")
  var id: String,

  @SerializedName("title")
  var title: String,

  @SerializedName("contents")
  var contents: String,

  @SerializedName("created_date")
  var createdDate: Long,

  @SerializedName("sound_url")
  var soundUri: String,

  @SerializedName("subtitles")
  var subtitle: String,

  @SerializedName("writer")
  var writer: User,

  @SerializedName("num_of_answers")
  var numOfAnswers: Int,

  @SerializedName("num_of_view")
  var numOfView: Int

) : Serializable