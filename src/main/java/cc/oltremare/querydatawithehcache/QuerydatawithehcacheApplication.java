package cc.oltremare.querydatawithehcache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("cc.oltremare.querydatawithehcache.mapper")
public class QuerydatawithehcacheApplication {
	public static void main(String[] args) {
		SpringApplication.run(QuerydatawithehcacheApplication.class, args);
	}
}
