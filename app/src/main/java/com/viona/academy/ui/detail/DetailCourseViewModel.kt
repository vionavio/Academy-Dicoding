package com.viona.academy.ui.detail

import androidx.lifecycle.ViewModel
import com.viona.academy.data.source.local.entity.CourseEntity
import com.viona.academy.data.source.local.entity.ModuleEntity
import com.viona.academy.utils.DataDummy

class DetailCourseViewModel : ViewModel() {
    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse(): CourseEntity {
        lateinit var course: CourseEntity
        val coursesEntities = DataDummy.generaeteDummyCourse()
        for (courseEntity in coursesEntities) {
            if (courseEntity.courseId == courseId) {
                course = courseEntity
            }
        }
        return course
    }

    fun getModules(): List<ModuleEntity> = DataDummy.generateDummyModules(courseId)
}