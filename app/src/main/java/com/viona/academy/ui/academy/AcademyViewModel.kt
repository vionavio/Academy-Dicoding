package com.viona.academy.ui.academy

import androidx.lifecycle.ViewModel
import com.viona.academy.data.CourseEntity
import com.viona.academy.utils.DataDummy

class AcademyViewModel : ViewModel(){

    fun getCourses(): List<CourseEntity> = DataDummy.generaeteDummyCourse()
}