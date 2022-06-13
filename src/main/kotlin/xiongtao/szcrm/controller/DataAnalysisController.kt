package xiongtao.szcrm.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import xiongtao.szcrm.model.MonthIncome
import xiongtao.szcrm.service.ICourseOrderService

@Controller
@RequestMapping("/dataanalysis")
class DataAnalysisController {
    @Autowired
    lateinit var orderService: ICourseOrderService

    @RequestMapping("income")
    fun income(): String{
        return "dataanalysis/income"
    }

    @RequestMapping("monthIncomes")
    @ResponseBody
    fun monthIncomes(): List<MonthIncome>{
        val monthIncomes = orderService.getMonthIncomes()
        return monthIncomes
    }
}