package io.cucumber.skeleton

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    fun I_have_cukes_in_my_belly(cukes: Int) {
        val belly = Belly()
        belly.eat(cukes)
    }

    @When("I wait {int} hour")
    fun iWaitHour(hours: Int) {
    }

    @Then("my belly should growl")
    fun myBellyShouldGrowl() {
        println("YES!!")
    }
}
