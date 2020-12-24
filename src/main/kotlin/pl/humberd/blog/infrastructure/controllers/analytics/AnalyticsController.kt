package pl.humberd.blog.infrastructure.controllers.analytics

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import pl.humberd.blog.application.analytics.AnalyticsService
import pl.humberd.blog.application.analytics.events.AnalyticEvent
import pl.humberd.blog.infrastructure.controllers.analytics.models.AnalyticsPageScrollRequest
import pl.humberd.blog.infrastructure.controllers.analytics.models.AnalyticsPageViewRequest
import java.time.Instant

@RestController
class AnalyticsController(
    private val analyticsService: AnalyticsService
) {

    @PostMapping("/xyz/page-view")
    fun pageView(@RequestBody body: AnalyticsPageViewRequest) {
        analyticsService.registerEvent(
            AnalyticEvent.PageViewEvent(
                userId = body.userId,
                url = body.userId,
                referrer = body.referrer,
                _timestamp = Instant.now().toEpochMilli()
            )
        )
    }

    @PostMapping("/xyz/page-scroll")
    fun pageScroll(@RequestBody body: AnalyticsPageScrollRequest) {
        analyticsService.registerEvent(
            AnalyticEvent.PageScrollEvent(
                userId = body.userId,
                url = body.userId,
                referrer = body.referrer,
                breakpoint = body.breakpoint,
                _timestamp = Instant.now().toEpochMilli()
            )
        )
    }
}
