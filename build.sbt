name := "gitbucket-registry-plugin"

organization := "io.github.gitbucket"

version := "1.0.0"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "io.github.gitbucket" %% "gitbucket"         % "4.19.0-SNAPSHOT" % "provided",
  "javax.servlet"        % "javax.servlet-api" % "3.1.0"  % "provided"
)

resolvers += Resolver.bintrayRepo("bkromhout", "maven")