package com.example.testinandroid

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ResourceComparerTest {

    private val resourceComparer = ResourceComparer()

    @Test
    fun `stringResourceSameAsGivenString_returnTrue`() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "Test in Android")
        assertThat(result).isTrue()
    }

    @Test
    fun `stringResourceDiffAsGivenString_returnFalse`() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "Testing Android")
        assertThat(result).isFalse()
    }
}