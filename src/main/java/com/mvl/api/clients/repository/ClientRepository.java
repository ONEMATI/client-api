package com.mvl.api.clients.repository;

import com.mvl.api.clients.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
