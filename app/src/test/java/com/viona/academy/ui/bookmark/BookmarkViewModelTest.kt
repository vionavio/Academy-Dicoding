package com.viona.academy.ui.bookmark

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class BookmarkViewModelTest {

    private lateinit var viewModel: BookmarkViewModel

    @Before
    fun setUp(){
        viewModel = BookmarkViewModel()
    }

    @Test
    fun getBookmarks() {
        val bookmarkEntities = viewModel.getBookmarks()
        assertNotNull(bookmarkEntities)
        assertEquals(5, bookmarkEntities.size)
    }
}