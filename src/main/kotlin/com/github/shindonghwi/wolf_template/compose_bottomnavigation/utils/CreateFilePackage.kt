package com.github.shindonghwi.wolf_template.compose_bottomnavigation.utils

import kotlinx.coroutines.runBlocking
import java.io.File

object CreateFilePackage {

    /** 바텀네이게이션 메뉴 패키지 생성 */
    fun bottomMenuPackage(path: String, bottomMenuTabList: List<String>) = runBlocking {
        bottomMenuTabList.forEach {
            File("$path/screen/$it").mkdirs()
        }
    }

    /** navigation package 생성 */
    fun navigationPackage(path: String, bottomMenuTabList: List<String>) = runBlocking {
        File("$path/navigation").mkdirs()
        File("$path/navigation/nav_graph").mkdirs()
    }
}