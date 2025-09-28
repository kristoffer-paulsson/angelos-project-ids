/**
 * Copyright (c) 2025 by Kristoffer Paulsson <kristoffer.paulsson@talenten.se>.
 *
 * This software is available under the terms of the MIT license. Parts are licensed
 * under different terms if stated. The legal terms are attached to the LICENSE file
 * and are made available on:
 *
 *      https://opensource.org/licenses/MIT
 *
 * SPDX-License-Identifier: MIT
 *
 * Contributors:
 *      Kristoffer Paulsson - initial implementation
 */
package org.angproj.ids

import com.code_intelligence.jazzer.Jazzer
import com.code_intelligence.jazzer.api.FuzzedDataProvider
import kotlin.jvm.javaClass
import kotlin.test.assertTrue


public object FuzzerIntrutionDetectionKt {

    public val ids : IntrutionDetection = object : IntrutionDetection {

        private var monitoring: Boolean = false

        override fun startMonitoring(): Boolean {
            monitoring = true
            return true
        }

        override fun stopMonitoring(): Int {
            monitoring = false
            return 0
        }

        override fun isMonitoring(): Boolean {
            return monitoring
        }
    }

    init {
        ids.startMonitoring()
    }


    @JvmStatic
    public fun fuzzerTestOneInput(data: FuzzedDataProvider) {

        val buffer = ByteArray(32)

        try {
            // TODO("Implement actual fuzzing of IDS, implement doable hack and intrution simulation")
        } catch (_: Exception) {
            assertTrue(ids.isMonitoring())
        }

        assertTrue(ids.isMonitoring())
    }

    @JvmStatic
    public fun main(args: Array<String>) {
        Jazzer.main(
            arrayOf(
                "--target_class=${javaClass.name}",
                "-max_total_time=${120}"
            )
        )
    }
}