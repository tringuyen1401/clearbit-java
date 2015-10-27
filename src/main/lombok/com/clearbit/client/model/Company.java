package com.clearbit.client.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Company {

  @JsonProperty String id;
  @JsonProperty String name;
  @JsonProperty String legalName;
  @JsonProperty String domain;
  @JsonProperty List<String> domainAliases;
  @JsonProperty Site site;
  @JsonProperty List<String> tags;
  @JsonProperty Category category;
  @JsonProperty String description;
  @JsonProperty Geo geo;
  @JsonProperty Metrics metrics;
  @JsonProperty Facebook facebook;
  @JsonProperty LinkedIn linkedin;
  @JsonProperty Twitter twitter;
  @JsonProperty AngelList angellist;
  @JsonProperty Crunchbase crunchbase;
  @JsonProperty String logo;
  @JsonProperty Boolean emailProvider;
  @JsonProperty String type;
  @JsonProperty String phone;
  @JsonProperty List<String> tech;

  @Data
  private static class Site {
    @JsonProperty String url;
    @JsonProperty String title;
  }

  @Data
  private static class Category {
    @JsonProperty String sector;
    @JsonProperty String industryGroup;
    @JsonProperty String industry;
    @JsonProperty String subIndustry;
  }

  @Data
  private static class Geo {
    @JsonProperty String streetNumber;
    @JsonProperty String streetName;
    @JsonProperty String subPremise;
    @JsonProperty String city;
    @JsonProperty String state;
    @JsonProperty String stateCode;
    @JsonProperty String postalCode;
    @JsonProperty String country;
    @JsonProperty String countryCode;
    @JsonProperty String lat;
    @JsonProperty String lng;
  }

  @Data
  private static class Metrics {
    @JsonProperty Long raised;
    @JsonProperty Long googleRank;
    @JsonProperty Long alexaUsRank;
    @JsonProperty Long alexaGlobalRank;
    @JsonProperty Long employees;
    @JsonProperty Long marketCap;
  }
  
  @Data
  private static class Facebook {
    @JsonProperty String handle;
  }

  @Data
  private static class LinkedIn {
    @JsonProperty String handle;
  }

  @Data
  private static class Twitter {
    @JsonProperty String handle;
    @JsonProperty String id;
    @JsonProperty String bio;
    @JsonProperty Long followers;
    @JsonProperty Long following;
    @JsonProperty String location;
    @JsonProperty String site;
    @JsonProperty String avatar;
  }

  @Data
  private static class AngelList {
    @JsonProperty String handle;
    @JsonProperty String bio;
    @JsonProperty String blog;
    @JsonProperty String site;
    @JsonProperty Long followers;
    @JsonProperty String avatar;
  }

  @Data
  private static class Crunchbase {
    @JsonProperty String handle;
  }
}
