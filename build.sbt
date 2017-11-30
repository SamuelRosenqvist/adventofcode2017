import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "https://github.com/Samulito",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Advent of Code 2017 http://adventofcode.com/",
    libraryDependencies += scalaTest % Test
  )
