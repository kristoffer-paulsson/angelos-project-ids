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

import kotlin.test.Test
import kotlin.test.assertEquals
import org.mockito.Mockito
import kotlin.test.*

class IntrutionDetectionTest {

    private lateinit var idsMock: IntrutionDetection

    @BeforeTest
    fun setup() {
        idsMock = Mockito.mock(IntrutionDetection::class.java)
    }

    @Test
    fun testStartMonitoring() {
        Mockito.`when`(idsMock.startMonitoring()).thenReturn(true)
        val result = idsMock.startMonitoring()
        assertEquals(true, result)
    }

    @Test
    fun testStopMonitoring() {
        Mockito.`when`(idsMock.stopMonitoring()).thenReturn(0)
        val result = idsMock.stopMonitoring()
        assertEquals(0, result)
    }

    @Test
    fun testIsMonitoring() {
        Mockito.`when`(idsMock.isMonitoring()).thenReturn(true)
        val result = idsMock.isMonitoring()
        assertEquals(true, result)
    }

}