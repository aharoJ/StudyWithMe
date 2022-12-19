package io.aharo.betterreadsdataloader.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface AuthorRepository extends CassandraRepository<Author, String> // Generic type ~> return type 
{


}
