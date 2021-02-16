package com.viona.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.viona.academy.data.CourseEntity
import com.viona.academy.data.source.AcademyRepository

class BookmarkViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = academyRepository.getBookmarkedCourses()
}