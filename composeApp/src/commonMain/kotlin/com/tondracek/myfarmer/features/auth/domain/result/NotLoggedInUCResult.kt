package com.tondracek.myfarmer.shared.auth.domain.result

import com.tondracek.myfarmer.shared.core.domain.UseCaseResult

class NotLoggedInUCResult : UseCaseResult.Failure(
    userError = "You must be logged in to perform this action.",
    systemError = "User is not logged in."
)
