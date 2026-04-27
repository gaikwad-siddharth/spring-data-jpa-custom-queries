package in.siddharth;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.siddharth.entity.Book;
import in.siddharth.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(Application.class, args);
		BookRepository repo = context.getBean(BookRepository.class);
		
		/*List<Book> books = repo.findByBookName("Spring");
		for(Book b : books) {
			System.out.println(b);
		}*/
		
		
		/*List<Book> books = repo.findByBookPriceGreaterThan(300.00);
		for(Book b : books) {
			System.out.println(b);
		}*/
		
		
		/*List<Book> books = repo.getAllBooks();
		for(Book b : books) {
			System.out.println(b);
		}*/
		
		
		List<Book> books = repo.getBasedPrice();
		for(Book b : books) {
			System.out.println(b);
        }
		
	}
}
