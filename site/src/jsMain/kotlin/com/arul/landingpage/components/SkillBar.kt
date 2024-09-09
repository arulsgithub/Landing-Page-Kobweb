package com.arul.landingpage.components

import androidx.compose.runtime.Composable
import com.arul.landingpage.models.Theme
import com.arul.landingpage.utils.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun SkillBar(
    name: String,
    index: Int,
    percentage: CSSSizeValue<CSSUnit.percent> = 50.percent,
    progressBar: CSSSizeValue<CSSUnit.px> = 5.px,
    animatedPercent: Int
){

    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .maxWidth(350.px)
            .padding(bottom = 5.px)
            .padding(top = if(breakpoint>Breakpoint.MD) 0.px else 20.px)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .margin(top = 10.px),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(14.px)
                    .fontWeight(FontWeight.Light)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text(name)
            }
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(14.px)
                    .fontWeight(FontWeight.Light)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ) {
                Text("$animatedPercent%")
            }
        }
        Box(modifier = Modifier.fillMaxWidth()){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(progressBar)
                    .backgroundColor(Theme.LightGray.rgb)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth(percentage)
                    .height(progressBar)
                    .backgroundColor(Theme.Primary.rgb)
                    .transition(
                        CSSTransition(
                            property = "width",
                            duration = 1000.ms,
                            delay = 100.ms * index
                        )
                    )
            )
        }
    }
}