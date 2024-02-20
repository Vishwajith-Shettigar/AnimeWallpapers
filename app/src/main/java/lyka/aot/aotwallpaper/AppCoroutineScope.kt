package lyka.aot.aotwallpaper

// AppCoroutineScope.kt

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob

object AppCoroutineScope {
    val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())
}
