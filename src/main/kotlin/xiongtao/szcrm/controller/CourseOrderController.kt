package xiongtao.szcrm.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import xiongtao.szcrm.model.CURDResult
import xiongtao.szcrm.model.CourseOrder
import xiongtao.szcrm.model.PageResult
import xiongtao.szcrm.service.ICourseCategoryService
import xiongtao.szcrm.service.ICourseOrderService

@Controller
@RequestMapping("/courseorder")
class CourseOrderController {

    @Autowired
    lateinit var orderService: ICourseOrderService
    @Autowired
    lateinit var categoryService: ICourseCategoryService

    @RequestMapping("list")
    fun list() : String{
        return "courseorder/list"
    }
    @RequestMapping("add")
    fun add(model: Model) : String{
        val categoryList = categoryService.findAllCourseCategory()
        println(categoryList)
        model.addAttribute("categoryList",categoryList)
        return "courseorder/add"
    }

    @RequestMapping("edit")
    fun edit(model: Model,order_id: String) : String{
        var order = orderService.findByOrderId(order_id)
        val categoryList = categoryService.findAllCourseCategory()
        println(categoryList)
        model.addAttribute("order",order)
        model.addAttribute("categoryList",categoryList)
        return "courseorder/edit"
    }

    @RequestMapping("detail")
    fun detail(model:Model,order_id: String) : String {
        var order = orderService.findByOrderId(order_id)
        model.addAttribute("order",order)
        return "courseOrder/detail"
    }

    @RequestMapping("listjson")
    @ResponseBody
    fun listjson(condition: CourseOrder?,page:Int?,limit:Int?) : PageResult<CourseOrder>{
        println("======")
        println(condition)
        val c = CourseOrder("","","","","")
        return orderService.findPageResult(condition?:c,page?:1,limit?:10)
    }

    @RequestMapping("save")
    @ResponseBody
    fun save(order: CourseOrder) : CURDResult {
        val result = CURDResult()
        if(order.uuid == null || order.uuid.length == 0){
            orderService.save(order)
        }else{
            orderService.update(order)
        }

        return result
    }

    @RequestMapping("delete")
    @ResponseBody
    fun delete(order_id: String) : CURDResult {
        val result = CURDResult()
        orderService.deleteByOrderId(order_id)
        return result
    }




}