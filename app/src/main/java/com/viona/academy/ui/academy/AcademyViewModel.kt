package com.viona.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.viona.academy.data.CourseEntity
import com.viona.academy.data.source.AcademyRepository

class AcademyViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getCourses(): List<CourseEntity> = academyRepository.getAllCourses()
}