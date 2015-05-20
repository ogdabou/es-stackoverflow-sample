package test.es.sample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "my_index_01", type = "tweets")
public class Tweet
{
	// Elasticsearch object internal id. Look at field "_id"
	@Id
	private String id;
	
	// Twitter internal id, saved under the "id_str" field
	@Field(type = FieldType.String)
	private String id_str;
	
	@Field(type = FieldType.String)
	private String text;
	
	public String getId_str()
	{
		return id_str;
	}
	
	public void setId_str(final String id_str)
	{
		this.id_str = id_str;
	}
	
	public String getText()
	{
		return text;
	}
	
	public void setText(final String text)
	{
		this.text = text;
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(final String id)
	{
		this.id = id;
	}
	
	@Override
	public String toString()
	{
		return "{ _id : " + id + ", id_str :  " + id_str + ", text : " + text + " }";
	}
}
