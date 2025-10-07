package com.tondracek.myfarmer.features.demo.domain

import com.tondracek.myfarmer.shared.core.domain.UseCaseResult
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetFilteredDemosUC constructor(
//    private val demoRepository: DemoRepository,
//    private val isShopOwnerAuthFlow: IsShopOwnerAuthFlow
) {

    @OptIn(ExperimentalCoroutinesApi::class)
    operator fun invoke(
        names: List<String>? = null,
        index: Int? = null,
    ): Flow<UseCaseResult<List<Demo>>> = flow {
        delay(5000)
        emit(UseCaseResult.Success(emptyList()))
    }
//        isShopOwnerAuthFlow(shopId = "placeholder") {
//            demoRepository.getFiltered(names, index)
//                .map { UseCaseResult.Success(it) }
//        }
}