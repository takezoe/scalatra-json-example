package com.example.app

import org.scalatra._

// JSON-related libraries
import org.json4s.{DefaultFormats, Formats}

// JSON handling support from Scalatra
import org.scalatra.json._



class MyScalatraServlet extends ScalatraServlet with JacksonJsonSupport {

  protected implicit lazy val jsonFormats: Formats = DefaultFormats

  get("/") {
    views.html.hello()
  }

  post("/my/endpoint"){
    val json = parse(request.body)
    val person = json.extract[Person]
    println(person)
  }

}

case class Person(name : String) {
  override def toString() = s"My name is $name"
}

