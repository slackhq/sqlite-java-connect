# Hello SQLLite3

This is a minimal repo project that connects to a sqlite3 database and returns a single row. 

The database (`hello.db`) exists in this repo. 

In addition, for simplicity, rather thatn use a depency manager (i.e Maven etc), `sqlite-jdbc-3.23.1.jar` is checked into the same repo

To run (from the repo root directory)

```
javac  src/hellosqlite3/HelloSQLite3.java
java -classpath "src:lib/sqlite-jdbc-3.23.1.jar" hellosqlite3.HelloSQLite3
```

You should get the following output

```
Connection to SQLite has been established.
Found Donkey Kong
```
