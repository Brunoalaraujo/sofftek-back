package softtekback.models;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

import static softtekback.utils.Utils.FormatDate;

public class Ticket {
    private static final AtomicInteger idCounter = new AtomicInteger(0);

    private final int cdTicket = idCounter.incrementAndGet();
    private final LocalDateTime createdAt = LocalDateTime.now();
    private final int cdIssuer;
    private String title;
    private String description;
    private TicketStatus status = TicketStatus.OPEN;
    private TicketPriority priority;
    private LocalDateTime updatedAt;
    private LocalDateTime resolvedAt;
    private int cdResolver;
    private String comments;

    public Ticket(int cdIssuer, String title, String description, TicketPriority priority) {
        this.cdIssuer = cdIssuer;
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public Ticket(int cdIssuer) {
        this.cdIssuer = cdIssuer;
    }

    public int getCdTicket() {
        return cdTicket;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public TicketPriority getPriority() {
        return priority;
    }

    public void setPriority(TicketPriority priority) {
        this.priority = priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getResolvedAt() {
        return resolvedAt;
    }

    public void setResolvedAt(LocalDateTime resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    public int getCdIssuer() {
        return cdIssuer;
    }

    public int getCdResolver() {
        return cdResolver;
    }

    public void setCdResolver(int cdResolver) {
        this.cdResolver = cdResolver;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public TicketPriority getPriorityName(int code) {
        if (code == 1) return TicketPriority.HIGH;
        if (code == 2) return TicketPriority.MEDIUM;
        else return TicketPriority.LOW;
    }

    public TicketStatus getStatusName(int code) {
        if (code == 2) return TicketStatus.IN_PROGRESS;
        if (code == 1) return TicketStatus.CLOSED;
        else return TicketStatus.OPEN;
    }

    @Override
    public String toString() {
        return "Ticket {" +
                "cdTicket=" + cdTicket +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", priority=" + priority +
                ", createdAt=" + FormatDate(createdAt) +
                '}';
    }
}
