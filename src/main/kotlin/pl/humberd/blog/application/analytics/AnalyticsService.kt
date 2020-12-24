package pl.humberd.blog.application.analytics

import org.springframework.stereotype.Service
import pl.humberd.blog.application.analytics.events.AnalyticEvent

@Service
class AnalyticsService {

    fun registerEvent(event: AnalyticEvent) {
        println(event)
    }
}
