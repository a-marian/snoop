package ar.com.snoop.repository;

/**
 * Created by root on 18/07/15.
 */
import ar.com.snoop.model.WorkSpace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkSpaceRepository extends JpaRepository<WorkSpace, Long> {

}