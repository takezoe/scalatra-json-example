# My Scalatra Web App #

## Build & Run ##

```sh
$ cd my-scalatra-web-app
$ sbt
> jetty:start
```

Send a request as follows:

```
$ curl -XPOST 'http://localhost:8080/my/endpoint' -H 'Content-Type: application/json' -d'{"name": "Scalatra"}'
```
