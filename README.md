# My Scalatra Web App #

## Build & Run ##

First, start the application:

```sh
$ sbt ~jetty:start
```

Then, send a request from the another console:

```sh
$ curl -XPOST 'http://localhost:8080/my/endpoint' -H 'Content-Type: application/json' -d'{"name": "Scalatra"}'
```

As a result, the following line would be displayed on the first console:

```
My name is Scalatra
```

