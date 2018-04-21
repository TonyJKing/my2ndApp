package io.github.toca.application.cucumber.stepdefs;

import io.github.toca.application.My2NdApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = My2NdApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
