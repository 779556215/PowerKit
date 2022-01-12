package com.github.779556215.powerkit.services

import com.intellij.openapi.project.Project
import com.github.779556215.powerkit.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
