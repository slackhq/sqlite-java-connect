# Hello SQLLite3

This is a minimal repo project that connects to a sqlite3 database and returns a single row. 

The database (`movies.db`) exists in this repo, and is a database of the top 250 movies from the Internet Movie Database (IMDB). For simplicity's sake, it is not fully normalized. We will not be using this particular dataset during your onsite, but you can use it to familiarize yourself with SQLite and make sure you can access it from your preferred language.

In addition, for simplicity, rather thatn use a depency manager (i.e Maven etc), `sqlite-jdbc-3.23.1.jar` is checked into the same repo

To run (from the repo root directory)

```
javac  src/hellosqlite3/HelloSQLite3.java
java -classpath "src:lib/sqlite-jdbc-3.23.1.jar" hellosqlite3.HelloSQLite3
```

You should get the following output

```
Connection to SQLite has been established.
Found Henry Fonda
```

## Preparing for the onsite

We want you to feel prepared for the on-site. Before you arrive, be able to answer the following questions:

1. What is the longest-running movie?
2. What movie has the most actors?
3. What is the breakdown of top movies by rating?
