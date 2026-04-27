package in.siddharth.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.siddharth.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
	//FindBy methods
	public List<Book> findByBookPriceGreaterThan(Double price);
	
	public List<Book> findByBookPriceLessThan(Double price);
	
	public List<Book> findByBookName(String Name);
	
	//customQuery
	@Query(value="SELECT * FROM BOOK", nativeQuery = true)
	public List<Book> getAllBooks();
	
	//HQL Query
	@Query(value="from Book where bookPrice = 900")
	public List<Book>getBasedPrice();
	
	@Query(value="select bookName from Book")
	public List<Book>getName();

}
