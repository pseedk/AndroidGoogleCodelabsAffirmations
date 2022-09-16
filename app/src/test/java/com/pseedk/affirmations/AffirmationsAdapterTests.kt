package com.pseedk.affirmations

import com.pseedk.affirmations.adapter.ItemAdapter
import com.pseedk.affirmations.model.Affirmation
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {

    private val context = mock(android.content.Context::class.java)

    @Test
    fun adapterSize() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )

        val adapter = ItemAdapter(context,data)

        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }


}