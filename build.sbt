import com.twitter.scrooge.ScroogeSBT
import sbt.Keys._

val commonSettings = Seq(
  organization := "me",
  scalaVersion := "2.11.7"
)

lazy val root = Project("root", file("."), settings = commonSettings ++ ScroogeSBT.newSettings)
  .settings(
    name := "scrooge-test",
    version := "0.1-SNAPSHOT",
    mainClass := Some("me.Start"),
    libraryDependencies ++= Seq(
      "com.twitter" %% "scrooge-core" % "4.2.0",
      "org.apache.thrift" % "libthrift" % "0.9.2",
      "com.twitter" %% "finagle-thrift" % "6.25.0"
    )
  )
