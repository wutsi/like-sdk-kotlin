package com.wutsi.like

import com.wutsi.like.dto.GetLikeResponse
import com.wutsi.like.dto.SearchLikeResponse
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Int
import kotlin.Long

public interface LikeApi {
  @RequestLine("GET /v1/likes?limit={limit}&offset={offset}")
  @Headers(value=["Content-Type: application/json"])
  public fun search(@Param("limit") limit: Int, @Param("offset") offset: Int): SearchLikeResponse

  @RequestLine("GET /v1/likes/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun `get`(@Param("id") id: Long): GetLikeResponse
}
