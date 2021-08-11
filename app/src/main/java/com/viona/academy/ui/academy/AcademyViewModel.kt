package com.viona.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.viona.academy.data.CourseEntity
import com.viona.academy.data.source.AcademyRepository
import com.viona.academy.utils.DataDummy

class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getCourses(): List<CourseEntity> = academyRepository.getAllCourses()
}