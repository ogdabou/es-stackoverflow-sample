package test.es.sample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import test.es.sample.model.Tweet;
import test.es.sample.repository.EsTweetRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class AppTest
{
	
	@Autowired
	EsTweetRepository tweetRepository;
	
	//	@Autowired
	//	ITagServices tagServices;
	
	private MockMvc mockMvc;
	
	@Before
	public void init()
	{
		
	}
	
	@Test
	public void shouldReturnATweet()
	{
		
		// this returns null
		final Tweet tweet1 = tweetRepository.findOne("5.9389769123238298E17");
		
		if (tweet1 != null)
		{
			System.out.println("Found " + tweet1);
		}
		
		// this returns the right number
		System.out.println("Count is " + tweetRepository.count());
	}
	
	@Test
	public void shouldReturnAllTweets()
	{
		
		final Tweet t = tweetRepository.findByIdStr("593897660559523840");
		
		System.out.println(t);
		
		// this returns the right number
		System.out.println("Count is " + tweetRepository.count());
		
	}
}
