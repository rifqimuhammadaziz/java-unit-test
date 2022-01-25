package rifqimuhammadaziz.test.mock.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import rifqimuhammadaziz.test.data.Person;
import rifqimuhammadaziz.test.repository.PersonRepository;
import rifqimuhammadaziz.test.service.PersonService;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);
    }

    @Test
    void testGetPersonNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personService.get("not found");
        });
    }

    @Test void testGetPersonSuccess() {
        // add behavior to mock object
        Mockito.when(personRepository.selectById("xenosty"))
                .thenReturn(new Person("xenosty", "Xenosty"));

        var person = personService.get("xenosty");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("xenosty", person.getId());
        Assertions.assertEquals("Xenosty", person.getName());
    }
}
