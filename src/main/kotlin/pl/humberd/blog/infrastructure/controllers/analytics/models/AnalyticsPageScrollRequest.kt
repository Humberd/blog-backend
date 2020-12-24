package pl.humberd.blog.infrastructure.controllers.analytics.models

data class AnalyticsPageScrollRequest(
    val userId: String,
    val sessionId: String,
    val viewId: String,
    val url: String,
    val referrer: String,
    val breakpoint: Int
)
