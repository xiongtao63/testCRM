package xiongtao.szcrm.mapper

import xiongtao.szcrm.model.CourseCategory

interface CourseCategoryMapper {
    fun findAllList(): List<CourseCategory>
}