package com.technakal.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

  @Autowired
  @Qualifier("happyFortuneService")
  private FortuneService fortuneService;
  
  public TennisCoach() {
    System.out.println(">> TennisCoach: inside default constructor");
  }
  
  @Override
  public String getDailyWorkout() {
    return "Work on that backhand volley!";
  }

  @Override
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
  
  @PostConstruct
  public void doMyStartupStuff() {
    System.out.println(">> TennisCoach: doing initialization lifecycle method code.");
  }
  
  @PreDestroy
  public void doMyCleanupStuff() {
    System.out.println(">> TennisCoach: doing pre-destroy lifecycle method code.");
  }

}
