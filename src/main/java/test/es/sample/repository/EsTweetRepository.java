package test.es.sample.repository;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import test.es.sample.model.Tweet;

public interface EsTweetRepository extends ElasticsearchRepository<Tweet, String>
{
	@Query("{\"bool\" : {\"must\" : {\"term\" : {\"id_str\" : \"?0\"}}}}")
	Tweet findByIdStr(String idStr);
}
