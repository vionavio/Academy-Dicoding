package com.viona.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.viona.academy.data.CourseEntity
import com.viona.academy.data.source.AcademyRepository
import com.viona.academy.utils.DataDummy

class BookmarkViewModel(private val academyReposiroty: AcademyRepository) : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = academyReposiroty.getBookmarkedCourses()
}