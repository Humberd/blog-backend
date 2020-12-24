package pl.humberd.blog.application.analytics.events

sealed class AnalyticEvent(
    val type: String,
    val timestamp: Long
) {
    data class PageViewEvent(
        val userId: String,
        val url: String,
        val referrer: String,
        private val _timestamp: Long
    ): AnalyticEvent("page-view", _timestamp)

    data class PageScrollEvent(
        val userId: String,
        val url: String,
        val referrer: String,
        val breakpoint: Int,
        private val _timestamp: Long
    ): AnalyticEvent("page-scroll", _timestamp)
}
