package com.meta.cj.day26.iplstats;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
public class Player {
    private String name;
    private String role;
    @JsonProperty("team_name")
    private String teamName;
    private double amount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player player)) return false;
        return Double.compare(getAmount(), player.getAmount()) == 0 && Objects.equals(getName(), player.getName()) && Objects.equals(getRole(), player.getRole()) && Objects.equals(getTeamName(), player.getTeamName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRole(), getTeamName(), getAmount());
    }
}

