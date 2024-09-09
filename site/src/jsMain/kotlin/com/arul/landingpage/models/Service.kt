package com.arul.landingpage.models

import com.arul.landingpage.utils.Constants.LOREM_SHORT
import com.arul.landingpage.utils.Res

enum class Service(
    val img: String,
    val imgDesc: String,
    val title: String,
    val subTitle: String,
    val desc: String
) {

    Android(
        img = Res.image.androidImg,
        imgDesc = "android",
        title = "Android Development",
        subTitle = "Kotlin-Jetpack Compose (Intermediate)",
        desc = LOREM_SHORT
    ),
    IOS(
        img = Res.image.iosImg,
        imgDesc = "ios",
        title = "IOS Development",
        subTitle = "Compose Multi Platform (Beginner)",
        desc = LOREM_SHORT
    ),
    Web(
        img = Res.image.webImg,
        imgDesc = "web",
        title = "Web Development",
        subTitle = "Kobweb (Beginner)",
        desc = LOREM_SHORT
    ),
    UI(
        img = Res.image.uiuxImg,
        imgDesc = "uiux",
        title = "UI/UX Design",
        subTitle = "Jetpack Compose (Intermediate)",
        desc = LOREM_SHORT
    )


}