package xiongtao.szcrm.service





import xiongtao.szcrm.mapper.CourseOrderMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import xiongtao.szcrm.model.CourseOrder
import xiongtao.szcrm.model.MonthIncome
import xiongtao.szcrm.model.PageResult

@Service
class CourseOrderServiceImpl : ICourseOrderService {

    @Autowired()
    lateinit var courseOrderMapper: CourseOrderMapper

    override fun findPageResult(condition: CourseOrder, page: Int, pageSize: Int): PageResult<CourseOrder> {
        val result = PageResult<CourseOrder>()
        result.code = 0
        val params = mapOf(
                "condition" to condition,
                "start" to (page - 1) * pageSize,
                "pageSize" to pageSize
        )
        val totalCount = courseOrderMapper.findCountByMap(params)
        result.count = totalCount
        val list = courseOrderMapper.findListByMap(params)
        result.data = list
        return result


    }

    override fun save(order: CourseOrder) {
        courseOrderMapper.insert(order)
    }

    override fun deleteByOrderId(orderId: String) {
        courseOrderMapper.deleteByOrderId(orderId)
    }

    override fun findByOrderId(orderId: String): CourseOrder {
        return courseOrderMapper.findByOrderId(orderId)
    }

    override fun update(order: CourseOrder) {
        courseOrderMapper.update(order)
    }

    override fun getMonthIncomes(): List<MonthIncome> {
        return courseOrderMapper.getMonthIncomes()
    }
}