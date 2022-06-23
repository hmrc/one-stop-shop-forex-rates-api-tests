/*
 * Copyright 2022 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.test.api.specs

class RetrieveRatesSpec extends BaseSpec {

  Feature("Retrieve rates from forex-rates service") {

    Scenario("Use test-only endpoint to successfully retrieve rates from forex-rates service") {

      Given("There are rates available")

      forexRatesHelper.triggerRssFeedRetrieval()

      When("The test-only endpoint is called")

      val response = retrieveRatesHelper.retrieveRatesAPI.retrieveRates

      Then("The rates are retrieved from the forex-rates service")

      response.status shouldBe 200

    }

  }
}
