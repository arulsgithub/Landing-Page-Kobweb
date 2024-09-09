package com.arul.landingpage.components

import androidx.compose.runtime.Composable
import com.arul.landingpage.models.Service
import com.arul.landingpage.models.Theme
import com.arul.landingpage.styles.aboutTextStyle
import com.arul.landingpage.utils.Constants.FONT_FAMILY
import com.arul.landingpage.utils.Constants.LOREM_SHORT
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.AlignContent
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ServiceCard(service: Service){

    Column(
        modifier = Modifier
            .maxWidth(300.px)
            .margin(all = 20.px)
            .padding(all = 20.px)
            .border(
                width = 2.px,
                style = LineStyle.Solid,
                color = Theme.LighterGray.rgb
            )
    ) {

        Box (
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(all = 10.px)
                .margin(bottom = 20.px)
                .border(
                    width = 2.px,
                    style = LineStyle.Solid,
                    color = Theme.Primary.rgb
                )
                .borderRadius(
                    topRight = 20.px,
                    topLeft = 20.px,
                    bottomLeft = 20.px,
                    bottomRight = 0.px
                )
        ) {
            Image(
                src = service.img,
                description = service.imgDesc,
                modifier = Modifier.size(40.px)
            )
        }
        P(
            attrs = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(18.px)
                .fontWeight(FontWeight.Bold)
                .color(Theme.Secondary.rgb)
                .toAttrs()

        ) {
            Text(service.title)
        }
        P(
            attrs = Modifier
                .margin(bottom = 10.px,top = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .fontWeight(FontWeight.Normal)
                .color(Colors.Gray)
                .toAttrs()

        ) {
            Text(service.subTitle)
        }
        P(
            attrs = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(14.px)
                .fontWeight(FontWeight.Normal)
                .color(Theme.Secondary.rgb)
                .toAttrs()

        ) {
            Text(service.desc)
        }

    }
}