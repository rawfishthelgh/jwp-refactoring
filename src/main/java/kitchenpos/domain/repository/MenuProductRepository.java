package kitchenpos.domain.repository;

import kitchenpos.domain.menu.MenuProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuProductRepository extends JpaRepository<MenuProduct, Long> {
}
