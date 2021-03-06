package ru.job4j.model;

import java.util.Objects;

public class AccountTicket {
    private int id;
    private int accountId;
    private int ticketId;

    public AccountTicket(int ticketId) {
        this.ticketId = ticketId;
    }

    public AccountTicket(int id, int accountId, int ticketId) {
        this.id = id;
        this.accountId = accountId;
        this.ticketId = ticketId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountTicket that = (AccountTicket) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
