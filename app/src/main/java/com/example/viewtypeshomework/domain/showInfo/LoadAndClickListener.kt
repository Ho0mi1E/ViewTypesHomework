package com.example.viewtypeshomework.domain.showInfo

import com.example.viewtypeshomework.domain.model.server.User

interface LoadAndClickListener {
    fun click(user: User)
}