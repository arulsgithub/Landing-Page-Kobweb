package com.arul.landingpage.components

import androidx.compose.runtime.Composable
import com.arul.landingpage.styles.SocialLinkStyle
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px

@Composable
fun SocialBar(){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .margin(right = 25.px)
            .padding(topBottom = 25.px)
            .minWidth(40.px)
            .borderRadius(20.px)
            .backgroundColor(Color.white)
    ) {
        SocialLink()
    }
}

@Composable
fun SocialLink(){

    Link(
        path = "https://instagram.com"
    ){
        FaInstagram(
            modifier = SocialLinkStyle.toModifier()
                .margin(bottom = 40.px),
            size = IconSize.LG
        )
    }
    Link(
        path = "https://facebook.com"
    ){
        FaFacebook(
            modifier = SocialLinkStyle.toModifier()
                .margin(bottom = 40.px),
            size = IconSize.LG
        )
    }
    Link(
        path = "https://www.linkedin.com/in/arulmurugan-s-661016288/"
    ){
        FaLinkedin(
            modifier = SocialLinkStyle.toModifier()
                .margin(bottom = 40.px),
            size = IconSize.LG
        )
    }
    Link(
        path = "https://github.com/arulsgithub"
    ){
        FaGithub(
            SocialLinkStyle.toModifier(),
            size = IconSize.LG
        )
    }
}