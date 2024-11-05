/*
 * Copyright (C) 2023 The LeafOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.android.systemui.util.qs;

import android.content.Context;
import android.os.UserHandle;
import android.provider.Settings;

import com.android.systemui.R;

public class QSStyleUtils {
    public static final String QS_STYLE_A11 = Settings.System.QS_TILE_UI_STYLE;
    public static final String QS_STYLE_A11_OVERLAY = "com.android.systemui.qs_style.round";

    private static boolean mIsA11Style;

    public static void setA11Style(boolean enable) {
        mIsA11Style = enable;
    }

    public static boolean isA11Style() {
        return mIsA11Style;
    }

    public static boolean isA11StyleSetting(Context context) {
        return Settings.Secure.getIntForUser(context.getContentResolver(),
                QS_STYLE_A11, 1, UserHandle.USER_CURRENT) == 1;
    }
}
