package com.tondracek.myfarmer.features.auth.domain.flow

//import com.tondracek.myfarmer.features.auth.domain.IsLoggedInUC
//import com.tondracek.myfarmer.shared.core.domain.UseCaseResult
//import com.tondracek.myfarmer.shared.systemuser.SystemUser
//import com.tondracek.myfarmer.shared.systemuser.UserId
//import kotlinx.coroutines.ExperimentalCoroutinesApi
//import kotlinx.coroutines.flow.Flow
//import kotlinx.coroutines.flow.flatMapLatest
//import kotlinx.coroutines.flow.flowOf
//import javax.inject.Inject
//
//class IsLoggedInAuthFlow @Inject constructor(
//    private val isLoggedIn: IsLoggedInUC,
//) {
//
//    @OptIn(ExperimentalCoroutinesApi::class)
//    operator fun <T> invoke(
//        block: (UserId) -> Flow<UseCaseResult<T>>
//    ): Flow<UseCaseResult<T>> =
//        isLoggedIn().flatMapLatest { loggedInResult: UseCaseResult<SystemUser> ->
//            when (loggedInResult) {
//                is UseCaseResult.Failure -> flowOf(loggedInResult)
//                is UseCaseResult.Success -> block(loggedInResult.data.id)
//            }
//        }
//}