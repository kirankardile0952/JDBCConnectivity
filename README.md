# JDBCConnectivity

Statement Vs PreparedStatement

1)Statement
-It is used when SQL query is to be executed only once.
-You can not pass parameters at runtime.
-Used for CREATE, ALTER, DROP statements.
-Performance is very low.
-Used to execute normal SQL queries.

2)PreparedStatement
-It is used when SQL query is to be executed multiple times.
-You can pass parameters at runtime.
-Used for the queries which are to be executed multiple times.
-Performance is better than Statement.
-	Used to execute dynamic SQL queries.
