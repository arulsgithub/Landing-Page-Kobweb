package com.arul.landingpage.models

import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.percent

enum class Skills(
    val title: String,
    val percent: CSSSizeValue<CSSUnit.percent>
) {
    Creative(
        title = "Creative",
        percent = 83.percent
    ),
    HardWorking(
        title = "HardWorking",
        percent = 95.percent
    ),
    TeemWork(
        title = "TeemWork",
        percent = 90.percent
    ),
    Value(
        title = "Value for Money",
        percent = 87.percent
    ),
    TimeManagement(
        title = "TimeManagement",
        percent = 80.percent
    )
}