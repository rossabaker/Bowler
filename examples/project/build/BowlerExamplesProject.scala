
import sbt._


class BowlerExamplesProject(info: ProjectInfo) extends DefaultWebProject(info){//} with CucumberProject{
  val bowlerJpa = "org.bowlerframework" % "jpa-mapper_2.8.1" % "0.3"
  val bowlerSqueryl = "org.bowlerframework" % "squeryl-mapper_2.8.1" % "0.3"
  val scalatest = "org.scalatest" % "scalatest" %  "1.3" % "test"
  val hibernateEntityManager = "org.hibernate" % "hibernate-entitymanager" % "3.6.1.Final"

  val hsqldb = "hsqldb" % "hsqldb" % "1.8.0.7" 

  val h2database = "com.h2database" % "h2" % "1.2.144" 

  val c3p0 = "c3p0" % "c3p0" % "0.9.1.2"
	
  val slf4jVersion = "1.6.0"
	
  val sfl4jnop = "org.slf4j" % "slf4j-nop" % slf4jVersion % "runtime"

	val jettyWebapp = "org.eclipse.jetty" % "jetty-webapp" % "7.2.0.v20101020" % "test"

  val servletApi = "javax.servlet" % "servlet-api" % "2.5" % "provided"


  val selenium = "org.seleniumhq.selenium" % "selenium" % "2.0a4" % "test"

  val sonatypeNexusSnapshots = "Sonatype Nexus Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots" 
  val sonatypeNexusReleases = "Sonatype Nexus Releases" at "https://oss.sonatype.org/content/repositories/releases"

  val scalaToolsRepo = "Scala-Tools repo" at "http://scala-tools.org/repo-releases/"

  val jbossRepo = "JBoss repo" at "https://repository.jboss.org/nexus/content/repositories/releases/"
  //val openQaRepo = "Open QA repo" at "http://nexus.openqa.org/content/repositories/releases/"

}