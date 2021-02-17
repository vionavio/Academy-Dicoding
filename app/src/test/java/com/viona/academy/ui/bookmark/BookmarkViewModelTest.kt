package com.viona.academy.ui.bookmark

import com.viona.academy.data.source.AcademyRepository
import com.viona.academy.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class BookmarkViewModelTest {

    private lateinit var viewModel: BookmarkViewModel

    @Mock
    private lateinit var academyRepository: AcademyRepository

    @Before
    fun setUp() {
        viewModel = BookmarkViewModel(academyRepository)
    }

    @Test
    fun getBookmark() {
        `when`(academyRepository.getBookmarkedCourses()).thenReturn(
            DataDummy.generaeteDummyCourse() )
        val courseEntities = viewModel.getBookmarks()
        verify(academyRepository).getBookmarkedCourses()
        assertNotNull(courseEntities)
        assertEquals(5, courseEntities.size)
    }
}

   /* @Before
    fun setUp(){
        viewModel = BookmarkViewModel()
    }

    @Test
    fun getBookmarks() {
        val bookmarkEntities = viewModel.getBookmarks()
        assertNotNull(bookmarkEntities)
        assertEquals(5, bookmarkEntities.size)
    }
}*/