package com.github.sereinne.shqlite;

import org.jline.reader.impl.completer.StringsCompleter;

public class DbCompletion {

    public static StringsCompleter getDotAutoComplete() {
        return new StringsCompleter(DotCommands.candidates);
    }
}
