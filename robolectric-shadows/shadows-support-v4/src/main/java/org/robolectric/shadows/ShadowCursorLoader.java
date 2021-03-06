package org.robolectric.shadows;

import android.database.Cursor;
import android.support.v4.content.CursorLoader;
import org.robolectric.annotation.Implements;

@Implements(CursorLoader.class)
public class ShadowCursorLoader extends ShadowAsyncTaskLoader<Cursor> {
}
