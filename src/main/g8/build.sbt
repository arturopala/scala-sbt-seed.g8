ThisBuild / scalaVersion     := "2.13.3"
ThisBuild / organization     := "com.github.$userNameNoSpaceLowercase$"
ThisBuild / organizationName := "$userName$"
ThisBuild / startYear := Some(2020)

lazy val root = (project in file("."))
  .enablePlugins(AutomateHeaderPlugin)
  .settings(
    name := "$projectNameHyphen$",
    licenses += ("Apache-2.0", new URL("https://www.apache.org/licenses/LICENSE-2.0.txt")),
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.9" % Test,
    excludeFilter in (Compile, unmanagedResources) := NothingFilter,
    scalafmtOnCompile in Compile := true,
    scalafmtOnCompile in Test := true,
    releaseVersionBump := sbtrelease.Version.Bump.Minor,
    publishTo := sonatypePublishTo.value,
    testFrameworks += new TestFramework("munit.Framework"),
    logBuffered := false,
  )