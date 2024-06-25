package com.bhojak.ricky.cmp.di

import com.bhojak.ricky.cmp.data_cache.sqldelight.DatabaseDriverFactory
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module = module {
    single { DatabaseDriverFactory() }
}
