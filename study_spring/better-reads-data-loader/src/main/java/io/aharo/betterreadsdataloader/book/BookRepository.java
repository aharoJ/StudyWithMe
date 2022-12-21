package io.aharo.betterreadsdataloader.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface BookRepository extends CassandraRepository<Book, String> // Fetch Entity(Book) && id for book is a String
{


}
