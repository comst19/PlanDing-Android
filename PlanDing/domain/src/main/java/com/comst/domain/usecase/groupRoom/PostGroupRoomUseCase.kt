package com.comst.domain.usecase.groupRoom

import com.comst.domain.model.file.MediaImage
import com.comst.domain.model.groupRoom.GroupRoomCreate
import com.comst.domain.model.groupRoom.GroupRoomCreateResponseModel

interface PostGroupRoomUseCase {
    suspend operator fun invoke(groupRoomCreate: GroupRoomCreate, thumbnail: MediaImage):Result<GroupRoomCreateResponseModel>
}