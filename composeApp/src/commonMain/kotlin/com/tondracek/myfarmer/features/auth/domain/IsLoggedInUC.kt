package com.tondracek.myfarmer.shared.auth.domain

import com.tondracek.myfarmer.shared.core.domain.UseCaseResult
import com.tondracek.myfarmer.shared.systemuser.SystemUser
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import java.util.UUID
import javax.inject.Inject

class IsLoggedInUC @Inject constructor(
) : () -> Flow<UseCaseResult<SystemUser>> {

    override operator fun invoke(): Flow<UseCaseResult<SystemUser>> = flowOf(
        UseCaseResult.Success(SystemUser(UUID.randomUUID()))
    )
}