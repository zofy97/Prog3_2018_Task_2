package Crossing;

/**
 * @Sophie Schauer s0559289
 * This interface is for the input event.
 */

import java.util.EventListener;

public interface InputEventListener extends EventListener {
    void onInputEvent(InputEvent event);
}
