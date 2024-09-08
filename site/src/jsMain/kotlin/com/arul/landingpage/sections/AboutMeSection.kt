package com.arul.landingpage.sections

import androidx.compose.runtime.Composable
import com.arul.landingpage.components.SectionTitle
import com.arul.landingpage.components.SkillBar
import com.arul.landingpage.models.Section
import com.arul.landingpage.models.Skills
import com.arul.landingpage.models.Theme
import com.arul.landingpage.utils.Constants.FONT_FAMILY
import com.arul.landingpage.utils.Constants.LOREM_SHORT
import com.arul.landingpage.utils.Constants.SECTION_WIDTH
import com.arul.landingpage.utils.Res.image.aboutImage
import com.arul.landingpage.utils.Res.image.mainImage
import com.arul.landingpage.styles.aboutImageStyle
import com.arul.landingpage.styles.aboutTextStyle
import com.varabyte.kobweb.compose.css.Content
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun AboutMeSection() {

    Box(
        modifier = Modifier
            .maxWidth(SECTION_WIDTH.px)
            .id(Section.About.id)
            .margin(topBottom = 150.px),
        contentAlignment = Alignment.Center
    ) {
       AboutMeContent()
    }
}

@Composable
fun AboutMeContent(){

    val breakpoint = rememberBreakpoint()

    Column(
        modifier = Modifier
            .fillMaxWidth(
                if(breakpoint >= Breakpoint.MD) 100.percent else 90.percent
            )
            .maxWidth(1200.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SimpleGrid(
            modifier = Modifier.fillMaxWidth(
                if(breakpoint>=Breakpoint.MD) 100.percent else 90.percent),
            numColumns = numColumns(base = 1, md = 2)
        ){
            if(breakpoint>=Breakpoint.MD) {
                AboutMeImage()
            }
            AboutMeText()
        }
    }
}

@Composable
fun AboutMeImage(){
    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Image(
            modifier = aboutImageStyle.toModifier()
                .fillMaxWidth()
                .height(500.px)
                .width(300.px),
            src = aboutImage,
            description = "about"
        )
    }
}

@Composable
fun AboutMeText(){

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        SectionTitle(section = Section.About)

        P(
            attrs = aboutTextStyle.toModifier()
                .maxWidth(500.px)
                .margin(topBottom = 25.px)
                .fontFamily(FONT_FAMILY)
                .fontSize(18.px)
                .fontWeight(FontWeight.Normal)
                .fontStyle(FontStyle.Italic)
                .color(Theme.Secondary.rgb)
                .toAttrs()

        ) {
            Text(LOREM_SHORT)
        }
        Skills.entries.forEach {
            SkillBar(
                name = it.title,
                percentage = it.percent
            )
        }
    }
}
