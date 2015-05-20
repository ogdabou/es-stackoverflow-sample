package test.es.sample.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "my_index_01", type = "tweets")
public class Tweet
{
	
	public Tweet()
	{
		// TODO Auto-generated constructor stub
	}
	
	@Id
	private String idStr;
	
	@Field(type = FieldType.String)
	private String text;
	
	public String getIdStr()
	{
		return idStr;
	}
	
	public void setIdStr(final String idStr)
	{
		this.idStr = idStr;
	}
	
	public String getText()
	{
		return text;
	}
	
	public void setText(final String text)
	{
		this.text = text;
	}
	
	@Override
	public String toString()
	{
		return "{ id_str : " + idStr + " }";
	}
}
