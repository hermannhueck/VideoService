package videosvc.test

import org.junit.runner._
import org.specs2.mutable._
import org.specs2.runner._
import play.api.test._

@RunWith(classOf[JUnitRunner])
class IntegrationSpec extends Specification {

  "Application" should {

    "work from within a browser" in new WithBrowser {

      browser.goTo("http://localhost:" + port)

      browser.pageSource must contain ("TODO")
      browser.pageSource must contain ("Action not implemented yet")
    }
  }
}
