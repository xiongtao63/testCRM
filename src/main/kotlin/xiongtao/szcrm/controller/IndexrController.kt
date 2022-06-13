package xiongtao.szcrm.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexrController {

    @RequestMapping("/index")
    fun index() : String{
        return "index"
    }

}