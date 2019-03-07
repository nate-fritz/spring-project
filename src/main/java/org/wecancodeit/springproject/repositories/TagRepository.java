package org.wecancodeit.springproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wecancodeit.springproject.models.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {

	Tag findByTagLabel(String tagLabel);
}
