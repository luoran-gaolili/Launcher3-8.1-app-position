/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rgks.launcher3;

public class ProviderConfig {

    public static final String AUTHORITY = "com.rgks.launcher3.settings".intern();
	/**
     * UNREAD_CHANGED
     */
    public static final String ACTION_UNREAD_CHANGED = "com.mediatek.action.UNREAD_CHANGED";
    /**
     * UNREAD_NUMBER 
     */
    public static final String EXTRA_UNREAD_NUMBER = "com.mediatek.intent.extra.UNREAD_NUMBER";
    /**
     * Extra used to indicate the unread number of which component changes.
     */
    public static final String EXTRA_UNREAD_COMPONENT = "com.mediatek.intent.extra.UNREAD_COMPONENT";
}
