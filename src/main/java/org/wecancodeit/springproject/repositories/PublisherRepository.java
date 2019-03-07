package org.wecancodeit.springproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.springproject.models.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
