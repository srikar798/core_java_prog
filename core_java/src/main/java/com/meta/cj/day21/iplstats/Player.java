package com.meta.cj.day21.iplstats;

import com.fasterxml.jackson.annotation.JsonProperty;

record Player(String name, String role, @JsonProperty("team_name") String teamName, double amount){

}
