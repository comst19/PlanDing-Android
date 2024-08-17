package com.comst.domain.usecase.groupInvite

import com.comst.domain.model.group.GroupInviteModel
import com.comst.domain.model.group.GroupInviteResponseModel
import com.comst.domain.repository.GroupInviteRepository
import com.comst.domain.util.ApiResult
import javax.inject.Inject

class PostGroupInviteUseCase @Inject constructor(
    private val groupInviteRepository: GroupInviteRepository
){
    suspend operator fun invoke(groupInviteModel: GroupInviteModel): ApiResult<GroupInviteResponseModel> {
        return groupInviteRepository.postInviteGroupMember(groupInviteModel)
    }
}