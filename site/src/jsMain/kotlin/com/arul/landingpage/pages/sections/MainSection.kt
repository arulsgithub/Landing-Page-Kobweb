package com.arul.landingpage.pages.sections

import androidx.compose.runtime.Composable
import com.arul.landingpage.components.Header
import com.arul.landingpage.models.Section
import com.arul.landingpage.pages.utils.Constants.SECTION_WIDTH
import com.arul.landingpage.pages.utils.Res
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.px

@Composable
fun MainSection(){

    Box(
        modifier = Modifier
            .maxWidth(SECTION_WIDTH.px)
            .id(Section.Home.id),
        contentAlignment = Alignment.TopCenter
    ) {
        MainBackground()
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
    Header()
}