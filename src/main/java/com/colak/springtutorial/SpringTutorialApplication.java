package com.colak.springtutorial;

import com.colak.springtutorial.jpa.Device;
import com.colak.springtutorial.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTutorialApplication implements CommandLineRunner {

    private DeviceService deviceService;

    @Autowired
    public void setDeviceService(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringTutorialApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Device device = new Device();
        device.setName("device1");

        deviceService.create(device);
    }
}
