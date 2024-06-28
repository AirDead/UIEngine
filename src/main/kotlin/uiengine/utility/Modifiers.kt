package ru.airdead.uiengine.utility

/**
 * Enum class representing different keyboard modifiers.
 */
enum class Modifiers {
    SHIFT,
    CONTROL,
    ALT,
    META
}

/**
 * Type alias for a handler function that processes button context.
 */
typealias ButtonHandler = ButtonContext.() -> Unit

/**
 * Data class representing the context of a button event.
 *
 * @property keyCode The key code of the button.
 * @property modifiers The set of active modifiers.
 */
data class ButtonContext(val keyCode: Int, val modifiers: Set<Modifiers>)