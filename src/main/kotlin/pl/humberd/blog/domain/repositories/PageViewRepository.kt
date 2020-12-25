package pl.humberd.blog.domain.repositories

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository
import org.springframework.stereotype.Repository
import pl.humberd.blog.domain.models.PageViewEntity

@Repository
interface PageViewRepository : ElasticsearchRepository<PageViewEntity, String>{
}
