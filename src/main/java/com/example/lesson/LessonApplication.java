package com.example.lesson;

import com.example.lesson.entity.ProductRecord;
import com.example.lesson.service.PgProductService;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LessonApplication {

	public static void main(String[] args) {
		SpringApplication.run(LessonApplication.class, args);

		ConfigurableApplicationContext context =
				SpringApplication.run(LessonApplication.class, args);

		PgProductService pgProductService = context.getBean(PgProductService.class);

		// 全体表示
//		var list = pgProductService.findAll();
//		list.stream().forEach(System.out::println);

		// ID検索
//		var user = pgProductService.findById(101);
//		System.out.println(user);

		// 挿入
//		var newUser = new ProductRecord(104,"ボールペン",150);
//		pgProductService.insert(newUser);
//		var user = pgProductService.findById(104);
//		System.out.println(user);

		// 更新
//		var updateUser = new ProductRecord(104,"ボールペン",150);
//		pgProductService.update(updateUser);
//		var list = pgProductService.findAll();
//		list.stream().forEach(System.out::println);

		// 削除
		pgProductService.delete(104);
		var list = pgProductService.findAll();
		list.stream().forEach(System.out::println);

	}

}
