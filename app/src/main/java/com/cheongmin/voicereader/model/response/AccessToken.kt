package com.cheongmin.voicereader.model.response

import com.google.gson.annotations.SerializedName

data class AccessToken(
  @SerializedName("access_token")
  var token: String,

  @SerializedName("refresh_token")
  var refreshToken: String
)