package xiongtao.szcrm.service

import xiongtao.szcrm.model.CourseCategory

interface ICourseCategoryService {
    fun findAllCourseCategory(): List<CourseCategory>
}