package com.wutsi.like.dto

import kotlin.Long
import kotlin.String

public data class Like(
  public val id: Long = 0,
  public val storyId: Long = 0,
  public val userId: Long? = null,
  public val deviceId: String? = null,
  public val likeDateTime: Long = 0
)
