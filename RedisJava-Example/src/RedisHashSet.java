import java.time.LocalDate;
import java.util.*;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.Protocol;
public class RedisHashSet {
	 
	static JedisPool jedisPool;
	public static void main(String[] args) {
		Jedis jedis = new Jedis("127.0.0.1");
		
		Map<String, String> hash = new HashMap<String, String>();
		hash.put("name", "Durga");
		hash.put("password", "password");
		hash.put("secret", "Nothing");
		hash.put("created", LocalDate.now().toString());
		jedis.hmset("id", hash);
		System.out.println(jedis.hmget("id","name"));
	
	}


	
	
}


