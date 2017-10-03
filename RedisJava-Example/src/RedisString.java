import redis.clients.jedis.Jedis;
public class RedisString {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("127.0.0.1");
		jedis.set("str", "hello");
		System.out.println(jedis.get("str"));
	}

}
