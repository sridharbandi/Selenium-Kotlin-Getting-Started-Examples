package com.tech.selenium.tests

import com.tech.selenium.stepdefinitions.GoogleSteps
import org.jbehave.core.configuration.MostUsefulConfiguration
import org.jbehave.core.embedder.Embedder
import org.jbehave.core.io.CodeLocations
import org.jbehave.core.io.LoadFromClasspath
import org.jbehave.core.junit.JUnitStories
import org.jbehave.core.configuration.Configuration
import org.jbehave.core.reporters.Format
import org.jbehave.core.reporters.StoryReporterBuilder
import org.jbehave.core.steps.InjectableStepsFactory
import org.jbehave.core.steps.InstanceStepsFactory

import java.util.Arrays

/**
 * Created by Sridhar Bandi on 19/06/19.
 */
class TestMapper : JUnitStories() {

    override fun configuredEmbedder(): Embedder {
        val embedder = Embedder()
        embedder.embedderControls()
            .useThreads(1)
            .doGenerateViewAfterStories(true)
            .doIgnoreFailureInStories(false)
            .doIgnoreFailureInView(false)
            .doVerboseFailures(true)

        val configuration = configuration()

        embedder.useConfiguration(configuration)
        embedder.useStepsFactory(stepsFactory())

        return embedder
    }

    override fun configuration(): Configuration {
        return MostUsefulConfiguration()
            .useStoryLoader(
                LoadFromClasspath(this.javaClass)
            )
            .useFailureStrategy { throwable -> throw throwable }
            .useStoryReporterBuilder(
                StoryReporterBuilder().withCodeLocation(
                    CodeLocations.codeLocationFromClass(this.javaClass)
                )
                    .withFormats(
                        Format.TXT,
                        Format.CONSOLE
                    )
                    .withFailureTrace(true)
            )
    }

    override fun stepsFactory(): InjectableStepsFactory {
        return InstanceStepsFactory(configuration(), GoogleSteps())
    }

    override fun storyPaths(): List<String> {
        return Arrays.asList("stories/Google.story")
    }
}
