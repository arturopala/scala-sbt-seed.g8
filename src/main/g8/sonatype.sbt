// To sync with Maven central, you need to supply the following information:
pomExtra in Global := {
  <url>github.com/$userNameNoSpaceLowercase$/$projectNameHyphen$</url>
  <scm>
    <connection>https://github.com/$userNameNoSpaceLowercase$/$projectNameHyphen$.git</connection>
    <developerConnection>git@github.com:$userNameNoSpaceLowercase$/$projectNameHyphen$.git</developerConnection>
    <url>github.com/$userNameNoSpaceLowercase$/$projectNameHyphen$</url>
  </scm>
  <developers>
    <developer>
      <id>$userNameNoSpaceLowercase$</id>
      <name>$userName$</name>
      <url>https://pl.linkedin.com/in/$userNameNoSpaceLowercase$</url>
    </developer>
  </developers>
}

import ReleaseTransformations._

releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  commitReleaseVersion,
  tagRelease,
  ReleaseStep(action = Command.process("publishSigned", _)),
  setNextVersion,
  commitNextVersion,
  ReleaseStep(action = Command.process("sonatypeRelease", _)),
  pushChanges
)

releaseUseGlobalVersion := false