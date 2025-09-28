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

/**
 * Interface for Intrusion Detection System (IDS)
 */
public interface IntrutionDetection {

    /**
     * Starts monitoring for intrusions.
     */
    public fun startMonitoring(): Boolean

    /**
     * Stops monitoring for intrusions.
     */
    public fun stopMonitoring(): Int

    /**
     * Checks if the system is currently monitoring for intrusions.
     * @return true if monitoring is active, false otherwise.
     */
    public fun isMonitoring(): Boolean
}