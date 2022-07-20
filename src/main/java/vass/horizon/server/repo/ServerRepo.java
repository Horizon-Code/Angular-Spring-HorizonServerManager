package vass.horizon.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import vass.horizon.server.model.Server;

//jpa is JAVA PERSISTENCE API
//it contains the full crud repo and pagingandsorting repo
//#####################################
// jpa receives 2 args.
// 1. the model we want to manage
// 2. type of primery key
public interface ServerRepo extends JpaRepository<Server,Long> {
    Server findByIpAdress(String ipAdress);
}
