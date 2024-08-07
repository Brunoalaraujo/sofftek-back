package sofftekback.models;

import java.time.LocalDateTime;
import sofftekback.utils.*;

public class Incident {
    private int cdIncident;
    private int cdUser;
    private String description;
    private String status;
    private String priority;
    private LocalDateTime createdAt;
    private LocalDateTime resolvedAt;
    private String comments;

    public Incident(int cdIncident, int cdUser, String description, String status, String priority, LocalDateTime createdAt, String comments) {
        this.cdIncident = cdIncident;
        this.cdUser = cdUser;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.createdAt = createdAt;
        this.comments = comments;
    }

    public Incident() {

    }

    public int getCdIncident() {
        return cdIncident;
    }

    public Incident setCdIncident(int cdIncident) {
        this.cdIncident = cdIncident;
        return this;
    }

    public int getCdUser() {
        return cdUser;
    }

    public Incident setCdUserIncident(int cdUser) {
        this.cdUser = cdUser;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Incident setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Incident setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getPriority() {
        return priority;
    }

    public Incident setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Incident setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LocalDateTime getResolvedAt() {
        return resolvedAt;
    }

    public Incident setResolvedAt(LocalDateTime resolvedAt) {
        this.resolvedAt = resolvedAt;
        return this;
    }

    public String getComments() {
        return comments;
    }

    public Incident setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public Incident getIncident() {
        System.out.println("Código do Incidente: " + cdIncident);
        System.out.println("Código do Usuário: " + cdUser);
        System.out.println("Descrição do Incidente: " + description);
        System.out.println("Status do Incidente: " + status);
        System.out.println("Prioridade do Incidente: " + priority);
        System.out.println("Comentários do Incidente: " + comments);
        System.out.println("Criado em: " + Utils.FormatData(createdAt));
        System.out.println(" ");
        return this;
    }

}
