package xiongtao.szcrm.model

data class PageResult<T>(var code: Int = 1, var msg: String = "", var count: Int = 0, var data: List<T>? = null)
