import redis.clients.jedis.Jedis;
public class RedisList {
	

	public static void main(String[] args) {
		Jedis jedis = new Jedis("127.0.0.1");
		jedis.lpush("list", "hello");
		jedis.lpush("list", "Hi");
		jedis.lpush("list", "bye");
		for(int i=0; i<5; i++)
			jedis.lpush("list", ""+i+"");
		for(String str : jedis.lrange("list", 0, 9))
			System.out.println(str);
	}

}
