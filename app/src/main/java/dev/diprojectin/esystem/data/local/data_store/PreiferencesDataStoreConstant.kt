package dev.diprojectin.esystem.data.local.data_store

import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey

object PreiferencesDataStoreConstant {
    val IS_ONBOARDING = booleanPreferencesKey("IS_ONBOARDING")
}