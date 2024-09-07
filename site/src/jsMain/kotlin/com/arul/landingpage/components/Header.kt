package com.arul.landingpage.components

import androidx.compose.runtime.Composable
import com.arul.landingpage.models.Section
import com.arul.landingpage.models.Theme
import com.arul.landingpage.pages.utils.Constants.FONT_FAMILY
import com.arul.landingpage.pages.utils.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun Header() {

    Row (
        modifier = Modifier.fillMaxWidth(80.percent)
            .margin(topBottom = 50.px),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        LeftHeader()
        RightHeader()
    }
}

@Composable
fun LeftHeader(){

    Image(
        src = Res.image.logo,
        description = "logo"
    )
}

@Composable
fun RightHeader(){

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .borderRadius(50.px)
            .backgroundColor(Theme.LighterGray.rgb)
            .padding(all = 20.px),
        horizontalArrangement = Arrangement.End
    ){
        Section.entries.toTypedArray().take(6).forEach {
            Link(
                path = it.path,
                text = it.title,
                modifier = Modifier
                    .padding(right = 30.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Color.black)
            )
        }
    }
}