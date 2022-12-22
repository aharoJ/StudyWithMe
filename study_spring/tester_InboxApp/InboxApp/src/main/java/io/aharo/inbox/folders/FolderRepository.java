package io.aharo.inbox.folders;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository                                                     
public interface FolderRepository extends CassandraRepository<Folder,String>    // map folder first, then userID ( anything primary )
{

    
}
