package shawn_cheng.model;

import shawn_cheng.controller.ManageAppointmentController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Appointment {
    private int appointmentId;
    private Customer customer;
    public String title;
    private String description;
    private String location;
    private String contact;
    private String url;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private final LocalDateTime endOfDayLocalDateTime;

    public Appointment () {
        LocalTime midnight = LocalTime.MIDNIGHT;
        LocalDate today = LocalDate.now();
        endOfDayLocalDateTime = LocalDateTime.of(today, midnight);
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    @Override
    public String toString() {
        return this.title;
    }

    public static String validateInput(ManageAppointmentController controller) {
        System.out.println("Checking Appointment input");
        String errorMessage = "";

        if (controller.titleField.getText().equals("")) {
            errorMessage += "Invalid title\n";
        }
        if (controller.descriptionField.getValue() == null || controller.descriptionField.getValue().equals("")) {
            errorMessage += "Invalid description\n";
        }
        if (controller.customerField.getValue() == null || controller.customerField.getValue().equals("")) {
            errorMessage += "Invalid customer\n";
        }
        if (controller.startTimeField.getValue() == null) {
            errorMessage += "Invalid start time\n";
        }
        if (controller.endTimeField.getValue() == null) {
            errorMessage += "Invalid end time\n";
        }
        if (controller.dateField.getValue() == null) {
            errorMessage += "Invalid date";
        }
        return errorMessage;
    }
}