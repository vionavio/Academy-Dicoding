package com.viona.academy.ui.academy

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
class AcademyViewModelTest {

    private lateinit var viewModel: AcademyViewModel

    @Mock
    private lateinit var academyRepository: AcademyRepository

    @Before
    fun setUp() {
        viewModel = AcademyViewModel(academyRepository)
    }

    @Test
    fun getCourses() {
        `when`(academyRepository.getAllCourses()).thenReturn(DataDummy.generaeteDummyCourse())
        val courseEntities = viewModel.getCourses()
        verify(academyRepository).getAllCourses()
        assertNotNull(courseEntities)
        assertEquals(5, courseEntities.size)
    }
}

/*  @Before
  fun setUp() {
      viewModel = AcademyViewModel()
  }

  @Test
  fun getCourses() {
      val courseEntities = viewModel.getCourses()
      assertNotNull(courseEntities)
      assertEquals(5, courseEntities.size)
  }
}*/