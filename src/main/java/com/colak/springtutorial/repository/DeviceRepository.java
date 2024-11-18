package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
