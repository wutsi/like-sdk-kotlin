package com.wutsi.like.dto

import kotlin.collections.List

public data class SearchLikeResponse(
  public val likes: List<Like> = emptyList()
)
