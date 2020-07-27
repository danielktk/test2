package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by rudan on 06/06/2020.
 */
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@WebMvcTest(Solution.class)
class SolutionTest {

    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(solution.solution("asdfsdf"), 0);
    }

}