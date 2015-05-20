package test.es.sample.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import test.es.sample.model.Tweet;

public interface EsTweetRepository extends ElasticsearchRepository<Tweet, String>
{
	Tweet findByIdStr(String idStr);
}
