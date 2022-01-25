package rifqimuhammadaziz.test.repository;

import rifqimuhammadaziz.test.data.Person;

public interface PersonRepository {

    Person selectById(String id);

}
