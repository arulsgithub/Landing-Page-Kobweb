package com.arul.landingpage.components

import androidx.compose.runtime.Composable
import com.arul.landingpage.models.Section
import com.arul.landingpage.models.Theme
import com.arul.landingpage.utils.Constants.FONT_FAMILY
import com.arul.landingpage.utils.Res
import com.arul.landingpage.styles.LogoStyle
import com.arul.landingpage.styles.NavigationItemStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import com.varabyte.kobweb.silk.style.toModifier


@Composable
fun Header() {

    val breakpoint = rememberBreakpoint()
    Row (
        modifier = Modifier.fillMaxWidth(
            if(breakpoint > Breakpoint.MD) 80.percent else 95.percent
        )
            .margin(topBottom = 30.px),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        LeftHeader(breakpoint = breakpoint)
        if(breakpoint > Breakpoint.MD) {
            RightHeader()
        }
    }
}

@Composable
fun LeftHeader(breakpoint: Breakpoint){

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (breakpoint <= Breakpoint.MD) {
            FaBars(
                modifier = Modifier
                    .padding(right = 15.px),
                size =  IconSize.SM
            )
        }
        Image(
            modifier = LogoStyle.toModifier()
                .size(
                    if(breakpoint > Breakpoint.MD) 120.px else 70.px
                ),
            src = Res.image.logo,
            description = "logo"
        )
    }
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
                modifier = NavigationItemStyle.toModifier()
                    .padding(right = 30.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(18.px)
                    .fontWeight(FontWeight.Normal)
                    .textDecorationLine(TextDecorationLine.None)
            )
        }
    }
}