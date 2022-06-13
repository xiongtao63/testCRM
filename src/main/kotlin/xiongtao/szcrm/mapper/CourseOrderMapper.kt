package xiongtao.szcrm.mapper


import xiongtao.szcrm.model.CourseOrder
import xiongtao.szcrm.model.MonthIncome

interface CourseOrderMapper {
    fun findCountByMap(params: Map<String, Any>): Int
    fun findListByMap(params: Map<String, Any>): List<CourseOrder>
    fun insert(order: CourseOrder)
    fun deleteByOrderId(orderId: String)
    fun findByOrderId(orderId: String): CourseOrder
    fun update(order: CourseOrder)
    fun getMonthIncomes(): List<MonthIncome>
}