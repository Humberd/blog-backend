package pl.humberd.blog.application.analytics

import org.springframework.stereotype.Service
import pl.humberd.blog.application.analytics.events.AnalyticEvent
//import pl.humberd.blog.domain.models.PageScrollEntity
//import pl.humberd.blog.domain.models.PageViewEntity
//import pl.humberd.blog.domain.repositories.PageScrollRepository
//import pl.humberd.blog.domain.repositories.PageViewRepository
//import java.util.*

@Service
class AnalyticsService(
//    private val pageViewRepository: PageViewRepository,
//    private val pageScrollRepository: PageScrollRepository
) {

    fun registerEvent(event: AnalyticEvent.PageViewEvent) {
        println(event)
//        pageViewRepository.save(
//            PageViewEntity(
//                id = UUID.randomUUID().toString(),
//                timestamp = event.timestamp,
//                userId = event.userId,
//                sessionId = event.sessionId,
//                viewId = event.viewId,
//                url = event.url,
//                referrer = event.referrer
//            )
//        )
    }

    fun registerEvent(event: AnalyticEvent.PageScrollEvent) {
        println(event)
//        pageScrollRepository.save(
//            PageScrollEntity(
//                id = UUID.randomUUID().toString(),
//                timestamp = event.timestamp,
//                userId = event.userId,
//                sessionId = event.sessionId,
//                viewId = event.viewId,
//                url = event.url,
//                referrer = event.referrer,
//                breakpoint = event.breakpoint
//            )
//        )
    }
}
