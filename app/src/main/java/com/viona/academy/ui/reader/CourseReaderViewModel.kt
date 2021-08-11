package com.viona.academy.ui.reader

import androidx.lifecycle.ViewModel
import com.viona.academy.data.ContentEntity
import com.viona.academy.data.ModuleEntity
import com.viona.academy.data.source.AcademyRepository
import com.viona.academy.utils.DataDummy

class CourseReaderViewModel(private val academyRepository: AcademyRepository) : ViewModel() {
    private lateinit var courseId: String
    private lateinit var moduleId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun setSelectedModule(moduleId: String) {
        this.moduleId = moduleId
    }

    fun getModules(): ArrayList<ModuleEntity> = academyRepository.getAllModulesByCourse(courseId)

    fun getSelectedModule(): ModuleEntity =academyRepository.getContent(courseId, moduleId)
}