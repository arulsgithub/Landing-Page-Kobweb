package com.arul.landingpage.pages

import androidx.compose.runtime.*
import com.arul.landingpage.sections.AboutMeContent
import com.arul.landingpage.sections.AboutMeSection
import com.arul.landingpage.sections.MainSection
import com.arul.landingpage.sections.ServiceSection
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Text
import com.varabyte.kobweb.worker.rememberWorker
import com.arul.landingpage.worker.EchoWorker
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column

@Page
@Composable
fun HomePage() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MainSection()
        AboutMeSection()
        ServiceSection()
    }
}
