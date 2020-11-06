package com.cristinashuw.reviewapp.usecase

interface UseCase<RESULT, PARAM> {
    fun execute(param: PARAM): RESULT
}