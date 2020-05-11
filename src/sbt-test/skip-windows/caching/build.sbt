import _root_.scalafix.sbt.{BuildInfo => Versions}

inThisBuild(
  List(
    scalaVersion := Versions.scala212,
    addCompilerPlugin(scalafixSemanticdb),
    scalacOptions += "-Yrangepos",
    scalacOptions += "-Ywarn-unused", // for RemoveUnused
    scalafixCaching := true
  )
)