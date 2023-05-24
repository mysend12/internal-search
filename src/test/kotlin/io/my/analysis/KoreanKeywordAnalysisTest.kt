package io.my.analysis

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class KoreanKeywordAnalysisTest {

    @Test
    fun analysisTest() {
        val analysis : KoreanKeywordAnalysis = NoriAnalysis()

        val keyword = "짜장면이랑 짬뽕이랑 뭐가 더 맛있을까요?"
        val result = analysis.analysis(keyword)

        Assertions.assertTrue(result.startsWith(keyword))
        Assertions.assertTrue(result.length > keyword.length)
    }

}