package com.arul.landingpage.sections

import androidx.compose.runtime.Composable
import com.arul.landingpage.components.Header
import com.arul.landingpage.components.SocialBar
import com.arul.landingpage.models.Section
import com.arul.landingpage.models.Theme
import com.arul.landingpage.utils.Constants.FONT_FAMILY
import com.arul.landingpage.utils.Constants.LOREM
import com.arul.landingpage.utils.Constants.SECTION_WIDTH
import com.arul.landingpage.utils.Res
import com.arul.landingpage.utils.Res.image.mainImage
import com.arul.landingpage.styles.MainTextButtonStyle
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.functions.brightness
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun MainSection(){


    Box(
        modifier = Modifier
            .maxWidth(SECTION_WIDTH.px)
            .id(Section.Home.id),
        contentAlignment = Alignment.TopCenter
    ) {
        MainBackground()
        MainContent()
    }
}

@Composable
fun MainBackground(){

    Image(
        modifier = Modifier.fillMaxSize()
            .objectFit(ObjectFit.Cover),
        src = Res.image.background,
        description = "bg_image"

    )

}

@Composable
fun MainContent(){

    var breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Header()
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier.fillMaxSize()
        ) {
            SimpleGrid(
                modifier = Modifier.fillMaxWidth(
                    if(breakpoint>Breakpoint.MD) 80.percent else 95.percent
                ),
                numColumns = numColumns(base = 1,md = 2)
            ){
                MainText(breakpoint = breakpoint)
                MainImage()
            }
        }

    }
}

@Composable
fun MainText(breakpoint: Breakpoint){

    Row (
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ){
        if(breakpoint>Breakpoint.MD){
            SocialBar()
        }

        Column {
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(
                        if(breakpoint>Breakpoint.MD) 45.px else 30.px
                    )
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Primary.rgb)
                    .toAttrs()

            ) {
                Text("Hello, I'm")
            }

            P(
                attrs = Modifier
                    .margin(top = 20.px, bottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(
                        if(breakpoint>Breakpoint.MD) 68.px else 45.px
                    )
                    .fontWeight(FontWeight.Bolder)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()

            ) {
                Text("Arulmurugan")
            }

            P(
                attrs = Modifier
                    .margin(top = 10.px, bottom = 5.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(
                        if(breakpoint>Breakpoint.MD) 25.px else 20.px
                    )
                    .fontWeight(FontWeight.Bold)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()

            ) {
                Text("Kotlin Mobile & Web Developer/Designer")
            }

            P(
                attrs = Modifier
                    .margin(bottom = 25.px)
                    .maxWidth(400.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(10.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()

            ) {
                Text(LOREM)
            }
            Button(
                attrs = MainTextButtonStyle.toModifier()
                    .height(40.px)
                    .border(width = 0.px)
                    .borderRadius(r = 5.px)
                    .backgroundColor(Theme.Primary.rgb)
                    .color(Colors.White)
                    .cursor(Cursor.Pointer)
                    .toAttrs()
            ) {
                Link(
                    modifier = Modifier
                        .color(Colors.White)
                        .textDecorationLine(TextDecorationLine.None),
                    path = Section.Contact.path,
                    text = "Hire me"
                )
            }
        }

    }
}

@Composable
fun MainImage(){

    Column (
        modifier = Modifier.fillMaxSize(80.percent),
        verticalArrangement = Arrangement.Center
    ){
        Image(
            modifier = Modifier.fillMaxWidth().size(500.px),
            src = mainImage,
            description = "My image"
        )
    }
}