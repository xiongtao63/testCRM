package xiongtao.szcrm.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import xiongtao.szcrm.mapper.CourseCategoryMapper
import xiongtao.szcrm.model.CourseCategory

@Service
class CourseCategoryServiceImpl: ICourseCategoryService {
    @Autowired
    lateinit var categoryMapper: CourseCategoryMapper

    override fun findAllCourseCategory(): List<CourseCategory> {
        return categoryMapper.findAllList()
    }
}