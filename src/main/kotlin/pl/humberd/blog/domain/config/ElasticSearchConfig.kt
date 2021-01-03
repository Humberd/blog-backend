package pl.humberd.blog.domain.config

import org.elasticsearch.client.RestHighLevelClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.elasticsearch.client.ClientConfiguration
import org.springframework.data.elasticsearch.client.RestClients
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration

@Configuration
class ElasticSearchConfig(
    @Value("\${elasticsearch.url}") private val elasticsearchUrl: String
) : AbstractElasticsearchConfiguration() {

    @Bean
    override fun elasticsearchClient(): RestHighLevelClient {
        return ClientConfiguration.builder()
            .connectedTo(elasticsearchUrl)
            .build()
            .let {
                RestClients.create(it).rest()
            }
    }
}
