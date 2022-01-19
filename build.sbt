ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

Compile/mainClass := Some("Problems.Problems")

lazy val root = (project in file("."))
  .settings(
    name := "ScalaProblems99"
  )
