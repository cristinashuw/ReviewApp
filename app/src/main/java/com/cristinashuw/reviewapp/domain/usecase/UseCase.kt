package com.cristinashuw.reviewapp.domain.usecase

interface UseCase<RESULT, PARAM> {
    fun execute(param: PARAM): RESULT
}