package com.viona.academy.data.source.local.entity

import com.viona.academy.data.source.local.entity.ContentEntity

data class ModuleEntity(
    var moduleId: String,
    var courseId: String,
    var title: String,
    var position: Int,
    var read: Boolean = false
) {
    var contentEntity: ContentEntity? = null
}
