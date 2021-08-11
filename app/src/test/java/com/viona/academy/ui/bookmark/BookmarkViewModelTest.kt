package com.viona.academy.ui.bookmark

import com.viona.academy.data.source.AcademyRepository
import com.viona.academy.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class BookmarkViewModelTest {

    private lateinit var viewModel: BookmarkViewModel

    @Mock
    private lateinit var academyRepository: AcademyRepository

    @Before
    fun setUp(){
        viewModel = BookmarkViewModel(academyRepository)
    }

    @Test
    fun getBookmarks() {
        Mockito.`when`(academyRepository.getAllCourses()).thenReturn(DataDummy.generaeteDummyCourse())
        val bookmarkEntities = viewModel.getBookmarks()
        Mockito.verify(academyRepository).getAllCourses()
        assertNotNull(bookmarkEntities)
        assertEquals(5, bookmarkEntities.size)
    }
}