package pl.humberd.blog.infrastructure.controllers.analytics.models

data class AnalyticsPageViewRequest(
    val userId: String,
    val url: String,
    val referrer: String
)
