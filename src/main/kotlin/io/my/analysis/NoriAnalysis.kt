package io.my.analysis

import org.apache.lucene.analysis.ko.KoreanAnalyzer
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute
import org.springframework.stereotype.Component
import java.lang.StringBuilder

@Component
class NoriAnalysis : KoreanKeywordAnalysis {
    private val analysis =  KoreanAnalyzer()

    override fun analysis(keyword: String): String {
        val tokenStream = analysis.tokenStream(null, keyword)
        tokenStream.reset()

        val attribute = tokenStream.addAttribute(CharTermAttribute::class.java)

        val stringBuilder = StringBuilder()

        stringBuilder.append(keyword).append(' ')
        while (tokenStream.incrementToken()) {
            stringBuilder.append(attribute.toString()).append(' ')
        }

        tokenStream.close()
        return stringBuilder.toString()
    }
}