package com.akamai.qa.parallel

import com.akamai.qa.parallel.categories.ParallelTest
import org.junit.experimental.categories.Category
import spock.lang.Specification

class Feature1Spec extends Specification {

    @Category(ParallelTest)
    def "Test1"() {
        when:
            def sum = 2 + 2
        and:
            Thread.sleep(10000)
        then:
            assert sum == 4
    }
}
