package com.arul.landingpage.sections

import androidx.compose.runtime.Composable
import com.arul.landingpage.models.Section
import com.arul.landingpage.utils.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import org.jetbrains.compose.web.css.px

@Composable
fun ServiceSection(){

    Box(
        modifier = Modifier
            .maxWidth(SECTION_WIDTH.px)
            .id(Section.Service.id)
            .margin(topBottom = 100.px),
        contentAlignment = Alignment.Center
    ) {
        ServiceContent()
    }
}

@Composable
fun ServiceContent(){

}