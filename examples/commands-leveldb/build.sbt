name := "commands-leveldb"

scalaVersion := "2.11.1"

resolvers += 
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.12.0-SNAPSHOT",
  "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.8"
//  "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.7"
//  "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.6.1"
//  "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.5"
//  "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.4.1"
//  "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.3"
//  "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.2"
//  "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.1"
)

javacOptions ++= Seq("-Xmx1024M")

// JNI workaround, http://stackoverflow.com/questions/19425613/unsatisfiedlinkerror-with-native-library-under-sbt
fork := true
