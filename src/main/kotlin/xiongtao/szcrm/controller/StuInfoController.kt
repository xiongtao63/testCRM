package xiongtao.szcrm.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/stuinfo")
class StuInfoController {

    @RequestMapping("list")
    fun list() : String{
        return "stuinfo/list"
    }

}