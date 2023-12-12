package com.example.expensetracker.domain.usecase.write_database

import com.example.expensetracker.data.local.entity.TransactionDto
import com.example.expensetracker.domain.repository.TransactionRepository
import javax.inject.Inject

class InsertNewTransactionUseCase @Inject constructor(private val repo: TransactionRepository) {

    suspend operator fun invoke(dailyExpense: TransactionDto) {
        repo.insertTransaction(dailyExpense)
    }
}