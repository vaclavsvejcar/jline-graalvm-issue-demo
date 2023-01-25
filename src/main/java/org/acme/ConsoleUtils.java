package org.acme;

import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.jline.utils.InfoCmp;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConsoleUtils {

    private Terminal terminal;

    @PostConstruct
    void postConstruct() throws IOException {
        this.terminal = TerminalBuilder.terminal();
    }

    boolean supportsCursorUp() {
        return terminal.getStringCapability(InfoCmp.Capability.cursor_up) != null;
    }
}
