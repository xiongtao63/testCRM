package xiongtao.szcrm.service

import xiongtao.szcrm.model.CourseOrder
import xiongtao.szcrm.model.MonthIncome
import xiongtao.szcrm.model.PageResult

interface ICourseOrderService {
    fun findPageResult(condition: CourseOrder, page: Int, pageSize: Int): PageResult<CourseOrder>
    fun save(order: CourseOrder)
    fun deleteByOrderId(orderId: String)
    fun findByOrderId(orderId: String): CourseOrder
    fun update(order: CourseOrder)
    fun getMonthIncomes(): List<MonthIncome>
}
