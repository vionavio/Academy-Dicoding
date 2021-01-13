package com.viona.academy.ui.bookmark

import androidx.lifecycle.ViewModel
import com.viona.academy.data.CourseEntity
import com.viona.academy.utils.DataDummy

class BookmarkViewModel : ViewModel() {

    fun getBookmarks(): List<CourseEntity> = DataDummy.generaeteDummyCourse()
}