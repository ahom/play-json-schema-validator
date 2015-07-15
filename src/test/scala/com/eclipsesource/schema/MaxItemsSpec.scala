package com.eclipsesource.schema

import java.net.URL

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class MaxItemsSpec extends Specification {

  "MaxItems" should {
    "validate" in {
      val resourceUrl: URL = getClass.getResource("/draft4/maxItems.json")
      foreach(JsonSpec.examplesFromUrl(resourceUrl))(example => example.execute)
    }
  }

}

