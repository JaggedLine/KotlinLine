import kotlinx.css.*
import styled.StyleSheet

object GamePageStyles : StyleSheet("GamePageStyles", isStatic = true) {
    val pageLayout by css {
        display = Display.flex
        flexDirection = FlexDirection.row
        flexWrap = FlexWrap.wrap
        fontSize = 25.px
    }
    val fieldContainer by css {
        display = Display.flex
        flexGrow = 5.0
        flexShrink = 0.0
        flexBasis = FlexBasis("400px")
        minHeight = 400.px
        padding(30.px)
        backgroundColor = rgb(237, 255, 250)
    }
    val rightContainer by css {
        display = Display.flex
        flexDirection = FlexDirection.column
        flexGrow = 1.0
        flexShrink = 0.0
        flexBasis = FlexBasis("400px")
        backgroundColor = rgb(217, 232, 230)
    }
    val submitSection by css {
        display = Display.flex
        flexDirection = FlexDirection.column
        padding(30.px)
    }
    val sizeRow by css {
        display = Display.flex
        flexDirection = FlexDirection.row
    }
    val sizeTitle by css {
        margin(0.px, LinearDimension.auto, 0.px, 0.px)
        fontWeight = FontWeight.normal
    }
    val sizeValue by css {
        margin(0.px)
        fontSize = 0.9.em
    }
    val nameInput by css {
        marginTop = 30.px
        width = 100.pct
        fontSize = 1.em
        textAlign = TextAlign.center
    }
    val submitButton by css {
        marginTop = 20.px
        fontSize = 1.em
    }
    val enterGodModeButton = submitButton

    val godSettingsSection by css {
        display = Display.flex
        flexDirection = FlexDirection.column
        padding(30.px)
    }
    val godSettingsRow by css {
        display = Display.flex
        flexDirection = FlexDirection.row
        alignItems = Align.center
        marginBottom = 10.px
    }
    val godSettingsRowTitle by css {
        flexGrow = 2.0
        flexBasis = FlexBasis("0")
        margin(0.px)
        fontWeight = FontWeight.normal
    }
    val godSettingsRowLabel by css {
        flexGrow = 1.0
        flexBasis = FlexBasis("0")
    }
    val godSettingsRowInput by css {
        width = 100.pct
        fontSize = 1.em
        textAlign = TextAlign.center
    }
    val godSettingsRowSplitter by css {
        width = 40.px
        textAlign = TextAlign.center
    }
    val godSettingsApply by css {
        marginTop = 20.px
        fontSize = 1.em
    }
    val godComputerSection by css {
        display = Display.flex
        flexDirection = FlexDirection.column
        padding(0.px, 30.px, 30.px, 30.px)
        marginTop = LinearDimension.auto
    }
    val godComputerScore by css {
        margin(0.px)
        fontWeight = FontWeight.normal
        textAlign = TextAlign.center
    }
    val godComputerStart by css {
        marginTop = 10.px
        fontSize = 1.em
    }
}