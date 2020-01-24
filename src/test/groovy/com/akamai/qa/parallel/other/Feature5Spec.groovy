package com.akamai.qa.parallel.other

import com.akamai.qa.parallel.categories.OtherParallelTest
import org.junit.experimental.categories.Category
import spock.lang.Specification

class Feature5Spec extends Specification {

    @Category(OtherParallelTest)
    def "Test1"() {
        when:
            def sum = 2 + 2
        and:
            Thread.sleep(10000)
        then:
            assert sum == 4
    }
}
