package com.viona.academy.ui.bookmark

import com.viona.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(courseEntity: CourseEntity)
}
