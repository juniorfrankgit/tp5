package fr.uga.server;

import java.util.List;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
	      //Connecting to Redis server on localhost
	      Jedis jedis = new Jedis("localhost");
	      System.out.println("Connection to server sucessfully");
	      //store data in redis list
	      jedis.lpush("tutorial-list", "Redis");
	      jedis.lpush("tutorial-list", "Mongodb");
	      jedis.lpush("tutorial-list", "Mysql");
	     // Get the stored data and print it
	     List<String> list = jedis.lrange("tutorial-list", 0 ,5);
	     for(int i=0; i<list.size(); i++) {
	       System.out.println("Stored string in redis:: "+list.get(i));
	     }
	 }
}
