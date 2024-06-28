package com.comst.data.model.personalSchedule

import com.comst.domain.model.base.ScheduleEvent
import com.comst.domain.model.base.ScheduleType
import com.comst.domain.util.DateUtils

data class PersonalScheduleResponseDTO(
    val id : Long,
    val title : String,
    val content : String,
    val scheduleDate : String,
    val startTime : Int,
    val endTime : Int,
    val complete : Boolean,
    val type : String,
    val day : String
)
fun PersonalScheduleResponseDTO.toDomainModel(): ScheduleEvent {
    val localDate = DateUtils.uiDateToLocalDate(scheduleDate,"yyyy-MM-dd")
    return ScheduleEvent(
        scheduleId = id,
        title = title,
        content = content,
        startTime = startTime,
        endTime = endTime,
        day = DateUtils.getDayOfWeekUIFormat(localDate),
        complete = complete,
        groupName = null,
        type = ScheduleType.PERSONAL
    )
}