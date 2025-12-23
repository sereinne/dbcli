package com.github.sereinne.dbcli;

import org.jline.reader.Candidate;
import org.jline.reader.impl.completer.StringsCompleter;

// All possible dot commands
public class DbCompletion {

    public static StringsCompleter getDotAutoComplete() {
        Candidate[] candidates = {
            // new Candidate(value, displ, group, descr, suffix, key, complete, sort)
            new Candidate(
                ".archive",
                ".archive",
                null,
                "Manage SQL archives",
                null,
                null,
                true
            ),
            new Candidate(
                ".auth",
                ".auth",
                null,
                "Show authorizer callbacks",
                null,
                null,
                true
            ),
            new Candidate(
                ".backup",
                ".backup",
                null,
                "Backup DB (default \"main\") to FILE",
                null,
                null,
                true
            ),
            new Candidate(
                ".bail",
                ".bail",
                null,
                "Stop after hitting an error.  Default OFF",
                null,
                null,
                true
            ),
            new Candidate(
                ".cd",
                ".cd",
                null,
                "Change the working directory to DIRECTORY",
                null,
                null,
                true
            ),
            new Candidate(
                ".changes",
                ".changes",
                null,
                "Show number of rows changed by SQL",
                null,
                null,
                true
            ),
            new Candidate(
                ".check",
                ".check",
                null,
                "Fail if output since .testcase does not match",
                null,
                null,
                true
            ),
            new Candidate(
                ".clone",
                ".clone",
                null,
                "Clone data into NEWDB from the existing database",
                null,
                null,
                true
            ),
            new Candidate(
                ".connection",
                ".connection",
                null,
                "Open or close an auxiliary database connection",
                null,
                null,
                true
            ),
            new Candidate(
                ".crlf",
                ".crlf",
                null,
                "Whether or not to use \\r\\n line endings",
                null,
                null,
                true
            ),
            new Candidate(
                ".databases",
                ".databases",
                null,
                "List names and files of attached databases",
                null,
                null,
                true
            ),
            new Candidate(
                ".dbconfig",
                ".dbconfig",
                null,
                "List or change sqlite3_db_config() options",
                null,
                null,
                true
            ),
            new Candidate(
                ".dbinfo",
                ".dbinfo",
                null,
                "Show status information about the database",
                null,
                null,
                true
            ),
            new Candidate(
                ".dbtotxt",
                ".dbtotxt",
                null,
                "Hex dump of the database file",
                null,
                null,
                true
            ),
            new Candidate(
                ".dump",
                ".dump",
                null,
                "Render database content as SQL",
                null,
                null,
                true
            ),
            new Candidate(
                ".echo",
                ".echo",
                null,
                "Turn command echo on or off",
                null,
                null,
                true
            ),
            new Candidate(
                ".eqp",
                ".eqp",
                null,
                "Enable or disable automatic EXPLAIN QUERY PLAN",
                null,
                null,
                true
            ),
            new Candidate(
                ".excel",
                ".excel",
                null,
                "Display the output of next command in spreadsheet",
                null,
                null,
                true
            ),
            new Candidate(
                ".exit",
                ".exit",
                null,
                "Exit this program with return-code CODE",
                null,
                null,
                true
            ),
            new Candidate(
                ".expert",
                ".expert",
                null,
                "EXPERIMENTAL. Suggest indexes for queries",
                null,
                null,
                true
            ),
            new Candidate(
                ".explain",
                ".explain",
                null,
                "Change the EXPLAIN formatting mode.  Default: auto",
                null,
                null,
                true
            ),
            new Candidate(
                ".filectrl",
                ".filectrl",
                null,
                "Run various sqlite3_file_control() operations",
                null,
                null,
                true
            ),
            new Candidate(
                ".fullschema",
                ".fullschema",
                null,
                "Show schema and the content of sqlite_stat tables",
                null,
                null,
                true
            ),
            new Candidate(
                ".headers",
                ".headers",
                null,
                "Turn display of headers on or off",
                null,
                null,
                true
            ),
            new Candidate(
                ".help",
                ".help",
                null,
                "Show help text for PATTERN",
                null,
                null,
                true
            ),
            new Candidate(
                ".import",
                ".import",
                null,
                "Import data from FILE into TABLE",
                null,
                null,
                true
            ),
            new Candidate(
                ".imposter",
                ".imposter",
                null,
                "Create imposter table TABLE on index INDEX",
                null,
                null,
                true
            ),
            new Candidate(
                ".indexes",
                ".indexes",
                null,
                "Show names of indexes",
                null,
                null,
                true
            ),
            new Candidate(
                ".intck",
                ".intck",
                null,
                "Run an incremental integrity check on the db",
                null,
                null,
                true
            ),
            new Candidate(
                ".limit",
                ".limit",
                null,
                "Display or change the value of an SQLITE_LIMIT",
                null,
                null,
                true
            ),
            new Candidate(
                ".lint",
                ".lint",
                null,
                "Report potential schema issues.",
                null,
                null,
                true
            ),
            new Candidate(
                ".load",
                ".load",
                null,
                "Load an extension library",
                null,
                null,
                true
            ),
            new Candidate(
                ".log",
                ".log",
                null,
                "Turn logging on or off.  FILE can be stderr/stdout",
                null,
                null,
                true
            ),
            new Candidate(
                ".mode",
                ".mode",
                null,
                "Set output mode",
                null,
                null,
                true
            ),
            new Candidate(
                ".nonce",
                ".nonce",
                null,
                "Suspend safe mode for one command if nonce matches",
                null,
                null,
                true
            ),
            new Candidate(
                ".nullvalue",
                ".nullvalue",
                null,
                "Use STRING in place of NULL values",
                null,
                null,
                true
            ),
            new Candidate(
                ".once",
                ".once",
                null,
                "Output for the next SQL command only to FILE",
                null,
                null,
                true
            ),
            new Candidate(
                ".open",
                ".open",
                null,
                "Close existing database and reopen FILE",
                null,
                null,
                true
            ),
            new Candidate(
                ".output",
                ".output",
                null,
                "Send output to FILE or stdout if FILE is omitted",
                null,
                null,
                true
            ),
            new Candidate(
                ".parameter",
                ".parameter",
                null,
                "Manage SQL parameter bindings",
                null,
                null,
                true
            ),
            new Candidate(
                ".print",
                ".print",
                null,
                "Print literal STRING",
                null,
                null,
                true
            ),
            new Candidate(
                ".progress",
                ".progress",
                null,
                "Invoke progress handler after every N opcodes",
                null,
                null,
                true
            ),
            new Candidate(
                ".prompt",
                ".prompt",
                null,
                "Replace the standard prompts",
                null,
                null,
                true
            ),
            new Candidate(
                ".quit",
                ".quit",
                null,
                "Stop interpreting input stream, exit if primary.",
                null,
                null,
                true
            ),
            new Candidate(
                ".read",
                ".read",
                null,
                "Read input from FILE or command output",
                null,
                null,
                true
            ),
            new Candidate(
                ".recover",
                ".recover",
                null,
                "Recover as much data as possible from corrupt db.",
                null,
                null,
                true
            ),
            new Candidate(
                ".restore",
                ".restore",
                null,
                "Restore content of DB (default \"main\") from FILE",
                null,
                null,
                true
            ),
            new Candidate(
                ".save",
                ".save",
                null,
                "Write database to FILE (an alias for .backup ...)",
                null,
                null,
                true
            ),
            new Candidate(
                ".scanstats",
                ".scanstats",
                null,
                "Turn sqlite3_stmt_scanstatus() metrics on or off",
                null,
                null,
                true
            ),
            new Candidate(
                ".schema",
                ".schema",
                null,
                "Show the CREATE statements matching PATTERN",
                null,
                null,
                true
            ),
            new Candidate(
                ".separator",
                ".separator",
                null,
                "Change the column and row separators",
                null,
                null,
                true
            ),
            new Candidate(
                ".session",
                ".session",
                null,
                "Create or control sessions",
                null,
                null,
                true
            ),
            new Candidate(
                ".sha3sum",
                ".sha3sum",
                null,
                "Compute a SHA3 hash of database content",
                null,
                null,
                true
            ),
            new Candidate(
                ".shell",
                ".shell",
                null,
                "Run CMD ARGS... in a system shell",
                null,
                null,
                true
            ),
            new Candidate(
                ".show",
                ".show",
                null,
                "Show the current values for various settings",
                null,
                null,
                true
            ),
            new Candidate(
                ".stats",
                ".stats",
                null,
                "Show stats or turn stats on or off",
                null,
                null,
                true
            ),
            new Candidate(
                ".system",
                ".system",
                null,
                "Run CMD ARGS... in a system shell",
                null,
                null,
                true
            ),
            new Candidate(
                ".tables",
                ".tables",
                null,
                "List names of tables matching LIKE pattern TABLE",
                null,
                null,
                true
            ),
            new Candidate(
                ".timeout",
                ".timeout",
                null,
                "Try opening locked tables for MS milliseconds",
                null,
                null,
                true
            ),
            new Candidate(
                ".timer",
                ".timer",
                null,
                "Turn SQL timer on or off",
                null,
                null,
                true
            ),
            new Candidate(
                ".trace",
                ".trace",
                null,
                "Output each SQL statement as it is run",
                null,
                null,
                true
            ),
            new Candidate(
                ".unmodule",
                ".unmodule",
                null,
                "Unregister virtual table modules",
                null,
                null,
                true
            ),
            new Candidate(
                ".version",
                ".version",
                null,
                "Show source, library and compiler versions",
                null,
                null,
                true
            ),
            new Candidate(
                ".vfsinfo",
                ".vfsinfo",
                null,
                "Information about the top-level VFS",
                null,
                null,
                true
            ),
            new Candidate(
                ".vfslist",
                ".vfslist",
                null,
                "List all available VFSes",
                null,
                null,
                true
            ),
            new Candidate(
                ".vfsname",
                ".vfsname",
                null,
                "Print the name of the VFS stack",
                null,
                null,
                true
            ),
            new Candidate(
                ".width",
                ".width",
                null,
                "Set minimum column widths for columnar output",
                null,
                null,
                true
            ),
            new Candidate(
                ".www",
                ".www",
                null,
                "Display output of the next command in web browser",
                null,
                null,
                true
            ),
        };
        return new StringsCompleter(candidates);
    }
}
