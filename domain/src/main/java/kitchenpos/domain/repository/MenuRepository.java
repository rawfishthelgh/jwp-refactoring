package kitchenpos.domain.repository;

import kitchenpos.domain.menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    Long countByIdIn(List<Long> ids);
}
