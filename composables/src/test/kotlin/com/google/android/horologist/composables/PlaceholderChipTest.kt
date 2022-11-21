/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:OptIn(ExperimentalHorologistPaparazziApi::class, ExperimentalHorologistComposablesApi::class)

package com.google.android.horologist.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.wear.compose.material.ChipDefaults
import com.google.android.horologist.paparazzi.ExperimentalHorologistPaparazziApi
import com.google.android.horologist.paparazzi.WearPaparazzi
import org.junit.Rule
import org.junit.Test

class PlaceholderChipTest {
    @get:Rule
    val paparazzi = WearPaparazzi()

    @Test
    fun default() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Color.Black), contentAlignment = Alignment.Center) {
                PlaceholderChip()
            }
        }
    }

    @Test
    fun secondaryColors() {
        paparazzi.snapshot {
            Box(modifier = Modifier.background(Color.Black), contentAlignment = Alignment.Center) {
                PlaceholderChip(colors = ChipDefaults.secondaryChipColors())
            }
        }
    }
}