package com.viona.academy.ui.bookmark

import com.viona.academy.data.source.local.entity.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(courseEntity: CourseEntity)
}
