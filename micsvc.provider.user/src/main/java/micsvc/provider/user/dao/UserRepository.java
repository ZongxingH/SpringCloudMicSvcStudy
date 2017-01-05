package micsvc.provider.user.dao;

import micsvc.provider.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Introduction:  [Simple Introduction of the java documents]
 * Package Name:  micsvc.provider.user.dao
 * Project Name:  SpringCloudMicSvcStudy
 * Author:  ZongxingH
 * Create Time:  2017/1/5 11:07
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
