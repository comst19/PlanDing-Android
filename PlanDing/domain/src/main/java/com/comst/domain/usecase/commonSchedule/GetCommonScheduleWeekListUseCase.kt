package com.comst.domain.usecase.commonSchedule

import com.comst.domain.model.base.ScheduleEvent
import com.comst.domain.model.base.SchedulePeriodModel
import com.comst.domain.repository.CommonScheduleRepository
import com.comst.domain.util.ApiResult
import javax.inject.Inject

class GetCommonScheduleWeekListUseCase @Inject constructor(
    private val commonScheduleRepository: CommonScheduleRepository
){
    suspend operator fun invoke(
        request: SchedulePeriodModel
    ): ApiResult<List<ScheduleEvent>> {
        return commonScheduleRepository.getCommonScheduleWeekList(request)
    }
}