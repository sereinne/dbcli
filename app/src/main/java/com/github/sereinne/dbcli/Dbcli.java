package com.github.sereinne.dbcli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.jline.reader.Completer;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

public class Dbcli {

    public static void handleDotCommands(Terminal terminal, String query) {
        switch (query) {
            case ".archive" -> {}
            case ".auth" -> {}
            case ".backup" -> {}
            case ".bail" -> {}
            case ".cd" -> {}
            case ".changes" -> {}
            case ".check" -> {}
            case ".clone" -> {}
            case ".connection" -> {}
            case ".crlf" -> {}
            case ".databases" -> {}
            case ".dbconfig" -> {}
            case ".dbinfo" -> {}
            case ".dbtotxt" -> {}
            case ".dump" -> {}
            case ".echo" -> {}
            case ".eqp" -> {}
            case ".excel" -> {}
            // case ".exit" -> {}
            case ".expert" -> {}
            case ".explain" -> {}
            case ".filectrl" -> {}
            case ".fullschema" -> {}
            case ".headers" -> {}
            case ".help" -> {}
            case ".import" -> {}
            case ".imposter" -> {}
            case ".indexes" -> {}
            case ".intck" -> {}
            case ".limit" -> {}
            case ".lint" -> {}
            case ".load" -> {}
            case ".log" -> {}
            case ".mode" -> {}
            case ".nonce" -> {}
            case ".nullvalue" -> {}
            case ".once" -> {}
            case ".open" -> {}
            case ".output" -> {}
            case ".parameter" -> {}
            case ".print" -> {}
            case ".progress" -> {}
            case ".prompt" -> {}
            // case ".quit" -> {}
            case ".read" -> {}
            case ".recover" -> {}
            case ".restore" -> {}
            case ".save" -> {}
            case ".scanstats" -> {}
            case ".schema" -> {}
            case ".separator" -> {}
            case ".session" -> {}
            case ".sha3sum" -> {}
            case ".shell" -> {}
            case ".show" -> {}
            case ".stats" -> {}
            case ".system" -> {}
            case ".tables" -> {}
            case ".timeout" -> {}
            case ".timer" -> {}
            case ".trace" -> {}
            case ".unmodule" -> {}
            case ".version" -> {}
            case ".vfsinfo" -> {}
            case ".vfslist" -> {}
            case ".vfsname" -> {}
            case ".width" -> {}
            case ".www" -> {}
        }
    }

    public static void main(String[] args) {
        String path = args.length <= 0 ? "" : args[0];

        Completer completer = DbCompletion.getDotAutoComplete();

        try {
            Terminal terminal = TerminalBuilder.builder()
                .system(true)
                .provider("ffm")
                .dumb(false)
                .build();

            LineReader reader = LineReaderBuilder.builder()
                .terminal(terminal)
                .completer(completer)
                .build();

            Connection conn = DriverManager.getConnection(
                "jdbc:sqlite:" + path
            );
            Statement stmt = conn.createStatement();

            while (true) {
                String query = reader.readLine("dbcli> ");

                if (query.equals(".quit") || query.equals(".exit")) {
                    break;
                }

                handleDotCommands(terminal, query);

                boolean hasResultSet = stmt.execute(query.trim());
                if (!hasResultSet) {
                    // this must be an INSERT, UPDATE or DELETE statement
                    terminal
                        .writer()
                        .println("Successfully executed statement");
                    terminal.flush();
                } else {
                    // this must be a SELECT statement
                }
                terminal.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
