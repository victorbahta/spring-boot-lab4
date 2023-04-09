package miu.edu.waa_lab1.repository;

import miu.edu.waa_lab1.domain.Logger;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LoggerRepo extends CrudRepository<Logger,Long> {
    Logger save(Logger logger);
}
