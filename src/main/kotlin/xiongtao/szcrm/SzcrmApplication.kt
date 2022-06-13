package xiongtao.szcrm

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication
@ComponentScan(basePackages = ["xiongtao.szcrm"])
@MapperScan(basePackages=["xiongtao.szcrm.mapper"])//扫描Mapper
class SzcrmApplication

fun main(args: Array<String>) {
    runApplication<SzcrmApplication>(*args)
}
