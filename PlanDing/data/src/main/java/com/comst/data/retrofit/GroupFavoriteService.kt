package com.comst.data.retrofit

import com.comst.data.model.BaseResponse
import com.comst.data.model.groupFavorite.GroupFavoriteAddResponseDTO
import retrofit2.Response
import retrofit2.http.POST
import retrofit2.http.Path

interface GroupFavoriteService {
    @POST("v1/favorite/{groupCode}")
    suspend fun postFavoriteGroupApi(
        @Path("groupCode") groupCode: String
    ): Response<BaseResponse<GroupFavoriteAddResponseDTO>>
}