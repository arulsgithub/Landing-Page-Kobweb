package com.arul.landingpage.styles

import androidx.compose.runtime.Composable
import com.arul.landingpage.models.Theme
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.anyLink
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*

val NavigationItemStyle by ComponentStyle {

    base {
        Modifier
            .color(Theme.Secondary.rgb)
            .transition(CSSTransition(property = "color",duration = 200.ms))
    }
    anyLink{
        Modifier
            .color(Theme.Secondary.rgb)
    }
    hover{
        Modifier
            .color(Theme.Primary.rgb)
    }
}

val LogoStyle by ComponentStyle {

    base {
        Modifier
            .transform { rotate(0.deg) }
            .color(Theme.Secondary.rgb)
            .transition(CSSTransition(property = "transform",duration = 200.ms))
    }

    hover{
        Modifier
            .transform { rotate((-10).deg) }
            .color(Theme.Primary.rgb)
    }
}

val SocialLinkStyle by ComponentStyle {

    base {
        Modifier
            .color(Color.gray)
            .transition(CSSTransition(property = "color",duration = 200.ms))
    }
    anyLink{
        Modifier
            .color(Color.gray)
    }
    hover{
        Modifier
            .color(Theme.Primary.rgb)
    }
}

val MainTextButtonStyle by ComponentStyle{

    base {
        Modifier.width(100.px)
            .transition(CSSTransition(property = "width",duration = 200.ms))
    }
    hover{
        Modifier.width(120.px)
    }
}

@OptIn(ExperimentalComposeWebApi::class)
val mainImageStyle by ComponentStyle{

    base {
        Modifier
            .styleModifier {
                filter { grayscale(100.percent) }
            }
            .transition(CSSTransition(property = TransitionProperty.All, duration = 200.ms))
    }
    hover{
        Modifier
            .styleModifier {
                filter { grayscale(0.percent) }
            }
    }
}
